package com.viana.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viana.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
