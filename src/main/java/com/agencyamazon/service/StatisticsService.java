package com.agencyamazon.service;

public interface StatisticsService {
    String getSalesAndTrafficByDate(String date);

    String salesAndTrafficByAsin(String asin);

    String summaryStatisticsByDate();

    String summaryStatisticsByAsin();
}
