package com.example.heathCare.respository;

import org.springframework.stereotype.Repository;

import com.example.heathCare.models.Pacient;

import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
public interface PacientRepository extends MongoRepository<Pacient,String> {

}
