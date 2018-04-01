package com.scottishwitchcraft.dao;

import com.scottishwitchcraft.models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface IPersonRepository extends CrudRepository<Person, String> {

}
