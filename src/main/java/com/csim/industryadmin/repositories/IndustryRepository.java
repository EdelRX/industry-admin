package com.csim.industryadmin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csim.industryadmin.entities.IndustryEntity;

@Repository
public interface IndustryRepository extends JpaRepository<IndustryEntity, Long> {

}
