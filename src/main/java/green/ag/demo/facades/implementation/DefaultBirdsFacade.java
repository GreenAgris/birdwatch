package green.ag.demo.facades.implementation;

import green.ag.demo.database.BirdInternal;
import green.ag.demo.facades.BirdsFacade;
import green.ag.demo.services.BirdService;
import green.ag.demo.services.BirdsRepo;
import lombok.SneakyThrows;
import org.openapitools.model.Bird;
import org.openapitools.model.BirdList;
import org.openapitools.model.BirdSpecies;
import org.openapitools.model.RealmMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DefaultBirdsFacade implements BirdsFacade {

    @Autowired
    BirdService birdService;

    @Override
    public BirdList getAllBirdsInTower() {
        return birdService.getAllBirds();
    }

    @Override
    public void receiveBird(Bird incomingBird) {
        BirdInternal saveable = (BirdInternal) incomingBird;
        birdService.storeBird(saveable);
    }

    @Override
    @SneakyThrows
    public Bird prepareBirdForFlight(RealmMessage messageToDeliver) {
        BirdList list = getAllBirdsInTower();
        if (list.getBirds().isEmpty()) {
          return null;
        }
        return list.getBirds().get(0);
    }

    @Override
    public boolean feedBirds() {
        return false;
    }

    @Override
    public void createBirds() {
        BirdInternal stork = new BirdInternal();
        stork.setName("Stork");
        stork.setDescription("Big White bird with long legs");
        stork.setSpecies(new BirdSpecies());

        BirdInternal raven = new BirdInternal();
        raven.setName("Raven");
        raven.setDescription("Medium black bird");
        raven.setSpecies(new BirdSpecies());


        BirdInternal dove = new BirdInternal();
        dove.setName("Dove");
        dove.setDescription("small grey bird, lives in forest");
        dove.setSpecies(new BirdSpecies());



        birdService.fillPerch(stork);
        birdService.fillPerch(raven);
        birdService.fillPerch(dove);
    }
}
