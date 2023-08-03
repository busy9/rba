package org.rba.rest.persistence;

import org.rba.rest.model.RbaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RbaRepository extends CrudRepository<RbaModel, Integer> {

}
