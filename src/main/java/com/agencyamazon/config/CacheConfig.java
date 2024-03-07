package com.agencyamazon.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.RemovalCause;
import com.github.benmanes.caffeine.cache.Scheduler;
import lombok.extern.log4j.Log4j2;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@EnableCaching
@Configuration
@Log4j2
public class CacheConfig {

    @Bean
    public Caffeine<Object, Object> caffeineConfig() {
        return Caffeine.newBuilder()
                .expireAfterWrite(60, TimeUnit.MINUTES)
                .evictionListener((Object key, Object value,
                                   RemovalCause cause) ->
                        log.info(String.format(
                                "Key %s was evicted (%s)%n", key, cause)))
                .removalListener((Object key, Object value,
                                  RemovalCause cause) ->
                        log.info(String.format(
                                "Key %s was removed (%s)%n", key, cause)))
                .scheduler(Scheduler.systemScheduler());
    }

    @Bean
    public CacheManager cacheManager(Caffeine caffeine) {
        CaffeineCacheManager cacheManager = new
                CaffeineCacheManager("SalesAndTrafficByDate", "salesAndTrafficByAsin", "summaryStatisticsByDate", "summaryStatisticsByAsin");
        cacheManager.setCaffeine(caffeine);
        return cacheManager;
    }

}
