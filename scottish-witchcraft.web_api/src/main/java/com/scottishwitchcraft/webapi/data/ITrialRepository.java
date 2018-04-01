package com.scottishwitchcraft.webapi.data;

import com.scottishwitchcraft.webapi.data.models.Trial;
import org.springframework.data.repository.CrudRepository;

public interface ITrialRepository extends CrudRepository<Trial, String> {
}
