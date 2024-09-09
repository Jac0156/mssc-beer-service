package guru.springframework.mssc_beer_service.web.mappers;

import org.mapstruct.Mapper;

import guru.springframework.mssc_beer_service.domain.Beer;
import guru.springframework.mssc_beer_service.web.model.BeerDto;

@Mapper(uses = { DateMapper.class })
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto beerDto);
    
}
