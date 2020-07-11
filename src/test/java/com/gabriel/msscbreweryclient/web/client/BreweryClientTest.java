package com.gabriel.msscbreweryclient.web.client;

import com.gabriel.msscbreweryclient.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void getBeerById() {

        BeerDto dto = client.getBeerById(UUID.randomUUID());

        assertNotNull(dto);
    }

    @Test
    void saveNewBeer() {

        BeerDto beer = BeerDto.builder().beerName("tyskie").build();

        URI uri = client.saveNewBeer(beer);

        System.out.println(uri.toString());
        assertNotNull(uri);
    }

    @Test
    void updateBeer() {

        BeerDto beer = BeerDto.builder().beerName("tyskie").build();
        client.updateBeer(UUID.randomUUID(), beer);
    }

}