package com.example.Irctc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Irctc.Entity.Train;

@Repository
public interface TrainRepo extends JpaRepository<Train, Integer> {

}
