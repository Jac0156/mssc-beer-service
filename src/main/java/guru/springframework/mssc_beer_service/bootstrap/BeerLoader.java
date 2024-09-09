package guru.springframework.mssc_beer_service.bootstrap;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.mssc_beer_service.domain.Beer;
import guru.springframework.mssc_beer_service.repositories.BeerRepository;
import guru.springframework.mssc_beer_service.web.model.BeerStyleEnum;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class BeerLoader implements CommandLineRunner{

    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    public static final String BEER_3_UPC = "0083783375213";

    private final BeerRepository beerRepository;

    @Override
    public void run(String... args) throws Exception {
        if (beerRepository.count() == 0) {
            loadBeerObjects();
        }
        System.out.println("Nbr beers in BD: " + beerRepository.count());
    }

    private void loadBeerObjects() {
        Beer b1 = Beer.builder()
                .beerName("Mango Bobs")
                .beerStyle(BeerStyleEnum.IPA.name())
                .price(new BigDecimal("12.95"))
                .upc(BEER_1_UPC)
                .minOnHand(12)
                .quantityToBrew(200)
                .build();

        Beer b2 = Beer.builder()
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.PALE_ALE.name())
                .price(new BigDecimal("12.95"))
                .upc(BEER_2_UPC)
                .minOnHand(12)
                .quantityToBrew(200)
                .build();

        Beer b3 = Beer.builder()
                .beerName("Pinball Porter")
                .beerStyle(BeerStyleEnum.PALE_ALE.name())
                .price(new BigDecimal("12.95"))
                .upc(BEER_3_UPC)
                .quantityToBrew(200)
                .minOnHand(12)
                .build();

        beerRepository.save(b1);
        beerRepository.save(b2);
        beerRepository.save(b3);
    }

    

}
