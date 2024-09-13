package guru.springframework.mssc_beer_service.services;

import java.util.UUID;

import org.springframework.data.domain.PageRequest;

import guru.springframework.mssc_beer_service.web.model.BeerDto;
import guru.springframework.mssc_beer_service.web.model.BeerPagedList;
import guru.springframework.mssc_beer_service.web.model.BeerStyleEnum;

public interface BeerService {

    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

    BeerDto getById(UUID beerID, Boolean showInventoryOnHand);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

}
