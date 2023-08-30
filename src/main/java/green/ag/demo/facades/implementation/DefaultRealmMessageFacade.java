package green.ag.demo.facades.implementation;

import green.ag.demo.facades.MessageFacade;
import lombok.extern.slf4j.Slf4j;
import org.openapitools.model.Bird;
import org.openapitools.model.RealmMessage;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DefaultRealmMessageFacade implements MessageFacade {
    @Override
    public void readMessage(RealmMessage message) {
      LOGGER.info("Received the following message:" + message.toString());
      //save in DB message
    }

    @Override
    public RealmMessage createResponse(Bird bird) {
        return null;
    }
}
