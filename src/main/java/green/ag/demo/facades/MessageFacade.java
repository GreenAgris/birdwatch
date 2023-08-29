package green.ag.demo.facades;

import org.openapitools.model.Bird;
import org.openapitools.model.RealmMessage;

public interface MessageFacade {

    public void readMessage(RealmMessage message);
    public RealmMessage createResponse(Bird bird);
}
