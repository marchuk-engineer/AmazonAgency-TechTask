package com.agencyamazon.service.impl;

import com.agencyamazon.entity.Data;
import com.agencyamazon.repository.DataRepository;
import com.agencyamazon.service.StatisticsService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.json.JSONObject;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = {"SalesAndTrafficByDate", "salesAndTrafficByAsin", "summaryStatisticsByDate", "summaryStatisticsByAsin"})
// TODO: Review all four methods and refactor to get rid of Cognitive Complexity , also to speed performance up.TimeUnit.SECONDS.sleep(1); to show cache work
public class StatisticsServiceImpl implements StatisticsService {

    public static final String DATE = "date";
    public static final String PARENT_ASIN = "parentAsin";

    private final DataRepository dataRepository;

    @Override
    @Cacheable(unless = "#result == null")
    @SneakyThrows
    public String getSalesAndTrafficByDate(String date) {
        TimeUnit.SECONDS.sleep(1);
        List<Data> data = dataRepository.findByReportSpecificationMarketplaceIds("ATVPDKIKX0DER");
        Optional<Object> any = data.stream().map(Data::getSalesAndTrafficByDate).findAny();
        if (any.isPresent()) {
            List<LinkedHashMap<String, String>> linkedHashMaps = (List<LinkedHashMap<String, String>>) any.get();

            for (LinkedHashMap<String, String> linkedHashMap : linkedHashMaps) {
                for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {

                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (key.equals(DATE) && (value.equals(date))) {
                        return new JSONObject(linkedHashMap).toString();
                    }
                }
            }
        }
        return null;
    }

    @Override
    @Cacheable(unless = "#result == null")
    @SneakyThrows
    public String salesAndTrafficByAsin(String asin) {
        TimeUnit.SECONDS.sleep(1);
        List<Data> data = dataRepository.findByReportSpecificationMarketplaceIds("ATVPDKIKX0DER");
        Optional<Object> any = data.stream().map(Data::getSalesAndTrafficByAsin).findAny();
        if (any.isPresent()) {
            List<LinkedHashMap<String, String>> linkedHashMaps = (List<LinkedHashMap<String, String>>) any.get();

            for (LinkedHashMap<String, String> linkedHashMap : linkedHashMaps) {
                for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {

                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (key.equals(PARENT_ASIN) && (value.equals(asin))) {
                        return new JSONObject(linkedHashMap).toString();
                    }
                }
            }
        }
        return null;
    }

    @Override
    @Cacheable(unless = "#result == null")
    @SneakyThrows
    public String summaryStatisticsByDate() {
        TimeUnit.SECONDS.sleep(1);
        List<Data> data = dataRepository.findByReportSpecificationMarketplaceIds("ATVPDKIKX0DER");
        Optional<Object> any = data.stream().map(Data::getSalesAndTrafficByDate).findAny();

        if (any.isPresent()) {
            JSONObject sumJsonObject = new JSONObject();
            List<LinkedHashMap<String, Object>> salesAndTrafficList = (List<LinkedHashMap<String, Object>>) any.get();

            for (LinkedHashMap<String, Object> salesAndTrafficMap : salesAndTrafficList) {
                for (Map.Entry<String, Object> salesAndTrafficEntry : salesAndTrafficMap.entrySet()) {
                    String key = salesAndTrafficEntry.getKey();
                    Object value = salesAndTrafficEntry.getValue();

                    if (value instanceof Map) {
                        Map<String, Object> nestedMap = (Map<String, Object>) value;

                        for (Map.Entry<String, Object> nestedEntry : nestedMap.entrySet()) {
                            String nestedKey = nestedEntry.getKey();
                            Object nestedValue = nestedEntry.getValue();

                            if (nestedValue instanceof Map nestedMap2) {
                                Map<String, Object> nestedMap1 = (Map<String, Object>) nestedMap2;
                                for (Map.Entry<String, Object> nestedEntry1 : nestedMap1.entrySet()) {
                                    String nestedKey1 = nestedEntry1.getKey();
                                    Object nestedValue1 = nestedEntry1.getValue();

                                    if (nestedValue1 instanceof Number nestedNumber) {
                                        sumJsonObject.put(nestedKey1, sumJsonObject.optDouble(nestedKey1, 0) + nestedNumber.doubleValue());
                                    }
                                }
                            }
                            if (nestedValue instanceof Number number) {
                                sumJsonObject.put(nestedKey, sumJsonObject.optDouble(nestedKey, 0) + number.doubleValue());
                            }
                        }
                    } else if (value instanceof Number number) {
                        sumJsonObject.put(key, sumJsonObject.optDouble(key, 0) + number.doubleValue());
                    }
                }
            }
            return sortJsonByKey(sumJsonObject);
        }
        return null;
    }

    @Override
    @Cacheable(unless = "#result == null")
    @SneakyThrows
    public String summaryStatisticsByAsin() {
        TimeUnit.SECONDS.sleep(1);
        List<Data> data = dataRepository.findByReportSpecificationMarketplaceIds("ATVPDKIKX0DER");
        Optional<Object> any = data.stream().map(Data::getSalesAndTrafficByAsin).findAny();

        if (any.isPresent()) {
            JSONObject sumJsonObject = new JSONObject();
            List<LinkedHashMap<String, Object>> salesAndTrafficList = (List<LinkedHashMap<String, Object>>) any.get();

            for (LinkedHashMap<String, Object> salesAndTrafficMap : salesAndTrafficList) {
                for (Map.Entry<String, Object> salesAndTrafficEntry : salesAndTrafficMap.entrySet()) {
                    String key = salesAndTrafficEntry.getKey();
                    Object value = salesAndTrafficEntry.getValue();

                    if (value instanceof Map) {
                        Map<String, Object> nestedMap = (Map<String, Object>) value;

                        for (Map.Entry<String, Object> nestedEntry : nestedMap.entrySet()) {
                            String nestedKey = nestedEntry.getKey();
                            Object nestedValue = nestedEntry.getValue();

                            if (nestedValue instanceof Map nestedMap2) {
                                Map<String, Object> nestedMap1 = (Map<String, Object>) nestedMap2;
                                for (Map.Entry<String, Object> nestedEntry1 : nestedMap1.entrySet()) {
                                    String nestedKey1 = nestedEntry1.getKey();
                                    Object nestedValue1 = nestedEntry1.getValue();

                                    if (nestedValue1 instanceof Number nestedNumber) {
                                        sumJsonObject.put(nestedKey1, sumJsonObject.optDouble(nestedKey1, 0) + nestedNumber.doubleValue());
                                    }
                                }
                            }
                            if (nestedValue instanceof Number number) {
                                sumJsonObject.put(nestedKey, sumJsonObject.optDouble(nestedKey, 0) + number.doubleValue());
                            }
                        }
                    } else if (value instanceof Number number) {
                        sumJsonObject.put(key, sumJsonObject.optDouble(key, 0) + number.doubleValue());
                    }
                }
            }
            return sortJsonByKey(sumJsonObject);
        }
        return null;
    }

    private static String sortJsonByKey(JSONObject sumJsonObject) {
        List<String> sortedKeys = new ArrayList<>(sumJsonObject.keySet());
        Collections.sort(sortedKeys);

        JSONObject sortedJsonObject = new JSONObject();
        sortedKeys.forEach(key -> sortedJsonObject.put(key, sumJsonObject.get(key)));

        return sortedJsonObject.toString();
    }

}
