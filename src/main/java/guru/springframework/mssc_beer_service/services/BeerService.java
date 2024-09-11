package guru.springframework.mssc_beer_service.services;

import java.util.UUID;

import guru.springframework.mssc_beer_service.web.model.BeerDto;

public interface BeerService {

    BeerDto getById(UUID beerID);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

}
