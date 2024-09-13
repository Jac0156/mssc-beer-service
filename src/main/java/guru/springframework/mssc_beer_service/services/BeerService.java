package guru.springframework.mssc_beer_service.services;

import java.util.UUID;

import org.springframework.data.domain.PageRequest;

import guru.springframework.mssc_beer_service.web.model.BeerDto;
import guru.springframework.mssc_beer_service.web.model.BeerPagedList;
import guru.springframework.mssc_beer_service.web.model.BeerStyleEnum;

public interface BeerService {

    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);

    BeerDto getById(UUID beerID);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

}
