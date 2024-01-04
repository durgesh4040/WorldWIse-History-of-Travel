package com.worldwise.Entity;

import java.util.Optional;

import org.hibernate.annotations.GeneratorType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="City")
public class CityEntity {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id ;
  @Column(name="cityName")
private String cityName;
	@Column(name="country")
private String country;
	@Column(name="emoji")
private String emoji;
	@Column(name="date")
private String date;
	@Column(name="notes")
private String notes;
	

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="position_id")
private Position position;
	
//	  @ManyToOne
//	  @JoinColumn(name = "login_id")
//	private LoginEntity login;
	  
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmoji() {
		return emoji;
	}
	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
//	public LoginEntity getLogin() {
//		return login;
//	}
//	public void setLogin(LoginEntity login) {
//		this.login = login;
//	}

	
	

}
