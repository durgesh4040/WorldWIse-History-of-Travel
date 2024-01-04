package com.worldwise.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Login")
public class LoginEntity {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column(name="email")
private String email;
@Column(name="password")
private String password;

//@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="login",orphanRemoval=true)
//List<CityEntity> city=new ArrayList<>();

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}


}
