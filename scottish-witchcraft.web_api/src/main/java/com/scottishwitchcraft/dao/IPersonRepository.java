package com.scottishwitchcraft.dao;

import com.scottishwitchcraft.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface IPersonRepository extends CrudRepository<Person, String> {

}
