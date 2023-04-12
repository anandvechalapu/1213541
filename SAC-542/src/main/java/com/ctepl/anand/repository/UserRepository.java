package com.ctepl.anand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctepl.anand.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUsernameAndPassword(String username, String password);
	
	public User findByUsername(String username);
	
	public User findByEmail(String email);
	
	public User findByPasswordResetToken(String token);
	
}