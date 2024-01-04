package com.worldwise.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.worldwise.Entity.LoginEntity;

public interface Login extends JpaRepository<LoginEntity ,Integer> {
	 Optional<LoginEntity> findByEmailAndPassword(String email, String password);

	Optional<LoginEntity> findByEmail(String email);
}
