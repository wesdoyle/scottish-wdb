package com.scottishwitchcraft.webapi.data;

import com.scottishwitchcraft.webapi.data.models.CasePerson;
import org.springframework.data.repository.CrudRepository;

public interface ICasePersonRepository extends CrudRepository<CasePerson, String> {
}
