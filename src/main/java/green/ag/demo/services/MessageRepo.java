package green.ag.demo.services;

import org.openapitools.model.RealmMessage;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<RealmMessage,Integer> {
}
