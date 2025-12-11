package com.example.MMT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MMT.Entity.TrainEntity;

@Repository
public interface TrainRepo extends JpaRepository<TrainEntity, Integer>{
	
	

}
