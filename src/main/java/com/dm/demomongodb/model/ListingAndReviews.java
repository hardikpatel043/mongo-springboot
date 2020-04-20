package com.dm.demomongodb.model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@ToString
@Document(collection = "listingsAndReviews")
public class ListingAndReviews {
    @Id
    private String id;
    private String listingURL;
    private String name;
    private String summary;
    private String interaction;
    private String houseRules;
    private String propertyType;
    private String roomType;
    private String bedType;
    private String minimumNights;
    private String maximumNights;
    private String cancellationPolicy;
    private Date lastScraped;
    private Date calendarLastScraped;
    private Date firstReview;
    private Date lastReview;
    private Integer accommodates;
    private Integer bedrooms;
    private Integer beds;
    private Integer numberOfReviews;
    private Decimal128 bathrooms;
    private String[] amenities;
    private Decimal128 price;
    private Decimal128 securityDeposit;
    private Decimal128 cleaningFee;
    private Decimal128 extraPeople;
    private Decimal128 guestsIncluded;
    private Images images;
    private Host host;
    private Address address;
    private Availability availability;
    private ReviewScores reviewScores;
    private Review[] reviews;

    @JsonProperty("_id")
    public String getID() { return id; }
    @JsonProperty("_id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("listing_url")
    public String getListingURL() { return listingURL; }
    @JsonProperty("listing_url")
    public void setListingURL(String value) { this.listingURL = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("summary")
    public String getSummary() { return summary; }
    @JsonProperty("summary")
    public void setSummary(String value) { this.summary = value; }

    @JsonProperty("interaction")
    public String getInteraction() { return interaction; }
    @JsonProperty("interaction")
    public void setInteraction(String value) { this.interaction = value; }

    @JsonProperty("house_rules")
    public String getHouseRules() { return houseRules; }
    @JsonProperty("house_rules")
    public void setHouseRules(String value) { this.houseRules = value; }

    @JsonProperty("property_type")
    public String getPropertyType() { return propertyType; }
    @JsonProperty("property_type")
    public void setPropertyType(String value) { this.propertyType = value; }

    @JsonProperty("room_type")
    public String getRoomType() { return roomType; }
    @JsonProperty("room_type")
    public void setRoomType(String value) { this.roomType = value; }

    @JsonProperty("bed_type")
    public String getBedType() { return bedType; }
    @JsonProperty("bed_type")
    public void setBedType(String value) { this.bedType = value; }

    @JsonProperty("minimum_nights")
    public String getMinimumNights() { return minimumNights; }
    @JsonProperty("minimum_nights")
    public void setMinimumNights(String value) { this.minimumNights = value; }

    @JsonProperty("maximum_nights")
    public String getMaximumNights() { return maximumNights; }
    @JsonProperty("maximum_nights")
    public void setMaximumNights(String value) { this.maximumNights = value; }

    @JsonProperty("cancellation_policy")
    public String getCancellationPolicy() { return cancellationPolicy; }
    @JsonProperty("cancellation_policy")
    public void setCancellationPolicy(String value) { this.cancellationPolicy = value; }

    @JsonProperty("last_scraped")
    public Date getLastScraped() { return lastScraped; }
    @JsonProperty("last_scraped")
    public void setLastScraped(Date value) { this.lastScraped = value; }

    @JsonProperty("calendar_last_scraped")
    public Date getCalendarLastScraped() { return calendarLastScraped; }
    @JsonProperty("calendar_last_scraped")
    public void setCalendarLastScraped(Date value) { this.calendarLastScraped = value; }

    @JsonProperty("first_review")
    public Date getFirstReview() { return firstReview; }
    @JsonProperty("first_review")
    public void setFirstReview(Date value) { this.firstReview = value; }

    @JsonProperty("last_review")
    public Date getLastReview() { return lastReview; }
    @JsonProperty("last_review")
    public void setLastReview(Date value) { this.lastReview = value; }

    @JsonProperty("accommodates")
    public Integer getAccommodates() { return accommodates; }
    @JsonProperty("accommodates")
    public void setAccommodates(Integer value) { this.accommodates = value; }

    @JsonProperty("bedrooms")
    public Integer getBedrooms() { return bedrooms; }
    @JsonProperty("bedrooms")
    public void setBedrooms(Integer value) { this.bedrooms = value; }

    @JsonProperty("beds")
    public Integer getBeds() { return beds; }
    @JsonProperty("beds")
    public void setBeds(Integer value) { this.beds = value; }

    @JsonProperty("number_of_reviews")
    public Integer getNumberOfReviews() { return numberOfReviews; }
    @JsonProperty("number_of_reviews")
    public void setNumberOfReviews(Integer value) { this.numberOfReviews = value; }

    @JsonProperty("bathrooms")
    public Decimal128 getBathrooms() { return bathrooms; }
    @JsonProperty("bathrooms")
    public void setBathrooms(Decimal128 value) { this.bathrooms = value; }

    @JsonProperty("amenities")
    public String[] getAmenities() { return amenities; }
    @JsonProperty("amenities")
    public void setAmenities(String[] value) { this.amenities = value; }

    @JsonProperty("price")
    public Decimal128 getPrice() { return price; }
    @JsonProperty("price")
    public void setPrice(Decimal128 value) { this.price = value; }

    @JsonProperty("security_deposit")
    public Decimal128 getSecurityDeposit() { return securityDeposit; }
    @JsonProperty("security_deposit")
    public void setSecurityDeposit(Decimal128 value) { this.securityDeposit = value; }

    @JsonProperty("cleaning_fee")
    public Decimal128 getCleaningFee() { return cleaningFee; }
    @JsonProperty("cleaning_fee")
    public void setCleaningFee(Decimal128 value) { this.cleaningFee = value; }

    @JsonProperty("extra_people")
    public Decimal128 getExtraPeople() { return extraPeople; }
    @JsonProperty("extra_people")
    public void setExtraPeople(Decimal128 value) { this.extraPeople = value; }

    @JsonProperty("guests_included")
    public Decimal128 getGuestsIncluded() { return guestsIncluded; }
    @JsonProperty("guests_included")
    public void setGuestsIncluded(Decimal128 value) { this.guestsIncluded = value; }

    @JsonProperty("images")
    public Images getImages() { return images; }
    @JsonProperty("images")
    public void setImages(Images value) { this.images = value; }

    @JsonProperty("host")
    public Host getHost() { return host; }
    @JsonProperty("host")
    public void setHost(Host value) { this.host = value; }

    @JsonProperty("address")
    public Address getAddress() { return address; }
    @JsonProperty("address")
    public void setAddress(Address value) { this.address = value; }

    @JsonProperty("availability")
    public Availability getAvailability() { return availability; }
    @JsonProperty("availability")
    public void setAvailability(Availability value) { this.availability = value; }

    @JsonProperty("review_scores")
    public ReviewScores getReviewScores() { return reviewScores; }
    @JsonProperty("review_scores")
    public void setReviewScores(ReviewScores value) { this.reviewScores = value; }

    @JsonProperty("reviews")
    public Review[] getReviews() { return reviews; }
    @JsonProperty("reviews")
    public void setReviews(Review[] value) { this.reviews = value; }
}


class Availability {
    private Integer availability30;
    private Integer availability60;
    private Integer availability90;
    private Integer availability365;

    @JsonProperty("availability_30")
    public Integer getAvailability30() { return availability30; }
    @JsonProperty("availability_30")
    public void setAvailability30(Integer value) { this.availability30 = value; }

    @JsonProperty("availability_60")
    public Integer getAvailability60() { return availability60; }
    @JsonProperty("availability_60")
    public void setAvailability60(Integer value) { this.availability60 = value; }

    @JsonProperty("availability_90")
    public Integer getAvailability90() { return availability90; }
    @JsonProperty("availability_90")
    public void setAvailability90(Integer value) { this.availability90 = value; }

    @JsonProperty("availability_365")
    public Integer getAvailability365() { return availability365; }
    @JsonProperty("availability_365")
    public void setAvailability365(Integer value) { this.availability365 = value; }
}


class Host {
    private String hostID;
    private String hostURL;
    private String hostName;
    private String hostLocation;
    private String hostAbout;
    private String hostResponseTime;
    private String hostThumbnailURL;
    private String hostPictureURL;
    private String hostNeighbourhood;
    private Integer hostResponseRate;
    private boolean hostIsSuperhost;
    private boolean hostHasProfilePic;
    private boolean hostIdentityVerified;
    private Integer hostListingsCount;
    private Integer hostTotalListingsCount;
    private String[] hostVerifications;

    @JsonProperty("host_id")
    public String getHostID() { return hostID; }
    @JsonProperty("host_id")
    public void setHostID(String value) { this.hostID = value; }

    @JsonProperty("host_url")
    public String getHostURL() { return hostURL; }
    @JsonProperty("host_url")
    public void setHostURL(String value) { this.hostURL = value; }

    @JsonProperty("host_name")
    public String getHostName() { return hostName; }
    @JsonProperty("host_name")
    public void setHostName(String value) { this.hostName = value; }

    @JsonProperty("host_location")
    public String getHostLocation() { return hostLocation; }
    @JsonProperty("host_location")
    public void setHostLocation(String value) { this.hostLocation = value; }

    @JsonProperty("host_about")
    public String getHostAbout() { return hostAbout; }
    @JsonProperty("host_about")
    public void setHostAbout(String value) { this.hostAbout = value; }

    @JsonProperty("host_response_time")
    public String getHostResponseTime() { return hostResponseTime; }
    @JsonProperty("host_response_time")
    public void setHostResponseTime(String value) { this.hostResponseTime = value; }

    @JsonProperty("host_thumbnail_url")
    public String getHostThumbnailURL() { return hostThumbnailURL; }
    @JsonProperty("host_thumbnail_url")
    public void setHostThumbnailURL(String value) { this.hostThumbnailURL = value; }

    @JsonProperty("host_picture_url")
    public String getHostPictureURL() { return hostPictureURL; }
    @JsonProperty("host_picture_url")
    public void setHostPictureURL(String value) { this.hostPictureURL = value; }

    @JsonProperty("host_neighbourhood")
    public String getHostNeighbourhood() { return hostNeighbourhood; }
    @JsonProperty("host_neighbourhood")
    public void setHostNeighbourhood(String value) { this.hostNeighbourhood = value; }

    @JsonProperty("host_response_rate")
    public Integer getHostResponseRate() { return hostResponseRate; }
    @JsonProperty("host_response_rate")
    public void setHostResponseRate(Integer value) { this.hostResponseRate = value; }

    @JsonProperty("host_is_superhost")
    public boolean getHostIsSuperhost() { return hostIsSuperhost; }
    @JsonProperty("host_is_superhost")
    public void setHostIsSuperhost(boolean value) { this.hostIsSuperhost = value; }

    @JsonProperty("host_has_profile_pic")
    public boolean getHostHasProfilePic() { return hostHasProfilePic; }
    @JsonProperty("host_has_profile_pic")
    public void setHostHasProfilePic(boolean value) { this.hostHasProfilePic = value; }

    @JsonProperty("host_identity_verified")
    public boolean getHostIdentityVerified() { return hostIdentityVerified; }
    @JsonProperty("host_identity_verified")
    public void setHostIdentityVerified(boolean value) { this.hostIdentityVerified = value; }

    @JsonProperty("host_listings_count")
    public Integer getHostListingsCount() { return hostListingsCount; }
    @JsonProperty("host_listings_count")
    public void setHostListingsCount(Integer value) { this.hostListingsCount = value; }

    @JsonProperty("host_total_listings_count")
    public Integer getHostTotalListingsCount() { return hostTotalListingsCount; }
    @JsonProperty("host_total_listings_count")
    public void setHostTotalListingsCount(Integer value) { this.hostTotalListingsCount = value; }

    @JsonProperty("host_verifications")
    public String[] getHostVerifications() { return hostVerifications; }
    @JsonProperty("host_verifications")
    public void setHostVerifications(String[] value) { this.hostVerifications = value; }
}


class Images {
    private String thumbnailURL;
    private String mediumURL;
    private String pictureURL;
    private String xlPictureURL;

    @JsonProperty("thumbnail_url")
    public String getThumbnailURL() { return thumbnailURL; }
    @JsonProperty("thumbnail_url")
    public void setThumbnailURL(String value) { this.thumbnailURL = value; }

    @JsonProperty("medium_url")
    public String getMediumURL() { return mediumURL; }
    @JsonProperty("medium_url")
    public void setMediumURL(String value) { this.mediumURL = value; }

    @JsonProperty("picture_url")
    public String getPictureURL() { return pictureURL; }
    @JsonProperty("picture_url")
    public void setPictureURL(String value) { this.pictureURL = value; }

    @JsonProperty("xl_picture_url")
    public String getXlPictureURL() { return xlPictureURL; }
    @JsonProperty("xl_picture_url")
    public void setXlPictureURL(String value) { this.xlPictureURL = value; }
}

class ReviewScores {
    private Integer reviewScoresAccuracy;
    private Integer reviewScoresCheckin;
    private Integer reviewScoresCleanliness;
    private Integer reviewScoresCommunication;
    private Integer reviewScoresLocation;
    private Integer reviewScoresValue;
    private Integer reviewScoresRating;

    @JsonProperty("review_scores_accuracy")
    public Integer getReviewScoresAccuracy() { return reviewScoresAccuracy; }
    @JsonProperty("review_scores_accuracy")
    public void setReviewScoresAccuracy(Integer value) { this.reviewScoresAccuracy = value; }

    @JsonProperty("review_scores_cleanliness")
    public Integer getReviewScoresCleanliness() { return reviewScoresCleanliness; }
    @JsonProperty("review_scores_cleanliness")
    public void setReviewScoresCleanliness(Integer value) { this.reviewScoresCleanliness = value; }

    @JsonProperty("review_scores_checkin")
    public Integer getReviewScoresCheckin() { return reviewScoresCheckin; }
    @JsonProperty("review_scores_checkin")
    public void setReviewScoresCheckin(Integer value) { this.reviewScoresCheckin = value; }

    @JsonProperty("review_scores_communication")
    public Integer getReviewScoresCommunication() { return reviewScoresCommunication; }
    @JsonProperty("review_scores_communication")
    public void setReviewScoresCommunication(Integer value) { this.reviewScoresCommunication = value; }

    @JsonProperty("review_scores_location")
    public Integer getReviewScoresLocation() { return reviewScoresLocation; }
    @JsonProperty("review_scores_location")
    public void setReviewScoresLocation(Integer value) { this.reviewScoresLocation = value; }

    @JsonProperty("review_scores_value")
    public Integer getReviewScoresValue() { return reviewScoresValue; }
    @JsonProperty("review_scores_value")
    public void setReviewScoresValue(Integer value) { this.reviewScoresValue = value; }

    @JsonProperty("review_scores_rating")
    public Integer getReviewScoresRating() { return reviewScoresRating; }
    @JsonProperty("review_scores_rating")
    public void setReviewScoresRating(Integer value) { this.reviewScoresRating = value; }
}

class Review {
    private String id;
    private Date date;
    private String listingID;
    private String reviewerID;
    private String reviewerName;
    private String comments;

    @JsonProperty("_id")
    public String getID() { return id; }
    @JsonProperty("_id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("date")
    public Date getDate() { return date; }
    @JsonProperty("date")
    public void setDate(Date value) { this.date = value; }

    @JsonProperty("listing_id")
    public String getListingID() { return listingID; }
    @JsonProperty("listing_id")
    public void setListingID(String value) { this.listingID = value; }

    @JsonProperty("reviewer_id")
    public String getReviewerID() { return reviewerID; }
    @JsonProperty("reviewer_id")
    public void setReviewerID(String value) { this.reviewerID = value; }

    @JsonProperty("reviewer_name")
    public String getReviewerName() { return reviewerName; }
    @JsonProperty("reviewer_name")
    public void setReviewerName(String value) { this.reviewerName = value; }

    @JsonProperty("comments")
    public String getComments() { return comments; }
    @JsonProperty("comments")
    public void setComments(String value) { this.comments = value; }
}
