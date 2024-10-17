package guru.springframework.mssc_beer_service.events;

import java.io.Serializable;

import guru.springframework.mssc_beer_service.web.model.BeerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable{

    static final long serialVersionUID = -53236223578941131L;

    private BeerDto beerDto;

}
