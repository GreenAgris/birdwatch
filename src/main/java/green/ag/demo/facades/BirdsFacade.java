package green.ag.demo.facades;

import org.openapitools.model.Bird;
import org.openapitools.model.RealmMessage;

public interface BirdsFacade {
    public void receiveBird (Bird incomingBird);
    public Bird prepareBirdForFlight(RealmMessage messageToDeliver);
    public boolean feedBirds();

}
