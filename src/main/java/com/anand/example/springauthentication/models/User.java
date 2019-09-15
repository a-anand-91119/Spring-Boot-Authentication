package com.anand.example.springauthentication.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@Column(name = "u_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "u_username")
	private String userName;

	@Column(name = "u_password")
	private String password;

	@Column(name = "u_role")
	private String role;

	@Column(name = "u_active")
	private boolean activeYN;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isActiveYN() {
		return activeYN;
	}

	public void setActiveYN(boolean activeYN) {
		this.activeYN = activeYN;
	}

}
