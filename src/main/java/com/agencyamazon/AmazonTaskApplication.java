package com.agencyamazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ConfigurationPropertiesScan(basePackages = {"com.agencyamazon.config"})
@EnableMongoRepositories(basePackages = {"com.agencyamazon.repository"})
public class AmazonTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmazonTaskApplication.class, args);
    }

}
