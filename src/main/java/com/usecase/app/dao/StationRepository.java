package com.usecase.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.usecase.app.model.StationDetails;

@Repository
public interface StationRepository extends CrudRepository<StationDetails, Long> {
	
	public List<StationDetails> findAll();
	
	public StationDetails findByStationCode(String stationCode);

}
