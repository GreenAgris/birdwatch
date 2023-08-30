package green.ag.demo.controllers;

import green.ag.demo.facades.BirdsFacade;
import green.ag.demo.facades.MessageFacade;
import lombok.extern.slf4j.Slf4j;
import org.openapitools.api.TowerApi;
import org.openapitools.model.BirdList;
import org.openapitools.model.RealmMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BirdController  implements TowerApi {

    private BirdsFacade birdsFacade;
    private MessageFacade messageFacade;

    public BirdController(BirdsFacade birdsFacade, MessageFacade messageFacade) {
        this.birdsFacade = birdsFacade;
        this.messageFacade = messageFacade;
    }

    @Override
    public ResponseEntity<BirdList> getBirdsList() {
        LOGGER.info("Received bird listing request");
        return TowerApi.super.getBirdsList();
    }

    @Override
    public ResponseEntity<Void> receiveBirdMessage(RealmMessage realmMessage) {
        LOGGER.info("Received message via bird");
        return TowerApi.super.receiveBirdMessage(realmMessage);
    }
}
