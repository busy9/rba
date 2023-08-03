package org.rba.rest.persistence;

import org.rba.rest.model.RModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RRepository extends CrudRepository<RModel, Integer> {

}
