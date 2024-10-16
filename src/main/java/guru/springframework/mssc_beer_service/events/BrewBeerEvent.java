package guru.springframework.mssc_beer_service.events;

import guru.springframework.mssc_beer_service.web.model.BeerDto;

public class BrewBeerEvent extends BeerEvent{

    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }

}
