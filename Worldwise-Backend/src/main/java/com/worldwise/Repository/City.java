package com.worldwise.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.worldwise.Entity.CityEntity;

public interface City extends JpaRepository<CityEntity,Integer>{

}
