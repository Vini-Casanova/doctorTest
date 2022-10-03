package com.example.heathCare;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicRepository extends MongoRepository<Medic,String> {

}
