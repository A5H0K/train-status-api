package com.usecase.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.usecase.app.dao.StationRepository;
import com.usecase.app.dao.TrainRepository;
import com.usecase.app.model.StationDetails;
import com.usecase.app.model.TrainDetails;
import com.usecase.app.service.StatusService;

@Component
public class StatusServiceImpl implements StatusService{
	
	@Autowired
	private TrainRepository trainRepository;
	
	@Autowired
	private StationRepository stationRepository;

	public List<TrainDetails> listAllTrains() {
		// TODO Auto-generated method stub
		return trainRepository.findAll();
	}

	public List<TrainDetails> findByStation(String station) {
		// TODO Auto-generated method stub
		return trainRepository.findByStation(station);
	}

	public List<StationDetails> listAllStations() {
		// TODO Auto-generated method stub
		return stationRepository.findAll();
	}

	public StationDetails findByStationCode(String stationCode) {
		// TODO Auto-generated method stub
		return stationRepository.findByStationCode(stationCode);
	}

}
