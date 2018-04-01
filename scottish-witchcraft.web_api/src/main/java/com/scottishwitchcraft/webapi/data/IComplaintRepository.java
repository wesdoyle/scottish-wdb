package com.scottishwitchcraft.webapi.data;

import com.scottishwitchcraft.webapi.data.models.Complaint;
import org.springframework.data.repository.CrudRepository;

public interface IComplaintRepository extends CrudRepository<Complaint, String> {
}
