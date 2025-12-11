package com.example.Irctc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.example.Irctc.Entity.Train;
import com.example.Irctc.service.TrainService;

@RestController
public class TrainController {
	@Autowired
	TrainService service;

	@PostMapping("train")
	public ResponseEntity saveTrain(@RequestBody Train t) {

		service.saveTrain(t);
		return new ResponseEntity("train are added", HttpStatus.CREATED);
	}

	@DeleteMapping("train/delete/{id}")
	public ResponseEntity deleteTrain(@PathVariable int id) {
		service.deleteTrain(id);
		return new ResponseEntity("delete train " ,HttpStatus.OK);

	}

	@GetMapping("train/{id}")
	public ResponseEntity getTrain(@PathVariable int id) {
		Train t = service.getTrain(id);
		return new ResponseEntity(t, HttpStatus.OK);

	}

	@GetMapping("trains")
	public ResponseEntity getTrains() {
		List<Train> list = service.getAllTrains();
		return new ResponseEntity(list, HttpStatus.OK);

	}

}
