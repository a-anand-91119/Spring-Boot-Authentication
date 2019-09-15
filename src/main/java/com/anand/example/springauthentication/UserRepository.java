package com.anand.example.springauthentication;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anand.example.springauthentication.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByUserName(String userName);

}
