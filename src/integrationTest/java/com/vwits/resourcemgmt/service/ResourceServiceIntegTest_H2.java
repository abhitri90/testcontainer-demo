//package com.vwits.resourcemgmt.service;
//
//import com.vwits.resourcemgmt.model.ResourceMaster;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import javax.transaction.Transactional;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//@AutoConfigureTestDatabase
//@AutoConfigureTestEntityManager
//@Transactional
//public class ResourceServiceIntegTest_H2{
//
//    @Autowired
//    private TestEntityManager testEntityManager;
//
//    @Autowired
//    ResourceService resourceService;
//
//    ResourceMaster resourceMaster = new ResourceMaster();
//
//    @BeforeEach
//    public void setup()
//    {
//        resourceMaster = new ResourceMaster("Test Resource");
//        testEntityManager.persistAndFlush(resourceMaster);
//    }
//
//    @Test
//    public void getResource_shouldReturnName_ifResourcePresent()
//    {
//        assertEquals("Test Resource", resourceService.getResource(resourceMaster.getResourceId()));
//    }
//
//
//}
