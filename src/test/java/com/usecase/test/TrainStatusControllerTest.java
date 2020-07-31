package com.usecase.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.usecase.app.controller.TrainStatusController;
import com.usecase.app.model.StationDetails;
import com.usecase.app.service.StatusService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = TrainStatusController.class)
public class TrainStatusControllerTest {
	
	@MockBean
	private StatusService statusService;
	
	private List<StationDetails> stationList;
	
	@Before
	public void setMockOutput(){
		
		stationList = new ArrayList<StationDetails>();
		
		StationDetails stationDetails = new StationDetails();
		stationDetails.setId(1);
		stationDetails.setStationCode("SA");
		stationDetails.setStationName("Salem Junction");
		
		StationDetails stationDetails1 = new StationDetails();
		stationDetails1.setStationCode("MAS");
		stationDetails1.setStationName("Chennai Central");
		
		stationList.add(stationDetails);
		stationList.add(stationDetails1);
		
		when(statusService.listAllStations()).thenReturn(stationList);
	}
	
	@Test
	public void listAllStations() {

		assertEquals(statusService.listAllStations(), stationList);
	}

}
