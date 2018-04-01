package com.scottishwitchcraft.dao;

import com.scottishwitchcraft.models.Complaint;
import org.springframework.data.repository.CrudRepository;

public interface IComplaintRepository extends CrudRepository<Complaint, String> {
}
