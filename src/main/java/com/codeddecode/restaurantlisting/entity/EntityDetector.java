package com.codeddecode.restaurantlisting.entity;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;
import org.springframework.stereotype.Component;

@Component
public class EntityDetector {

    @PersistenceUnit
    private EntityManagerFactory emf;

    @PostConstruct
    public void detect() {
        System.out.println("=== Entities detected by Hibernate ===");
        emf.getMetamodel().getEntities()
                .forEach(e -> System.out.println(" -> " + e.getName()));
        System.out.println("======================================");
    }
}