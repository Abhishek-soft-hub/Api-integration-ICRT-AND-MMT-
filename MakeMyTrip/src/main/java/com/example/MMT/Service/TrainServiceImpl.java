package com.example.MMT.Service;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties.Http;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.MMT.Entity.TrainEntity;
import com.example.MMT.Repository.TrainRepo;

@Service
public class TrainServiceImpl implements TrainService {
	@Autowired
	TrainRepo repo;
	@Autowired
	RestTemplate rest;

	@Override
	public ResponseEntity saveData(TrainEntity train) {


		return rest.postForEntity("http://localhost:8080/train", train, String.class);
	}

	@Override
	public ResponseEntity getTrains() {
	return rest.getForEntity("http://localhost:8080/trains", List.class);
	}


	@Override
	public void deleteTrain(int trainId) {

	rest.delete("http://localhost:8080/train/delete/" + trainId);
	}

	@Override
	public ResponseEntity getTrain(int trainId) {

//		return rest.getForEntity("http://localhost:8080/train/" + trainId, TrainEntity.class);
		return rest.getForEntity("http://localhost:8080/train/" + trainId, TrainEntity.class);
	}

}
