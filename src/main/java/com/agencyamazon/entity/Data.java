package com.agencyamazon.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Basic;

@Document(collection = "data")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    @Id
    private String id;
    @Basic
    @Field(name = "reportSpecification")
    private Object reportSpecification;
    @Basic
    @Field(name = "reportSpecification.dataEndTime")
    private String reportSpecificationDataEndTime;
    @Basic
    @Field(name = "reportSpecification.dataStartTime")
    private String reportSpecificationDataStartTime;
    @Basic
    @Field(name = "reportSpecification.marketplaceIds")
    private Object reportSpecificationMarketplaceIds;
    @Basic
    @Field(name = "reportSpecification.reportOptions")
    private Object reportSpecificationReportOptions;
    @Basic
    @Field(name = "reportSpecification.reportOptions.asinGranularity")
    private String reportSpecificationReportOptionsAsinGranularity;
    @Basic
    @Field(name = "reportSpecification.reportOptions.dateGranularity")
    private String reportSpecificationReportOptionsDateGranularity;
    @Basic
    @Field(name = "reportSpecification.reportType")
    private String reportSpecificationReportType;
    @Basic
    @Field(name = "salesAndTrafficByAsin")
    private Object salesAndTrafficByAsin;
    @Basic
    @Field(name = "salesAndTrafficByAsin.parentAsin")
    private String salesAndTrafficByAsinParentAsin;
    @Basic
    @Field(name = "salesAndTrafficByAsin.salesByAsin")
    private Object salesAndTrafficByAsinSalesByAsin;
    @Basic
    @Field(name = "salesAndTrafficByAsin.salesByAsin.orderedProductSales")
    private Object salesAndTrafficByAsinSalesByAsinOrderedProductSales;
    @Basic
    @Field(name = "salesAndTrafficByAsin.salesByAsin.orderedProductSales.amount")
    private Double salesAndTrafficByAsinSalesByAsinOrderedProductSalesAmount;
    @Basic
    @Field(name = "salesAndTrafficByAsin.salesByAsin.orderedProductSales.currencyCode")
    private String salesAndTrafficByAsinSalesByAsinOrderedProductSalesCurrencyCode;
    @Basic
    @Field(name = "salesAndTrafficByAsin.salesByAsin.orderedProductSalesB2B")
    private Object salesAndTrafficByAsinSalesByAsinOrderedProductSalesB2B;
    @Basic
    @Field(name = "salesAndTrafficByAsin.salesByAsin.orderedProductSalesB2B.amount")
    private Integer salesAndTrafficByAsinSalesByAsinOrderedProductSalesB2BAmount;
    @Basic
    @Field(name = "salesAndTrafficByAsin.salesByAsin.orderedProductSalesB2B.currencyCode")
    private String salesAndTrafficByAsinSalesByAsinOrderedProductSalesB2BCurrencyCode;
    @Basic
    @Field(name = "salesAndTrafficByAsin.salesByAsin.totalOrderItems")
    private Integer salesAndTrafficByAsinSalesByAsinTotalOrderItems;
    @Basic
    @Field(name = "salesAndTrafficByAsin.salesByAsin.totalOrderItemsB2B")
    private Integer salesAndTrafficByAsinSalesByAsinTotalOrderItemsB2B;
    @Basic
    @Field(name = "salesAndTrafficByAsin.salesByAsin.unitsOrdered")
    private Integer salesAndTrafficByAsinSalesByAsinUnitsOrdered;
    @Basic
    @Field(name = "salesAndTrafficByAsin.salesByAsin.unitsOrderedB2B")
    private Integer salesAndTrafficByAsinSalesByAsinUnitsOrderedB2B;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin")
    private Object salesAndTrafficByAsinTrafficByAsin;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.browserPageViews")
    private Integer salesAndTrafficByAsinTrafficByAsinBrowserPageViews;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.browserPageViewsB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinBrowserPageViewsB2B;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.browserPageViewsPercentage")
    private Double salesAndTrafficByAsinTrafficByAsinBrowserPageViewsPercentage;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.browserPageViewsPercentageB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinBrowserPageViewsPercentageB2B;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.browserSessionPercentage")
    private Double salesAndTrafficByAsinTrafficByAsinBrowserSessionPercentage;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.browserSessionPercentageB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinBrowserSessionPercentageB2B;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.browserSessions")
    private Integer salesAndTrafficByAsinTrafficByAsinBrowserSessions;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.browserSessionsB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinBrowserSessionsB2B;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.buyBoxPercentage")
    private Integer salesAndTrafficByAsinTrafficByAsinBuyBoxPercentage;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.buyBoxPercentageB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinBuyBoxPercentageB2B;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.mobileAppPageViews")
    private Integer salesAndTrafficByAsinTrafficByAsinMobileAppPageViews;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.mobileAppPageViewsB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinMobileAppPageViewsB2B;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.mobileAppPageViewsPercentage")
    private Double salesAndTrafficByAsinTrafficByAsinMobileAppPageViewsPercentage;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.mobileAppPageViewsPercentageB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinMobileAppPageViewsPercentageB2B;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.mobileAppSessionPercentage")
    private Double salesAndTrafficByAsinTrafficByAsinMobileAppSessionPercentage;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.mobileAppSessionPercentageB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinMobileAppSessionPercentageB2B;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.mobileAppSessions")
    private Integer salesAndTrafficByAsinTrafficByAsinMobileAppSessions;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.mobileAppSessionsB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinMobileAppSessionsB2B;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.pageViews")
    private Integer salesAndTrafficByAsinTrafficByAsinPageViews;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.pageViewsB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinPageViewsB2B;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.pageViewsPercentage")
    private Double salesAndTrafficByAsinTrafficByAsinPageViewsPercentage;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.pageViewsPercentageB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinPageViewsPercentageB2B;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.sessionPercentage")
    private Double salesAndTrafficByAsinTrafficByAsinSessionPercentage;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.sessionPercentageB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinSessionPercentageB2B;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.sessions")
    private Integer salesAndTrafficByAsinTrafficByAsinSessions;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.sessionsB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinSessionsB2B;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.unitSessionPercentage")
    private Double salesAndTrafficByAsinTrafficByAsinUnitSessionPercentage;
    @Basic
    @Field(name = "salesAndTrafficByAsin.trafficByAsin.unitSessionPercentageB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinUnitSessionPercentageB2B;
    @Basic
    @Field(name = "salesAndTrafficByDate")
    private Object salesAndTrafficByDate;
    @Basic
    @Field(name = "salesAndTrafficByDate.date")
    private String salesAndTrafficByDateDate;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate")
    private Object salesAndTrafficByDateSalesByDate;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.averageSalesPerOrderItem")
    private Object salesAndTrafficByDateSalesByDateAverageSalesPerOrderItem;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.averageSalesPerOrderItem.amount")
    private Double salesAndTrafficByDateSalesByDateAverageSalesPerOrderItemAmount;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.averageSalesPerOrderItem.currencyCode")
    private String salesAndTrafficByDateSalesByDateAverageSalesPerOrderItemCurrencyCode;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.averageSalesPerOrderItemB2B")
    private Object salesAndTrafficByDateSalesByDateAverageSalesPerOrderItemB2B;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.averageSalesPerOrderItemB2B.amount")
    private Double salesAndTrafficByDateSalesByDateAverageSalesPerOrderItemB2BAmount;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.averageSalesPerOrderItemB2B.currencyCode")
    private String salesAndTrafficByDateSalesByDateAverageSalesPerOrderItemB2BCurrencyCode;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.averageSellingPrice")
    private Object salesAndTrafficByDateSalesByDateAverageSellingPrice;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.averageSellingPrice.amount")
    private Double salesAndTrafficByDateSalesByDateAverageSellingPriceAmount;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.averageSellingPrice.currencyCode")
    private String salesAndTrafficByDateSalesByDateAverageSellingPriceCurrencyCode;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.averageSellingPriceB2B")
    private Object salesAndTrafficByDateSalesByDateAverageSellingPriceB2B;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.averageSellingPriceB2B.amount")
    private Double salesAndTrafficByDateSalesByDateAverageSellingPriceB2BAmount;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.averageSellingPriceB2B.currencyCode")
    private String salesAndTrafficByDateSalesByDateAverageSellingPriceB2BCurrencyCode;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.averageUnitsPerOrderItem")
    private Double salesAndTrafficByDateSalesByDateAverageUnitsPerOrderItem;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.averageUnitsPerOrderItemB2B")
    private Double salesAndTrafficByDateSalesByDateAverageUnitsPerOrderItemB2B;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.claimsAmount")
    private Object salesAndTrafficByDateSalesByDateClaimsAmount;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.claimsAmount.amount")
    private Integer salesAndTrafficByDateSalesByDateClaimsAmountAmount;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.claimsAmount.currencyCode")
    private String salesAndTrafficByDateSalesByDateClaimsAmountCurrencyCode;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.claimsGranted")
    private Integer salesAndTrafficByDateSalesByDateClaimsGranted;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.orderedProductSales")
    private Object salesAndTrafficByDateSalesByDateOrderedProductSales;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.orderedProductSales.amount")
    private Double salesAndTrafficByDateSalesByDateOrderedProductSalesAmount;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.orderedProductSales.currencyCode")
    private String salesAndTrafficByDateSalesByDateOrderedProductSalesCurrencyCode;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.orderedProductSalesB2B")
    private Object salesAndTrafficByDateSalesByDateOrderedProductSalesB2B;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.orderedProductSalesB2B.amount")
    private Double salesAndTrafficByDateSalesByDateOrderedProductSalesB2BAmount;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.orderedProductSalesB2B.currencyCode")
    private String salesAndTrafficByDateSalesByDateOrderedProductSalesB2BCurrencyCode;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.ordersShipped")
    private Integer salesAndTrafficByDateSalesByDateOrdersShipped;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.refundRate")
    private Double salesAndTrafficByDateSalesByDateRefundRate;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.shippedProductSales")
    private Object salesAndTrafficByDateSalesByDateShippedProductSales;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.shippedProductSales.amount")
    private Double salesAndTrafficByDateSalesByDateShippedProductSalesAmount;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.shippedProductSales.currencyCode")
    private String salesAndTrafficByDateSalesByDateShippedProductSalesCurrencyCode;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.totalOrderItems")
    private Integer salesAndTrafficByDateSalesByDateTotalOrderItems;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.totalOrderItemsB2B")
    private Integer salesAndTrafficByDateSalesByDateTotalOrderItemsB2B;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.unitsOrdered")
    private Integer salesAndTrafficByDateSalesByDateUnitsOrdered;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.unitsOrderedB2B")
    private Integer salesAndTrafficByDateSalesByDateUnitsOrderedB2B;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.unitsRefunded")
    private Integer salesAndTrafficByDateSalesByDateUnitsRefunded;
    @Basic
    @Field(name = "salesAndTrafficByDate.salesByDate.unitsShipped")
    private Integer salesAndTrafficByDateSalesByDateUnitsShipped;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate")
    private Object salesAndTrafficByDateTrafficByDate;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.averageOfferCount")
    private Integer salesAndTrafficByDateTrafficByDateAverageOfferCount;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.averageParentItems")
    private Integer salesAndTrafficByDateTrafficByDateAverageParentItems;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.browserPageViews")
    private Integer salesAndTrafficByDateTrafficByDateBrowserPageViews;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.browserPageViewsB2B")
    private Integer salesAndTrafficByDateTrafficByDateBrowserPageViewsB2B;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.browserSessions")
    private Integer salesAndTrafficByDateTrafficByDateBrowserSessions;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.browserSessionsB2B")
    private Integer salesAndTrafficByDateTrafficByDateBrowserSessionsB2B;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.buyBoxPercentage")
    private Double salesAndTrafficByDateTrafficByDateBuyBoxPercentage;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.buyBoxPercentageB2B")
    private Double salesAndTrafficByDateTrafficByDateBuyBoxPercentageB2B;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.feedbackReceived")
    private Integer salesAndTrafficByDateTrafficByDateFeedbackReceived;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.mobileAppPageViews")
    private Integer salesAndTrafficByDateTrafficByDateMobileAppPageViews;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.mobileAppPageViewsB2B")
    private Integer salesAndTrafficByDateTrafficByDateMobileAppPageViewsB2B;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.mobileAppSessions")
    private Integer salesAndTrafficByDateTrafficByDateMobileAppSessions;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.mobileAppSessionsB2B")
    private Integer salesAndTrafficByDateTrafficByDateMobileAppSessionsB2B;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.negativeFeedbackReceived")
    private Integer salesAndTrafficByDateTrafficByDateNegativeFeedbackReceived;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.orderItemSessionPercentage")
    private Double salesAndTrafficByDateTrafficByDateOrderItemSessionPercentage;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.orderItemSessionPercentageB2B")
    private Double salesAndTrafficByDateTrafficByDateOrderItemSessionPercentageB2B;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.pageViews")
    private Integer salesAndTrafficByDateTrafficByDatePageViews;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.pageViewsB2B")
    private Integer salesAndTrafficByDateTrafficByDatePageViewsB2B;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.receivedNegativeFeedbackRate")
    private Integer salesAndTrafficByDateTrafficByDateReceivedNegativeFeedbackRate;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.sessions")
    private Integer salesAndTrafficByDateTrafficByDateSessions;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.sessionsB2B")
    private Integer salesAndTrafficByDateTrafficByDateSessionsB2B;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.unitSessionPercentage")
    private Double salesAndTrafficByDateTrafficByDateUnitSessionPercentage;
    @Basic
    @Field(name = "salesAndTrafficByDate.trafficByDate.unitSessionPercentageB2B")
    private Integer salesAndTrafficByDateTrafficByDateUnitSessionPercentageB2B;

}
