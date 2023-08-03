package org.rba.rest.persistence;

import org.rba.rest.model.BModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BRepository extends CrudRepository<BModel, Integer> {

}
