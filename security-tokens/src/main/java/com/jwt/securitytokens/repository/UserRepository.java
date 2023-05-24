package com.jwt.securitytokens.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jwt.securitytokens.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	@Query(value = "SELECT * FROM User u WHERE name = :username", nativeQuery = true)
	 User findByUsername(String username);
}
