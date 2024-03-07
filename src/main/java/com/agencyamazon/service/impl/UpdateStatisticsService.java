package com.agencyamazon.service.impl;

import com.agencyamazon.entity.Data;
import com.agencyamazon.exception.NoFilePresentException;
import com.agencyamazon.repository.DataRepository;
import com.agencyamazon.service.StatisticsService;
import lombok.RequiredArgsConstructor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UpdateStatisticsService {

    private final StatisticsService statisticsService;

    private final DataRepository dataRepository;

    // This method updates the statistics in the database if new data comes from a JSON source.
    // There are two potential approaches for caching data:
    // 1. Cache on first request on specific endpoints: In this approach, the cache is populated only when the first request to specific endpoints is made. Subsequent requests for the same data are then served from the cache, improving response time. However, the initial request may experience a delay as it doesn't benefit from the cache.
    // 2. Continuous cache refresh: This approach prioritizes response time above all else. It ensures that the cache is always up-to-date by refreshing it every time the statistics are updated. This might lead to cache memory problems.
//    @Scheduled(fixedRate = 5, timeUnit = TimeUnit.SECONDS)
    public void simulateNewJsonData() {
        // Although there is currently no incoming JSON data, I will implement the logic as if there were.
        JSONParser parser = new JSONParser();

        JSONObject jsonObject;
        try {
            Object obj = parser.parse(new FileReader("src/main/resources/data/test_report.json"));
            jsonObject = (JSONObject) obj;
        } catch (IOException | ParseException e) {
            throw new NoFilePresentException("No such file located or parse JSON exception");
        }
        List<Data> data = dataRepository.findByReportSpecificationMarketplaceIds("ATVPDKIKX0DER");
        // if data differs from data in Database then we need to update
    }

    private void updateStatistics() {
    }

    private List<Data> convertToList(JSONObject jsonObject) {
        List<Data> dataList = new ArrayList<>();
        JSONArray dataArray = (JSONArray) jsonObject.get("salesAndTrafficByDate");

        for (Object obj : dataArray) {
            JSONObject dataObject = (JSONObject) obj;
            Data data = new Data();
            data.setReportSpecification(dataObject.get("reportSpecification"));
            data.setReportSpecificationDataEndTime((String) dataObject.get("reportSpecification.dataEndTime"));
            data.setReportSpecificationDataStartTime((String) dataObject.get("reportSpecification.dataStartTime"));
            dataList.add(data);
        }

        return dataList;
    }
}
