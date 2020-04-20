package com.dm.demomongodb.controller;

import com.dm.demomongodb.repository.AirBnbRepository;
import com.dm.demomongodb.model.ListingAndReviews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AirBnbController {
    @Autowired
    private AirBnbRepository airBnbRepository;

    @GetMapping("/findReviewByName/{name}")
    public Optional<ListingAndReviews> getAllListingAndReviews(@PathVariable String name){
        return airBnbRepository.findListingAndReviewsByName(name);
    }

    @GetMapping("/findReviewByAccommodates/{num}")
    public List<ListingAndReviews> getAllListingAndReviewsByAccomodates(@PathVariable int num){
        return airBnbRepository.findListingAndReviewsByAccommodates(num);
    }
}
