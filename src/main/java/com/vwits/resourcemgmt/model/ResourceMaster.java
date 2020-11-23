package com.vwits.resourcemgmt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="resource_master")
public class ResourceMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name="resource_id")
    private Integer resourceId;

    @Column(name="resource_name")
    private String resourceName;

    public ResourceMaster(String resourceName) {
        this.resourceName = resourceName;
    }
}
