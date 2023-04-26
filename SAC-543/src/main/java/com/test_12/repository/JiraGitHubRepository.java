package com.test_12.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JiraGitHubRepository extends JpaRepository<JiraGitHub, Long> {
	
    @Query("SELECT jg FROM JiraGitHub jg WHERE jg.username = :username AND jg.password = :password AND jg.url = :url AND jg.repositoryName = :repositoryName")
    JiraGitHub findByCredentials(@Param("username") String username, @Param("password") String password, @Param("url") String url, @Param("repositoryName") String repositoryName);

    @Query("SELECT jg FROM JiraGitHub jg WHERE jg.title = :title AND jg.username = :username AND jg.url = :url")
    JiraGitHub findByTitleAndUserNameAndURL(@Param("title") String title, @Param("username") String username, @Param("url") String url);

    @Query("SELECT jg FROM JiraGitHub jg WHERE jg.title = :title")
    JiraGitHub findByTitle(@Param("title") String title);

    @Query("SELECT jg FROM JiraGitHub jg WHERE jg.username = :username")
    JiraGitHub findByUserName(@Param("username") String username);

    @Query("SELECT jg FROM JiraGitHub jg WHERE jg.url = :url")
    JiraGitHub findByURL(@Param("url") String url);
    
    @Query("SELECT jg FROM JiraGitHub jg WHERE jg.repositoryName = :repositoryName")
    JiraGitHub findByRepositoryName(@Param("repositoryName") String repositoryName);

}