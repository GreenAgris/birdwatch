package green.ag.demo.services;

import green.ag.demo.database.RealmMessageData;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<RealmMessageData,Integer> {
}
