package com.scottishwitchcraft.webapi.data;

import com.scottishwitchcraft.webapi.models.TrialPerson;
import org.springframework.data.repository.CrudRepository;

public interface ITrialPersonRepository extends CrudRepository<TrialPerson, String> {
}
