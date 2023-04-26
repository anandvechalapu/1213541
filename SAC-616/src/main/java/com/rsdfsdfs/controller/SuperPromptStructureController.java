package com.rsdfsdfs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsdfsdfs.model.SuperPromptStructure;
import com.rsdfsdfs.service.SuperPromptStructureService;

@RestController
@RequestMapping("/superPromptStructure")
public class SuperPromptStructureController {

    @Autowired
    private SuperPromptStructureService superPromptStructureService;

    @GetMapping("/findIntegratedSuperPromptStructure")
    public SuperPromptStructure findIntegratedSuperPromptStructure() {
        return superPromptStructureService.findIntegratedSuperPromptStructure();
    }

}