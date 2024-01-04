package com.worldwise.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.worldwise.Entity.CityEntity;
import com.worldwise.Entity.LoginEntity;
import com.worldwise.Repository.City;
import com.worldwise.Repository.Login;
import com.worldwise.Service.LoginService;

@RestController

@CrossOrigin(origins = {"https://worldwise-history-of-tra-10025.web.app","http://localhost:5173"})
public class Controller {
	@Autowired
	private Login loginRepo;
	
	@Autowired 
	private City cityRepo;
	
	@Autowired
	private LoginService login;
	
	@GetMapping("/getLogin")
	private List<LoginEntity> getLogin() {
	return loginRepo.findAll();
	}
	

	@PostMapping("/cities")
	private ResponseEntity<String> saveCity(@RequestBody CityEntity city) {
	   // Optional<LoginEntity> luser = login.loginUser(city.getLogin().getEmail());

//	    LoginEntity loginEntity = luser.orElseThrow(() -> new RuntimeException("Login not found"));
//	    if (luser.isPresent()) {
//	        //city.setLogin(loginEntity);
//	        cityRepo.save(city);
//	        return ResponseEntity.ok("successful");
//	    } else {
//	        System.out.println("invalid result");
//	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//	    }
		
		 cityRepo.save(city);
        return ResponseEntity.ok("successful");
	}

@GetMapping("/cities")
private List<CityEntity> getAllCity() {
return cityRepo.findAll();
}
@DeleteMapping("/cities/{id}")
private ResponseEntity<String> deleteCity(@PathVariable int id) {
    try {
        cityRepo.deleteById(id);
        return ResponseEntity.ok("City with ID " + id + " deleted successfully");
    } catch (EmptyResultDataAccessException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("City with ID " + id + " not found");
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting city with ID " + id);
    }
}
}
