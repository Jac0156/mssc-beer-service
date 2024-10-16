package guru.springframework.mssc_beer_service.events;

import guru.springframework.mssc_beer_service.web.model.BeerDto;

public class NewInventoryEvent extends BeerEvent {

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }

}
