package com.agencyamazon.repository;

import com.agencyamazon.entity.Data;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends MongoRepository<Data, String> {
}
