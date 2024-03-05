package com.agencyamazon.repository;

import com.agencyamazon.entity.Data;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataRepository extends MongoRepository<Data,String> {
}
