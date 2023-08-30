package green.ag.demo.services;

import green.ag.demo.database.RealmMessageData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepo extends CrudRepository<RealmMessageData,Integer> {
}
