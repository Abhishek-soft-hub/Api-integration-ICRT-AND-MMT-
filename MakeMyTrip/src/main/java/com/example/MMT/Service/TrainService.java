package com.example.MMT.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.MMT.Entity.TrainEntity;

public interface TrainService {
	public ResponseEntity saveData(TrainEntity train);
	public void deleteTrain(int busId);
	public ResponseEntity getTrain(int busId);
	public ResponseEntity getTrains();
	
//	public List<TrainEntity> getTrain();

}
