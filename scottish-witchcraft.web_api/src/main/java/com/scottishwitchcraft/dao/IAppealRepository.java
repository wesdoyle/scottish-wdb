package com.scottishwitchcraft.dao;

import com.scottishwitchcraft.models.Appeal;
import org.springframework.data.repository.CrudRepository;

public interface IAppealRepository extends CrudRepository<Appeal, String> {
}
