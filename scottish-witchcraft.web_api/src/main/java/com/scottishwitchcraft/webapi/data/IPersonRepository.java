package com.scottishwitchcraft.webapi.data;

import com.scottishwitchcraft.webapi.data.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface IPersonRepository extends CrudRepository<Person, String> {

}
