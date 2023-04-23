package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface TourDateRepository extends JpaRepository<person, Long>{
    
}
  
