package green.ag.demo.services;

import green.ag.demo.database.BirdInternal;
import green.ag.demo.database.BirdPerch;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.*;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.openapitools.model.Bird;
import org.openapitools.model.BirdList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Slf4j
@Component
public class BirdService {

    @Autowired
    BirdsRepo birdsRepo;

    @Autowired
    PerchRepo perchRepo;

    @Autowired
    private EntityManager entityManager;
    
    
    public BirdList getAllBirds(){
        BirdList birdList = new BirdList();
        birdsRepo.findAll().forEach(bird ->
                {//TODO create a mappers for all of the internal converting operations
                    birdsRepo.findById(bird.getId());
                    Bird birdy = new Bird();
                    birdy.setId(bird.getId());
                    birdy.setName(bird.getName());
                    birdy.setDescription(bird.getDescription());
                birdList.addBirdsItem(birdy);}
        );
        return birdList;
    }

    public void storeBird(BirdInternal saveable) {
        birdsRepo.save(saveable);
    }

    public void fillPerch(BirdInternal bird) {

        BirdInternal saved = birdsRepo.save(bird);

        BirdPerch perch = new BirdPerch();
        perch.setOccupyingBirdId(saved);

    }

    public BirdInternal findBirdByPerch(String name){

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<BirdInternal> criteriaQuery = criteriaBuilder.createQuery(BirdInternal.class);

      //  Root<BirdInternal> itemRoot = criteriaQuery.from(BirdInternal.class);
        Root<BirdPerch> perchRoot = criteriaQuery.from(BirdPerch.class);

        final Join<BirdPerch, BirdInternal> birdJoin = perchRoot.join("occupyingBirdId");
        ArrayList<Predicate> predicates  = new ArrayList();
        final Predicate perch = criteriaBuilder.like(perchRoot.get("description"),"%"+name+"%");
        predicates.add(perch);
       /*
        return (BirdInternal) birdsRepo.findAll((Specification<BirdInternal>) criteriaQuery.where(perch));*/
        final Join<BirdPerch,BirdInternal>critq = perchRoot.join("occupyingBirdId");
      //  perch.getCompoundSelectionItems()

      //  birdsRepo.findAll(critq.multiselect());
        return null;
    }
}
