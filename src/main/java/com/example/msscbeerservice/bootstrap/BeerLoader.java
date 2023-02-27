package com.example.msscbeerservice.bootstrap;

import com.example.msscbeerservice.domain.Beer;
import com.example.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    public static final String BEER_1_UPC = "063123454546";
    public static final String BEER_2_UPC = "063123454512";
    public static final String BEER_3_UPC = "008123754546";
    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Mango Bobs")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(BEER_1_UPC)
                    .price(new BigDecimal("12.56"))
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .minOnHand(23)
                    .upc(BEER_2_UPC)
                    .price(new BigDecimal("11.6"))
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("No hammers on the bar")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(100)
                    .minOnHand(21)
                    .upc(BEER_3_UPC)
                    .price(new BigDecimal("10.1"))
                    .build());
        }

    }
}
