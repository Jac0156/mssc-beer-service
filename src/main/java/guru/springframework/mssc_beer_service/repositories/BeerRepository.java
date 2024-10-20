package guru.springframework.mssc_beer_service.repositories;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.mssc_beer_service.domain.Beer;
import guru.springframework.mssc_beer_service.web.model.BeerStyleEnum;

public interface BeerRepository extends JpaRepository<Beer, UUID>{

    Page<Beer> findAllByBeerNameAndBeerStyle(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);

    Page<Beer> findAllByBeerName(String beerName, PageRequest pageRequest);

    Page<Beer> findAllByBeerStyle(BeerStyleEnum beerStyle, PageRequest pageRequest);

    Beer findByUpc(String upc);

}
