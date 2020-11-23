package com.vwits.resourcemgmt.service;

import com.vwits.resourcemgmt.model.ResourceMaster;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ResourceServiceIntegTest extends AbstractIntegrationTest{

    @Autowired
    ResourceService resourceService;

    String testResourceName;

    @BeforeEach
    public void setup()
    {
        testResourceName = "Test Resource";
    }

    @Test
    @Order(1)
    public void getResource_shouldReturnName_ifResourceCreatedFromScript()
    {
        resourceService.createSampleData();
        assertEquals("Resource1 from schema", resourceService.getResource(1));
    }

    @Test
    @Order(2)
    public void getResource_shouldReturnName_ifResourcePresent()
    {
        Integer resourceId = resourceService.createResource(testResourceName);
        assertEquals("Test Resource", resourceService.getResource(resourceId));
    }

}
