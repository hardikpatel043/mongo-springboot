package com.dm.demomongodb.model;
import java.io.IOException;
import java.util.Date;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

class ConverterMovie {
    // Serialize/deserialize helpers

    public static Movies fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(Movies obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        reader = mapper.reader(Movies.class);
        writer = mapper.writerFor(Movies.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}

@ToString
@Document(collection = "movies")
public class Movies {
    @Id
    ObjectId _id;
    private String id;
    private String plot;
    private String[] genres;
    private String runtime;
    private String[] cast;
    private String numMflixComments;
    private String poster;
    private String title;
    private String fullplot;
    private String[] languages;
    private Date released;
    private String[] directors;
    private String[] writers;
    private Awards awards;
    private String lastupdated;
    private String year;
    private Imdb imdb;
    private String[] countries;
    private String type;
    private Optional<Tomatoes> tomatoes;

    @JsonProperty("_id")
    public String getID() { return id; }
    @JsonProperty("_id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("plot")
    public String getPlot() { return plot; }
    @JsonProperty("plot")
    public void setPlot(String value) { this.plot = value; }

    @JsonProperty("genres")
    public String[] getGenres() { return genres; }
    @JsonProperty("genres")
    public void setGenres(String[] value) { this.genres = value; }

    @JsonProperty("runtime")
    public String getRuntime() { return runtime; }
    @JsonProperty("runtime")
    public void setRuntime(String value) { this.runtime = value; }

    @JsonProperty("cast")
    public String[] getCast() { return cast; }
    @JsonProperty("cast")
    public void setCast(String[] value) { this.cast = value; }

    @JsonProperty("num_mflix_comments")
    public String getNumMflixComments() { return numMflixComments; }
    @JsonProperty("num_mflix_comments")
    public void setNumMflixComments(String value) { this.numMflixComments = value; }

    @JsonProperty("poster")
    public String getPoster() { return poster; }
    @JsonProperty("poster")
    public void setPoster(String value) { this.poster = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("fullplot")
    public String getFullplot() { return fullplot; }
    @JsonProperty("fullplot")
    public void setFullplot(String value) { this.fullplot = value; }

    @JsonProperty("languages")
    public String[] getLanguages() { return languages; }
    @JsonProperty("languages")
    public void setLanguages(String[] value) { this.languages = value; }

    @JsonProperty("released")
    public Date getReleased() { return released; }
    @JsonProperty("released")
    public void setReleased(Date value) { this.released = value; }

    @JsonProperty("directors")
    public String[] getDirectors() { return directors; }
    @JsonProperty("directors")
    public void setDirectors(String[] value) { this.directors = value; }

    @JsonProperty("writers")
    public String[] getWriters() { return writers; }
    @JsonProperty("writers")
    public void setWriters(String[] value) { this.writers = value; }

    @JsonProperty("awards")
    public Awards getAwards() { return awards; }
    @JsonProperty("awards")
    public void setAwards(Awards value) { this.awards = value; }
    @JsonProperty("lastupdated")
    public String getLastupdated() { return lastupdated; }
    @JsonProperty("lastupdated")
    public void setLastupdated(String value) { this.lastupdated = value; }

    @JsonProperty("year")
    public String getYear() { return year; }
    @JsonProperty("year")
    public void setYear(String value) { this.year = value; }

    @JsonProperty("imdb")
    public Imdb getImdb() { return imdb; }
    @JsonProperty("imdb")
    public void setImdb(Imdb value) { this.imdb = value; }

    @JsonProperty("countries")
    public String[] getCountries() { return countries; }
    @JsonProperty("countries")
    public void setCountries(String[] value) { this.countries = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("tomatoes")
    public Optional<Tomatoes> getTomatoes() { return tomatoes; }
    @JsonProperty("tomatoes")
    public void setTomatoes(Optional<Tomatoes> value) { this.tomatoes = value; }
}

class Awards {
    private String wins;
    private String nominations;
    private String text;

    @JsonProperty("wins")
    public String getWINS() { return wins; }
    @JsonProperty("wins")
    public void setWINS(String value) { this.wins = value; }

    @JsonProperty("nominations")
    public String getNominations() { return nominations; }
    @JsonProperty("nominations")
    public void setNominations(String value) { this.nominations = value; }

    @JsonProperty("text")
    public String getText() { return text; }
    @JsonProperty("text")
    public void setText(String value) { this.text = value; }
}

class Imdb {
    private Double rating;

    private String votes;

    private String id;

    @JsonProperty("rating")
    public Double getRating() { return rating; }
    @JsonProperty("rating")
    public void setRating(Double value) { this.rating = value; }

    @JsonProperty("votes")
    public String getVotes() { return votes; }
    @JsonProperty("votes")
    public void setVotes(String value) { this.votes = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }
}


class Tomatoes {
    private Optional<Viewer> viewer;
    private String production;
    private Date lastUpdated;

    @JsonProperty("viewer")
    public Optional<Viewer> getViewer() { return viewer; }
    @JsonProperty("viewer")
    public void setViewer(Optional<Viewer> value) { this.viewer = value; }

    @JsonProperty("production")
    public String getProduction() { return production; }
    @JsonProperty("production")
    public void setProduction(String value) { this.production = value; }

    @JsonProperty("lastUpdated")
    public Date getLastUpdated() { return lastUpdated; }
    @JsonProperty("lastUpdated")
    public void setLastUpdated(Date value) { this.lastUpdated = value; }
}

class Viewer {
    private Double rating;
    private String numReviews;

    @JsonProperty("rating")
    public Double getRating() { return rating; }
    @JsonProperty("rating")
    public void setRating(Double value) { this.rating = value; }

    @JsonProperty("numReviews")
    public String getNumReviews() { return numReviews; }
    @JsonProperty("numReviews")
    public void setNumReviews(String value) { this.numReviews = value; }
}
