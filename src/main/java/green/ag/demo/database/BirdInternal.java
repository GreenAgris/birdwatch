package green.ag.demo.database;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.openapitools.model.Bird;
import org.openapitools.model.BirdSpecies;


@Entity
public class BirdInternal extends Bird {

    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return super.getId();
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Override
    public Bird id(Integer id) {
        return super.id(id);
    }

    @Override
    public Bird name(String name) {
        return super.name(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Bird description(String description) {
        return super.description(description);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public Bird isReadyToFly(Boolean isReadyToFly) {
        return super.isReadyToFly(isReadyToFly);
    }

    @Override
    public Boolean getIsReadyToFly() {
        return super.getIsReadyToFly();
    }

    @Override
    public void setIsReadyToFly(Boolean isReadyToFly) {
        super.setIsReadyToFly(isReadyToFly);
    }

    @Override
    public Bird needsFeed(Boolean needsFeed) {
        return super.needsFeed(needsFeed);
    }

    @Override
    public Boolean getNeedsFeed() {
        return super.getNeedsFeed();
    }

    @Override
    public void setNeedsFeed(Boolean needsFeed) {
        super.setNeedsFeed(needsFeed);
    }

    @Override
    public Bird country(String country) {
        return super.country(country);
    }

    @Override
    public String getCountry() {
        return super.getCountry();
    }

    @Override
    public void setCountry(String country) {
        super.setCountry(country);
    }

    @Override
    public void setSpecies(BirdSpecies species) {
        super.setSpecies(species);
    }

    @Override
    public Bird colour(String colour) {
        return super.colour(colour);
    }

    @Override
    public String getColour() {
        return super.getColour();
    }

    @Override
    public void setColour(String colour) {
        super.setColour(colour);
    }
}
