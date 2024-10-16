package guru.springframework.mssc_beer_service.events;

import java.io.Serializable;

import guru.springframework.mssc_beer_service.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable{

    static final long serialVersionUID = -53236223578941131L;

    private final BeerDto beerDto;

}
