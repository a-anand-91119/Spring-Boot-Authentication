package com.anand.example.springauthentication.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.anand.example.springauthentication.UserRepository;
import com.anand.example.springauthentication.models.User;

@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findByUserName(username);
		
		user.orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
		
		return user.map(AppUserDetails::new).get();
	}

}
