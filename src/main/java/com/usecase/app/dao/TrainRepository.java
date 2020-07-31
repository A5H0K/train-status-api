package com.usecase.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.usecase.app.model.TrainDetails;

@Repository
public interface TrainRepository extends CrudRepository<TrainDetails, Long>{

	public List<TrainDetails> findAll();
	
	//@Query(value="SELECT * FROM train_details td WHERE td.source = ?1 or td.destination = ?1",nativeQuery = true)
	@Query(value="SELECT * FROM train_details td WHERE td.root like %?1%",nativeQuery = true)
	public List<TrainDetails> findByStation(String station);
	
	
}
