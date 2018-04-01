package com.scottishwitchcraft.webapi.data;

import com.scottishwitchcraft.webapi.models.Complaint;
import org.springframework.data.repository.CrudRepository;

public interface IComplaintRepository extends CrudRepository<Complaint, String> {
}
