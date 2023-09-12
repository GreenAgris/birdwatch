package green.ag.demo.facades;

import org.openapitools.model.Bird;
import org.openapitools.model.BirdList;
import org.openapitools.model.RealmMessage;


public interface BirdsFacade {

    public BirdList getAllBirdsInTower();
    public void receiveBird (Bird incomingBird);
    public Bird prepareBirdForFlight(RealmMessage messageToDeliver);
    public boolean feedBirds();

    void createBirds();
}
