package green.ag.demo.services;

import green.ag.demo.database.BirdInternal;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface BirdsRepo extends CrudRepository<BirdInternal, Integer>, JpaSpecificationExecutor<BirdInternal> {
}
