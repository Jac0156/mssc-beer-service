package guru.springframework.mssc_beer_service.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.mssc_beer_service.domain.Beer;
import guru.springframework.mssc_beer_service.repositories.BeerRepository;
import guru.springframework.mssc_beer_service.web.controller.NotFoundException;
import guru.springframework.mssc_beer_service.web.mappers.BeerMapper;
import guru.springframework.mssc_beer_service.web.model.BeerDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service("beerService")
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public BeerDto getById(UUID beerID) {
        return beerMapper.beerToBeerDto(
            beerRepository.findById(beerID).orElseThrow(NotFoundException::new)
            );
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return beerMapper.beerToBeerDto(beerRepository.save(beerMapper.beerDtoToBeer(beerDto)));
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        Beer beer = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);

        beer.setBeerName(beerDto.getBeerName());
        beer.setBeerStyle(beerDto.getBeerStyle().name());
        beer.setPrice(beerDto.getPrice());
        beer.setUpc(beerDto.getUpc());

        return beerMapper.beerToBeerDto(beerRepository.save(beer));
    }

}
