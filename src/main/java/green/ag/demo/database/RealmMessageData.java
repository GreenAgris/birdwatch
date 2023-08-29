package green.ag.demo.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.openapitools.model.RealmMessage;


@Entity
public class RealmMessageData extends RealmMessage {

    @Id
    Integer id;

    String timestamp;


}
