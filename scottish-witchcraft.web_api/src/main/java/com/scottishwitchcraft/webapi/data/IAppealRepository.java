package com.scottishwitchcraft.webapi.data;

import com.scottishwitchcraft.webapi.models.Appeal;
import org.springframework.data.repository.CrudRepository;

public interface IAppealRepository extends CrudRepository<Appeal, String> {
}
