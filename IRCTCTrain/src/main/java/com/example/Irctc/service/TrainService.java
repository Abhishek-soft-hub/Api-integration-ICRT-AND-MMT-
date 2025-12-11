package com.example.Irctc.service;

import java.util.List;

import com.example.Irctc.Entity.Train;

public interface TrainService {

	public String saveTrain(Train t);

	public String deleteTrain(int id);

	public Train getTrain(int id);

	public List<Train> getAllTrains();

}
