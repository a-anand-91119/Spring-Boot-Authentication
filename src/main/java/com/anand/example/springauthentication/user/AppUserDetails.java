package com.anand.example.springauthentication.user;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.anand.example.springauthentication.constants.AppConstants;
import com.anand.example.springauthentication.models.User;

public class AppUserDetails implements UserDetails {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private boolean activeYN;
	private List<GrantedAuthority> authorities;

	public AppUserDetails(User user) {
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.activeYN = user.isActiveYN();
		this.authorities = Arrays.stream(user.getRole().split(AppConstants.COMMA)).map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());
	}

	public AppUserDetails() {
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return this.activeYN;
	}

}
