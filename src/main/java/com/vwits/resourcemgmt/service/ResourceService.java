package com.vwits.resourcemgmt.service;
import com.vwits.resourcemgmt.model.ResourceMaster;
import com.vwits.resourcemgmt.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceService {

    @Autowired
    private ResourceMasterRepo resourceMasterRepo;

    public Integer createResource(String resourceName)
    {
        ResourceMaster resourceMaster = new ResourceMaster(resourceName);
        return resourceMasterRepo.save(resourceMaster).getResourceId();
    }

    public String getResource(Integer resourceId)
    {
        return resourceMasterRepo.findById(resourceId).get().getResourceName();
    }

    public void createSampleData()
    {
        resourceMasterRepo.createSampleData();
    }

}

