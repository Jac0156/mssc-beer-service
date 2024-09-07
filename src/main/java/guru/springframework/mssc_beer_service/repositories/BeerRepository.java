package guru.springframework.mssc_beer_service.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.mssc_beer_service.domain.Beer;

public interface BeerRepository extends JpaRepository<Beer, UUID>{

}
