package com.usecase.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.usecase.app.model.StationDetails;
import com.usecase.app.model.TrainDetails;

@Service
public interface StatusService {

	public List<TrainDetails> listAllTrains();
	
	public List<TrainDetails> findByStation(String station);
	
	public List<StationDetails> listAllStations();
	
	public StationDetails findByStationCode(String stationCode);
	
}
