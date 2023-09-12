package green.ag.demo.services;

import green.ag.demo.database.BirdPerch;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface PerchRepo extends CrudRepository<BirdPerch, Integer>, JpaSpecificationExecutor<BirdPerch> {
}
