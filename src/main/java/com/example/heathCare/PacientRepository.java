package com.example.heathCare;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
public interface PacientRepository extends MongoRepository<Pacient,String> {

}
