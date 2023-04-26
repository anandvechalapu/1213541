package com.test_12.model;

import javax.persistence.*;

@Entity
@Table(name = "jira_github")
public class JiraGitHub {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "repository_name")
	private String repositoryName;
	
	public JiraGitHub() {
		
	}
	
	public JiraGitHub(String title, String username, String password, String url, String repositoryName) {
		this.title = title;
		this.username = username;
		this.password = password;
		this.url = url;
		this.repositoryName = repositoryName;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRepositoryName() {
		return repositoryName;
	}

	public void setRepositoryName(String repositoryName) {
		this.repositoryName = repositoryName;
	}

}