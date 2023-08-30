package green.ag.demo.facades.implementation;

import green.ag.demo.facades.BirdsFacade;
import org.openapitools.model.Bird;
import org.openapitools.model.RealmMessage;
import org.springframework.stereotype.Component;

@Component
public class DefaultBirdsFacade implements BirdsFacade {
    @Override
    public void receiveBird(Bird incomingBird) {

    }

    @Override
    public Bird prepareBirdForFlight(RealmMessage messageToDeliver) {
        return null;
    }

    @Override
    public boolean feedBirds() {
        return false;
    }
}
