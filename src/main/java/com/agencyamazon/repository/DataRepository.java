package com.agencyamazon.repository;

import com.agencyamazon.entity.Data;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataRepository extends MongoRepository<Data, String> {
    List<Data> findByReportSpecificationMarketplaceIds(Object reportSpecificationMarketplaceIds);
}
