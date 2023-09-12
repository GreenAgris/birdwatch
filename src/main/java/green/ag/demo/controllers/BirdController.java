package green.ag.demo.controllers;

import green.ag.demo.facades.BirdsFacade;
import green.ag.demo.facades.MessageFacade;
import lombok.extern.slf4j.Slf4j;
import org.openapitools.api.TowerApi;
import org.openapitools.model.BirdList;
import org.openapitools.model.RealmMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BirdController  implements TowerApi {

    static private boolean isPopulated=false;

    private BirdsFacade birdsFacade;
    private MessageFacade messageFacade;

    public BirdController(BirdsFacade birdsFacade, MessageFacade messageFacade) {
        this.birdsFacade = birdsFacade;
        this.messageFacade = messageFacade;
    }

    @Override
    public ResponseEntity<BirdList> getBirdsList() {
        LOGGER.info("Received bird listing request");
        return ResponseEntity.ok(birdsFacade.getAllBirdsInTower());
    }

    @Override
    public ResponseEntity<Void> receiveBirdMessage(RealmMessage realmMessage) {
        LOGGER.info("Received message via bird");
        messageFacade.readMessage(realmMessage);
        return (ResponseEntity<Void>) ResponseEntity.accepted();
    }

    @Override
    public ResponseEntity createBirdListing() {
        if(!isPopulated){
            birdsFacade.createBirds();
            isPopulated = true;
        }
        return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
    }
}
