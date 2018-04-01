package com.scottishwitchcraft.dao;

import com.scottishwitchcraft.models.Trial;
import org.springframework.data.repository.CrudRepository;

public interface ITrialRepository extends CrudRepository<Trial, String> {
}
