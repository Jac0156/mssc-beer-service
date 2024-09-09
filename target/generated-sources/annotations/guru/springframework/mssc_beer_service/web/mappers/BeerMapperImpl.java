package guru.springframework.mssc_beer_service.web.mappers;

import guru.springframework.mssc_beer_service.domain.Beer;
import guru.springframework.mssc_beer_service.web.model.BeerDto;
import guru.springframework.mssc_beer_service.web.model.BeerStyleEnum;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-09T11:24:32-0400",
    comments = "version: 1.6.0, compiler: Eclipse JDT (IDE) 3.39.0.v20240820-0604, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Autowired
    private DateMapper dateMapper;

    @Override
    public BeerDto BeerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDto.BeerDtoBuilder beerDto = BeerDto.builder();

        beerDto.beerName( beer.getBeerName() );
        if ( beer.getBeerStyle() != null ) {
            beerDto.beerStyle( Enum.valueOf( BeerStyleEnum.class, beer.getBeerStyle() ) );
        }
        beerDto.createdDate( dateMapper.asOffsetDateTime( beer.getCreatedDate() ) );
        beerDto.id( beer.getId() );
        beerDto.lastModifiedDate( dateMapper.asOffsetDateTime( beer.getLastModifiedDate() ) );
        beerDto.price( beer.getPrice() );
        if ( beer.getUpc() != null ) {
            beerDto.upc( Long.parseLong( beer.getUpc() ) );
        }
        if ( beer.getVersion() != null ) {
            beerDto.version( beer.getVersion().intValue() );
        }

        return beerDto.build();
    }

    @Override
    public Beer BeerDtoToBeer(BeerDto beerDto) {
        if ( beerDto == null ) {
            return null;
        }

        Beer.BeerBuilder beer = Beer.builder();

        beer.beerName( beerDto.getBeerName() );
        if ( beerDto.getBeerStyle() != null ) {
            beer.beerStyle( beerDto.getBeerStyle().name() );
        }
        beer.createdDate( dateMapper.asTimestamp( beerDto.getCreatedDate() ) );
        beer.id( beerDto.getId() );
        beer.lastModifiedDate( dateMapper.asTimestamp( beerDto.getLastModifiedDate() ) );
        beer.price( beerDto.getPrice() );
        if ( beerDto.getUpc() != null ) {
            beer.upc( String.valueOf( beerDto.getUpc() ) );
        }
        if ( beerDto.getVersion() != null ) {
            beer.version( beerDto.getVersion().longValue() );
        }

        return beer.build();
    }
}