package com.rsdfsdfs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rsdfsdfs.model.SuperPromptStructure;

@Repository
public interface SuperPromptStructureRepository extends JpaRepository<SuperPromptStructure, Long> {

    @Query("SELECT s FROM SuperPromptStructure s WHERE s.integrated = true")
    SuperPromptStructure findIntegratedSuperPromptStructure();

}