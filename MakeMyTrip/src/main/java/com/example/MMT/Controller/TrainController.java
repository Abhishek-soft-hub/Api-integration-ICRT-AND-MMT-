package com.example.MMT.Controller;

import java.util.List;
import com.example.MMT.Service.TrainServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MMT.Entity.TrainEntity;
import com.example.MMT.Service.TrainService;

@RestController
public class TrainController {

	@Autowired
	TrainService service;

	@PostMapping("mmt/train")
	public ResponseEntity save(@RequestBody TrainEntity train) {
		ResponseEntity respo = service.saveData(train);
		return new ResponseEntity("data are added from irtct", HttpStatus.CREATED);

	}

	@GetMapping("mmt/trains")
	public ResponseEntity getAllTrain() {
		ResponseEntity<List> responseEntity = service.getTrains();
		return new ResponseEntity(responseEntity , HttpStatus.OK);

	}

	@DeleteMapping("mmt/train/{trainId}")
	public ResponseEntity deleteTrain(@PathVariable int trainId) {
		service.deleteTrain(trainId);
		return new ResponseEntity("train are deleted", HttpStatus.OK);

	}

	@GetMapping("mmt/train/{trainId}")
	public ResponseEntity getTrain(@PathVariable int trainId) {
		ResponseEntity rest = service.getTrain(trainId);
		return new ResponseEntity(rest , HttpStatus.OK);

	}

//	@GetMapping("mmt/trains")
//	public List<TrainEntity> getAllTrain() {
//		return service.getTrain();
//
//	}

}
