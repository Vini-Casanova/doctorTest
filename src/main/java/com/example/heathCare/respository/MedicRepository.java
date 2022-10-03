package com.example.heathCare.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.heathCare.models.Medic;

@Repository
public interface MedicRepository extends MongoRepository<Medic,String> {

}
