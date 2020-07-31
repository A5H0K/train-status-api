package com.usecase.app.service.impl;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component	
public class StatusScheduler {
	private static final Logger logger=LoggerFactory.getLogger("StatusScheduler.class");
	@Scheduled(cron = "*/20 * * * * *")//20 seconds for testing
	public void updateRunningStatus(){
		
		logger.info("Executing the Cron");
		//to fetch the train with status as running 
		//for those current position should be fetched from GPS service
		//And the status of the train should be changed - if that reached the Destination
	}

}
