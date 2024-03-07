package com.agencyamazon.api;

import com.agencyamazon.service.StatisticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequiredArgsConstructor
public class StatisticsController {

    private final StatisticsService statisticsService;

    @GetMapping("/get/statistics/by-date")
    public ResponseEntity<String> getStatisticsByDate(@RequestParam String date) {
        String data = statisticsService.getSalesAndTrafficByDate(date);
        return Objects.nonNull(data) ? ResponseEntity.ok(data) : ResponseEntity.notFound().build();
    }

    @GetMapping("/get/statistics/by-asin")
    public ResponseEntity<String> getStatisticsByASIN(@RequestParam String asin) {
        String data = statisticsService.salesAndTrafficByAsin(asin);
        return Objects.nonNull(data) ? ResponseEntity.ok(data) : ResponseEntity.notFound().build();
    }

    @GetMapping("/get/statistics/summary/by-date")
    public ResponseEntity<String> getSummaryStatisticsByDate() {
        String data = statisticsService.summaryStatisticsByDate();
        return Objects.nonNull(data) ? ResponseEntity.ok(data) : ResponseEntity.notFound().build();
    }

    @GetMapping("/get/statistics/summary/by-asin")
    public ResponseEntity<String> getSummaryStatisticsByAsian() {
        String data = statisticsService.summaryStatisticsByAsin();
        return Objects.nonNull(data) ? ResponseEntity.ok(data) : ResponseEntity.notFound().build();
    }

}
