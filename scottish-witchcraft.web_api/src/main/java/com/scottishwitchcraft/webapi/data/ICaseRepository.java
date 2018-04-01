package com.scottishwitchcraft.webapi.data;

import com.scottishwitchcraft.webapi.data.models.Case;
import org.springframework.data.repository.CrudRepository;

public interface ICaseRepository extends CrudRepository<Case, String> {
}
