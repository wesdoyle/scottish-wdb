package com.scottishwitchcraft.dao;

import com.scottishwitchcraft.models.TrialPerson;
import org.springframework.data.repository.CrudRepository;

public interface ITrialPersonRepository extends CrudRepository<TrialPerson, String> {
}
