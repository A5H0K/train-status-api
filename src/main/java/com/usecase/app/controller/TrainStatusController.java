package com.usecase.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.app.model.StationDetails;
import com.usecase.app.model.TrainDetails;
import com.usecase.app.service.StatusService;

@RestController
@RequestMapping("/train/status-service")
public class TrainStatusController {
	
	@Autowired
	private StatusService statusService;
	
	@GetMapping("/listAllTrains")
	public List<TrainDetails> listAllTrains(){
		
		return statusService.listAllTrains();
	}
	
	
	@GetMapping("/findByStation")
	public List<TrainDetails> findByStation(@RequestParam String stationName){
		
		return statusService.findByStation(stationName);
	}
	
	@GetMapping("/listAllStations")
	public List<StationDetails> listAllSations(){
		
		return statusService.listAllStations();
	}
	
	@GetMapping("/findByStationCode")
	public StationDetails findByStationCode(@RequestParam String stationCode){
		
		return statusService.findByStationCode(stationCode);
	}
	
	
}
