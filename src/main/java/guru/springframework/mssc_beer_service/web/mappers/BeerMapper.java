package guru.springframework.mssc_beer_service.web.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import guru.springframework.mssc_beer_service.domain.Beer;
import guru.springframework.mssc_beer_service.web.model.BeerDto;

@Mapper(uses = { DateMapper.class })
public interface BeerMapper {

    @Mapping( target = "quantityOnHand", ignore = true )
    BeerDto beerToBeerDto(Beer beer);

    @Mapping( target = "minOnHand", ignore = true)
    @Mapping( target = "quantityToBrew", ignore = true)
    Beer beerDtoToBeer(BeerDto beerDto);
    
}
