package com.scottishwitchcraft.dao;

import com.scottishwitchcraft.models.CasePerson;
import org.springframework.data.repository.CrudRepository;

public interface ICasePersonRepository extends CrudRepository<CasePerson, String> {
}
