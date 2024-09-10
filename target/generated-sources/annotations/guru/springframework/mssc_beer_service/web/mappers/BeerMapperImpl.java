package guru.springframework.mssc_beer_service.web.mappers;

import guru.springframework.mssc_beer_service.domain.Beer;
import guru.springframework.mssc_beer_service.web.model.BeerDto;
import guru.springframework.mssc_beer_service.web.model.BeerStyleEnum;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-10T15:21:14-0400",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
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

        beerDto.id( beer.getId() );
        if ( beer.getVersion() != null ) {
            beerDto.version( beer.getVersion().intValue() );
        }
        beerDto.createdDate( dateMapper.asOffsetDateTime( beer.getCreatedDate() ) );
        beerDto.lastModifiedDate( dateMapper.asOffsetDateTime( beer.getLastModifiedDate() ) );
        beerDto.beerName( beer.getBeerName() );
        if ( beer.getBeerStyle() != null ) {
            beerDto.beerStyle( Enum.valueOf( BeerStyleEnum.class, beer.getBeerStyle() ) );
        }
        if ( beer.getUpc() != null ) {
            beerDto.upc( Long.parseLong( beer.getUpc() ) );
        }
        beerDto.price( beer.getPrice() );

        return beerDto.build();
    }

    @Override
    public Beer BeerDtoToBeer(BeerDto beerDto) {
        if ( beerDto == null ) {
            return null;
        }

        Beer.BeerBuilder beer = Beer.builder();

        beer.id( beerDto.getId() );
        if ( beerDto.getVersion() != null ) {
            beer.version( beerDto.getVersion().longValue() );
        }
        beer.createdDate( dateMapper.asTimestamp( beerDto.getCreatedDate() ) );
        beer.lastModifiedDate( dateMapper.asTimestamp( beerDto.getLastModifiedDate() ) );
        beer.beerName( beerDto.getBeerName() );
        if ( beerDto.getBeerStyle() != null ) {
            beer.beerStyle( beerDto.getBeerStyle().name() );
        }
        if ( beerDto.getUpc() != null ) {
            beer.upc( String.valueOf( beerDto.getUpc() ) );
        }
        beer.price( beerDto.getPrice() );

        return beer.build();
    }
}
