package com.example.Irctc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Irctc.Entity.Train;
import com.example.Irctc.repository.TrainRepo;

@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	TrainRepo repo;

	@Override
	public String saveTrain(Train t) {
		repo.save(t);
		return "train are added";
	}

	@Override
	public String deleteTrain(int id) {
		repo.deleteById(id);
		return "train are delete";
	}

	@Override
	public Train getTrain(int id) {
		return repo.findById(id).get();

	}

	@Override
	public List<Train> getAllTrains() {
		return repo.findAll();
	}

}
