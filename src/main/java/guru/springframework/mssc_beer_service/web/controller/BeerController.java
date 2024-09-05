package guru.springframework.mssc_beer_service.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.mssc_beer_service.web.model.BeerDto;



@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerID") UUID beerId) {
        // TODO implementation
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<BeerDto> saveNewBeer(@RequestBody BeerDto beerDto) {
        // TODO implementation
        return new ResponseEntity<>(HttpStatus.CREATED)
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDto> uodateBeerById(@PathVariable("beerID") UUID beerId, @RequestBody BeerDto beerDto) {
        // TODO implementation
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}