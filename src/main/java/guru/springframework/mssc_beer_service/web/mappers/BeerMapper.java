package guru.springframework.mssc_beer_service.web.mappers;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import guru.sfg.brewery.model.BeerDto;
import guru.springframework.mssc_beer_service.domain.Beer;

@Mapper(uses = { DateMapper.class })
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {
    @Mapping( target = "quantityOnHand", ignore = true )
    BeerDto beerToBeerDto(Beer beer);

    @Mapping(target = "quantityOnHand", ignore = true)
    BeerDto beerToBeerDtoWithInventory(Beer beer);

    @Mapping( target = "minOnHand", ignore = true)
    @Mapping( target = "quantityToBrew", ignore = true)
    Beer beerDtoToBeer(BeerDto beerDto);
    
}
