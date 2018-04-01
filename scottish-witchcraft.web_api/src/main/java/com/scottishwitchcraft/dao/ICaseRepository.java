package com.scottishwitchcraft.dao;

import com.scottishwitchcraft.models.Case;
import org.springframework.data.repository.CrudRepository;

public interface ICaseRepository extends CrudRepository<Case, String> {
}
