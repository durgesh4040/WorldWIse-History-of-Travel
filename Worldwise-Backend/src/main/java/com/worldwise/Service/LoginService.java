package com.worldwise.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.worldwise.Entity.LoginEntity;
import com.worldwise.Repository.Login;

@Service
public class LoginService {
    @Autowired
    private Login login;  //Repository of login
    
    public Optional<LoginEntity> loginUser(String email) {
        return login.findByEmail(email);
    }
    
    
    public String saveUser(LoginEntity savelogin) {
    	login.save(savelogin);
    	return "User registration successful! Data saved.";
    }


    public Optional<LoginEntity> getLoginByEmail(String email) {
        return login.findByEmail(email);
    }


	
}
