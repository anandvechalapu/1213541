package com.rsdfsdfs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsdfsdfs.model.SuperPromptStructure;
import com.rsdfsdfs.repository.SuperPromptStructureRepository;

@Service
public class SuperPromptStructureService {

    @Autowired
    private SuperPromptStructureRepository superPromptStructureRepository;

    public SuperPromptStructure findIntegratedSuperPromptStructure() {
        return superPromptStructureRepository.findIntegratedSuperPromptStructure();
    }

}