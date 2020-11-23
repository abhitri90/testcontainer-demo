package com.vwits.resourcemgmt.controller;

import com.vwits.resourcemgmt.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @PostMapping("/resource/{resourceName}/")
    public ResponseEntity<String> createResource(@PathVariable String resourceName) {
        return ResponseEntity.ok(resourceService.createResource(resourceName).toString());
    }

    @GetMapping("/resource/{resourceId}/")
    public ResponseEntity<String> findResourceById(@PathVariable Integer resourceId) {
        return ResponseEntity.ok(resourceService.getResource(resourceId));
    }

}
