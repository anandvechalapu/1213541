package com.test_12.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test_12.repository.JiraGitHub;
import com.test_12.repository.JiraGitHubRepository;

@Service
public class JiraGitHubService {

    @Autowired
    private JiraGitHubRepository jiraGitHubRepository;

    public JiraGitHub findByCredentials(String username, String password, String url, String repositoryName) {
        return jiraGitHubRepository.findByCredentials(username, password, url, repositoryName);
    }

    public JiraGitHub findByTitleAndUserNameAndURL(String title, String username, String url) {
        return jiraGitHubRepository.findByTitleAndUserNameAndURL(title, username, url);
    }

    public JiraGitHub findByTitle(String title) {
        return jiraGitHubRepository.findByTitle(title);
    }

    public List<JiraGitHub> findByUserName(String username) {
        return jiraGitHubRepository.findByUserName(username);
    }

    public List<JiraGitHub> findByURL(String url) {
        return jiraGitHubRepository.findByURL(url);
    }

    public List<JiraGitHub> findByRepositoryName(String repositoryName) {
        return jiraGitHubRepository.findByRepositoryName(repositoryName);
    }
}