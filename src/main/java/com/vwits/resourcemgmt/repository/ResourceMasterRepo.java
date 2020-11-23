package com.vwits.resourcemgmt.repository;

import com.vwits.resourcemgmt.model.ResourceMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

public interface ResourceMasterRepo extends JpaRepository<ResourceMaster, Integer> {

    @Procedure(procedureName = "create_sample_data")
    void createSampleData();


}
