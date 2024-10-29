package guru.springframework.mssc_beer_service.bootstrap;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.sfg.brewery.model.BeerStyleEnum;
import guru.springframework.mssc_beer_service.domain.Beer;
import guru.springframework.mssc_beer_service.repositories.BeerRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class BeerLoader implements CommandLineRunner {

    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    public static final String BEER_3_UPC = "0083783375213";

    private final BeerRepository beerRepository;

    @Override
    public void run(String... args) throws Exception {

        if (beerRepository.count() == 0) {
            loadInitialBeer();
        }

        System.out.println("Nbr beers in BD: " + beerRepository.count());
    }

    private void loadInitialBeer(){
        Beer b1 = Beer
                .builder()
                .beerName("Mango Bobs")
                .beerStyle(BeerStyleEnum.IPA.name())
                .minOnHand(12)
                .quantityToBrew(200)
                .price(new BigDecimal (12.95))
                .upc(BEER_1_UPC)
                .version(1L)
                .build();

        Beer b2 = Beer
                .builder()
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.PALE_ALE.name())
                .minOnHand(12)
                .quantityToBrew(200)
                .price(new BigDecimal (11.95))
                .upc(BEER_2_UPC)
                .version(1L)
                .build();

        Beer b3 = Beer
                .builder()
                .beerName("Pinball Porter")
                .beerStyle(BeerStyleEnum.PORTER.name())
                .minOnHand(12)
                .quantityToBrew(200)
                .price(new BigDecimal (10.95))
                .upc(BEER_3_UPC)
                .version(1L)
                .build();

        beerRepository.save(b1);
        beerRepository.save(b2);
        beerRepository.save(b3);
    }


}