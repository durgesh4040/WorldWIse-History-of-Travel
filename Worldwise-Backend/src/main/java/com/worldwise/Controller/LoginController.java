package com.worldwise.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.worldwise.Entity.LoginEntity;
import com.worldwise.Service.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class LoginController {
	@Autowired
private LoginService loginservice;
	@GetMapping("/hi")
	public String res() {
		return "hi";
	}
	
	@PostMapping("/userlogin")
	public ResponseEntity<?>loginUser(@RequestBody LoginEntity loginRequest){
		   Optional<LoginEntity> user =loginservice.loginUser(loginRequest.getEmail());
		  // LoginEntity foundUser = user.orElse(null);        
		   
		   
	        if (user.isPresent()) {
	            return ResponseEntity.ok(user.get());
	        } else {
	        	System.out.println("invalid result");
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
	        }
	    }
@PostMapping("/registerUser")
public String saveUser(@RequestBody LoginEntity savelogin) {
	  return loginservice.saveUser(savelogin);
	
}
	
}

