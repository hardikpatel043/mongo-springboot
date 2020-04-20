package com.dm.demomongodb.repository;
import com.dm.demomongodb.model.ListingAndReviews;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface AirBnbRepository extends MongoRepository<ListingAndReviews,Integer> {
    public Optional<ListingAndReviews> findListingAndReviewsByName(String name);
    public List<ListingAndReviews> findListingAndReviewsByAccommodates(int num);

}
