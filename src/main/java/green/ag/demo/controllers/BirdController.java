package green.ag.demo.controllers;

import org.openapitools.api.ListBirdsApi;
import org.openapitools.model.BirdList;
import org.springframework.http.ResponseEntity;

public class BirdController implements ListBirdsApi {

    @Override
    public ResponseEntity<BirdList> getBirdsList() {
        return ListBirdsApi.super.getBirdsList();
    }


}
