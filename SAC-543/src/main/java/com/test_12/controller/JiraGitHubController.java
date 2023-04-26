package com.test_12.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test_12.service.JiraGitHubService;
import com.test_12.repository.JiraGitHub;

@RestController
@RequestMapping("/jira-git-hub")
public class JiraGitHubController {

    @Autowired
    private JiraGitHubService jiraGitHubService;

    @GetMapping("/credentials/{username}/{password}/{url}/{repositoryName}")
    public JiraGitHub findByCredentials(@PathVariable String username, @PathVariable String password, @PathVariable String url, @PathVariable String repositoryName) {
        return jiraGitHubService.findByCredentials(username, password, url, repositoryName);
    }

    @GetMapping("/title-username-url/{title}/{username}/{url}")
    public JiraGitHub findByTitleAndUserNameAndURL(@PathVariable String title, @PathVariable String username, @PathVariable String url) {
        return jiraGitHubService.findByTitleAndUserNameAndURL(title, username, url);
    }

    @GetMapping("/title/{title}")
    public JiraGitHub findByTitle(@PathVariable String title) {
        return jiraGitHubService.findByTitle(title);
    }

    @GetMapping("/username/{username}")
    public List<JiraGitHub> findByUserName(@PathVariable String username) {
        return jiraGitHubService.findByUserName(username);
    }

    @GetMapping("/url/{url}")
    public List<JiraGitHub> findByURL(@PathVariable String url) {
        return jiraGitHubService.findByURL(url);
    }

    @GetMapping("/repositoryname/{repositoryName}")
    public List<JiraGitHub> findByRepositoryName(@PathVariable String repositoryName) {
        return jiraGitHubService.findByRepositoryName(repositoryName);
    }
}