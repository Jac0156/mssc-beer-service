package guru.springframework.mssc_beer_service.services;

import java.util.UUID;

import guru.springframework.mssc_beer_service.web.model.BeerDto;
import jakarta.validation.Valid;

public interface BeerService {

    BeerDto getById(UUID beerID);

    BeerDto saveNewBeer(@Valid BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, @Valid BeerDto beerDto);

}
