package com.agencyamazon.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Basic;
import javax.persistence.Column;

@Document(collection = "data")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    @Column(name = "_id", nullable = false)
    @Id
    private String id;
    @Basic
    @Column(name = "reportSpecification")
    private Object reportSpecification;
    @Basic
    @Column(name = "reportSpecification.dataEndTime")
    private String reportSpecificationDataEndTime;
    @Basic
    @Column(name = "reportSpecification.dataStartTime")
    private String reportSpecificationDataStartTime;
    @Basic
    @Column(name = "reportSpecification.marketplaceIds")
    private Object reportSpecificationMarketplaceIds;
    @Basic
    @Column(name = "reportSpecification.reportOptions")
    private Object reportSpecificationReportOptions;
    @Basic
    @Column(name = "reportSpecification.reportOptions.asinGranularity")
    private String reportSpecificationReportOptionsAsinGranularity;
    @Basic
    @Column(name = "reportSpecification.reportOptions.dateGranularity")
    private String reportSpecificationReportOptionsDateGranularity;
    @Basic
    @Column(name = "reportSpecification.reportType")
    private String reportSpecificationReportType;
    @Basic
    @Column(name = "salesAndTrafficByAsin")
    private Object salesAndTrafficByAsin;
    @Basic
    @Column(name = "salesAndTrafficByAsin.parentAsin")
    private String salesAndTrafficByAsinParentAsin;
    @Basic
    @Column(name = "salesAndTrafficByAsin.salesByAsin")
    private Object salesAndTrafficByAsinSalesByAsin;
    @Basic
    @Column(name = "salesAndTrafficByAsin.salesByAsin.orderedProductSales")
    private Object salesAndTrafficByAsinSalesByAsinOrderedProductSales;
    @Basic
    @Column(name = "salesAndTrafficByAsin.salesByAsin.orderedProductSales.amount")
    private Double salesAndTrafficByAsinSalesByAsinOrderedProductSalesAmount;
    @Basic
    @Column(name = "salesAndTrafficByAsin.salesByAsin.orderedProductSales.currencyCode")
    private String salesAndTrafficByAsinSalesByAsinOrderedProductSalesCurrencyCode;
    @Basic
    @Column(name = "salesAndTrafficByAsin.salesByAsin.orderedProductSalesB2B")
    private Object salesAndTrafficByAsinSalesByAsinOrderedProductSalesB2B;
    @Basic
    @Column(name = "salesAndTrafficByAsin.salesByAsin.orderedProductSalesB2B.amount")
    private Integer salesAndTrafficByAsinSalesByAsinOrderedProductSalesB2BAmount;
    @Basic
    @Column(name = "salesAndTrafficByAsin.salesByAsin.orderedProductSalesB2B.currencyCode")
    private String salesAndTrafficByAsinSalesByAsinOrderedProductSalesB2BCurrencyCode;
    @Basic
    @Column(name = "salesAndTrafficByAsin.salesByAsin.totalOrderItems")
    private Integer salesAndTrafficByAsinSalesByAsinTotalOrderItems;
    @Basic
    @Column(name = "salesAndTrafficByAsin.salesByAsin.totalOrderItemsB2B")
    private Integer salesAndTrafficByAsinSalesByAsinTotalOrderItemsB2B;
    @Basic
    @Column(name = "salesAndTrafficByAsin.salesByAsin.unitsOrdered")
    private Integer salesAndTrafficByAsinSalesByAsinUnitsOrdered;
    @Basic
    @Column(name = "salesAndTrafficByAsin.salesByAsin.unitsOrderedB2B")
    private Integer salesAndTrafficByAsinSalesByAsinUnitsOrderedB2B;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin")
    private Object salesAndTrafficByAsinTrafficByAsin;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.browserPageViews")
    private Integer salesAndTrafficByAsinTrafficByAsinBrowserPageViews;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.browserPageViewsB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinBrowserPageViewsB2B;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.browserPageViewsPercentage")
    private Double salesAndTrafficByAsinTrafficByAsinBrowserPageViewsPercentage;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.browserPageViewsPercentageB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinBrowserPageViewsPercentageB2B;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.browserSessionPercentage")
    private Double salesAndTrafficByAsinTrafficByAsinBrowserSessionPercentage;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.browserSessionPercentageB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinBrowserSessionPercentageB2B;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.browserSessions")
    private Integer salesAndTrafficByAsinTrafficByAsinBrowserSessions;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.browserSessionsB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinBrowserSessionsB2B;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.buyBoxPercentage")
    private Integer salesAndTrafficByAsinTrafficByAsinBuyBoxPercentage;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.buyBoxPercentageB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinBuyBoxPercentageB2B;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.mobileAppPageViews")
    private Integer salesAndTrafficByAsinTrafficByAsinMobileAppPageViews;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.mobileAppPageViewsB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinMobileAppPageViewsB2B;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.mobileAppPageViewsPercentage")
    private Double salesAndTrafficByAsinTrafficByAsinMobileAppPageViewsPercentage;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.mobileAppPageViewsPercentageB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinMobileAppPageViewsPercentageB2B;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.mobileAppSessionPercentage")
    private Double salesAndTrafficByAsinTrafficByAsinMobileAppSessionPercentage;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.mobileAppSessionPercentageB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinMobileAppSessionPercentageB2B;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.mobileAppSessions")
    private Integer salesAndTrafficByAsinTrafficByAsinMobileAppSessions;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.mobileAppSessionsB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinMobileAppSessionsB2B;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.pageViews")
    private Integer salesAndTrafficByAsinTrafficByAsinPageViews;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.pageViewsB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinPageViewsB2B;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.pageViewsPercentage")
    private Double salesAndTrafficByAsinTrafficByAsinPageViewsPercentage;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.pageViewsPercentageB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinPageViewsPercentageB2B;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.sessionPercentage")
    private Double salesAndTrafficByAsinTrafficByAsinSessionPercentage;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.sessionPercentageB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinSessionPercentageB2B;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.sessions")
    private Integer salesAndTrafficByAsinTrafficByAsinSessions;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.sessionsB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinSessionsB2B;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.unitSessionPercentage")
    private Double salesAndTrafficByAsinTrafficByAsinUnitSessionPercentage;
    @Basic
    @Column(name = "salesAndTrafficByAsin.trafficByAsin.unitSessionPercentageB2B")
    private Integer salesAndTrafficByAsinTrafficByAsinUnitSessionPercentageB2B;
    @Basic
    @Column(name = "salesAndTrafficByDate")
    private Object salesAndTrafficByDate;
    @Basic
    @Column(name = "salesAndTrafficByDate.date")
    private String salesAndTrafficByDateDate;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate")
    private Object salesAndTrafficByDateSalesByDate;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.averageSalesPerOrderItem")
    private Object salesAndTrafficByDateSalesByDateAverageSalesPerOrderItem;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.averageSalesPerOrderItem.amount")
    private Double salesAndTrafficByDateSalesByDateAverageSalesPerOrderItemAmount;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.averageSalesPerOrderItem.currencyCode")
    private String salesAndTrafficByDateSalesByDateAverageSalesPerOrderItemCurrencyCode;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.averageSalesPerOrderItemB2B")
    private Object salesAndTrafficByDateSalesByDateAverageSalesPerOrderItemB2B;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.averageSalesPerOrderItemB2B.amount")
    private Double salesAndTrafficByDateSalesByDateAverageSalesPerOrderItemB2BAmount;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.averageSalesPerOrderItemB2B.currencyCode")
    private String salesAndTrafficByDateSalesByDateAverageSalesPerOrderItemB2BCurrencyCode;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.averageSellingPrice")
    private Object salesAndTrafficByDateSalesByDateAverageSellingPrice;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.averageSellingPrice.amount")
    private Double salesAndTrafficByDateSalesByDateAverageSellingPriceAmount;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.averageSellingPrice.currencyCode")
    private String salesAndTrafficByDateSalesByDateAverageSellingPriceCurrencyCode;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.averageSellingPriceB2B")
    private Object salesAndTrafficByDateSalesByDateAverageSellingPriceB2B;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.averageSellingPriceB2B.amount")
    private Double salesAndTrafficByDateSalesByDateAverageSellingPriceB2BAmount;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.averageSellingPriceB2B.currencyCode")
    private String salesAndTrafficByDateSalesByDateAverageSellingPriceB2BCurrencyCode;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.averageUnitsPerOrderItem")
    private Double salesAndTrafficByDateSalesByDateAverageUnitsPerOrderItem;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.averageUnitsPerOrderItemB2B")
    private Double salesAndTrafficByDateSalesByDateAverageUnitsPerOrderItemB2B;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.claimsAmount")
    private Object salesAndTrafficByDateSalesByDateClaimsAmount;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.claimsAmount.amount")
    private Integer salesAndTrafficByDateSalesByDateClaimsAmountAmount;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.claimsAmount.currencyCode")
    private String salesAndTrafficByDateSalesByDateClaimsAmountCurrencyCode;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.claimsGranted")
    private Integer salesAndTrafficByDateSalesByDateClaimsGranted;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.orderedProductSales")
    private Object salesAndTrafficByDateSalesByDateOrderedProductSales;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.orderedProductSales.amount")
    private Double salesAndTrafficByDateSalesByDateOrderedProductSalesAmount;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.orderedProductSales.currencyCode")
    private String salesAndTrafficByDateSalesByDateOrderedProductSalesCurrencyCode;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.orderedProductSalesB2B")
    private Object salesAndTrafficByDateSalesByDateOrderedProductSalesB2B;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.orderedProductSalesB2B.amount")
    private Double salesAndTrafficByDateSalesByDateOrderedProductSalesB2BAmount;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.orderedProductSalesB2B.currencyCode")
    private String salesAndTrafficByDateSalesByDateOrderedProductSalesB2BCurrencyCode;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.ordersShipped")
    private Integer salesAndTrafficByDateSalesByDateOrdersShipped;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.refundRate")
    private Double salesAndTrafficByDateSalesByDateRefundRate;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.shippedProductSales")
    private Object salesAndTrafficByDateSalesByDateShippedProductSales;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.shippedProductSales.amount")
    private Double salesAndTrafficByDateSalesByDateShippedProductSalesAmount;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.shippedProductSales.currencyCode")
    private String salesAndTrafficByDateSalesByDateShippedProductSalesCurrencyCode;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.totalOrderItems")
    private Integer salesAndTrafficByDateSalesByDateTotalOrderItems;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.totalOrderItemsB2B")
    private Integer salesAndTrafficByDateSalesByDateTotalOrderItemsB2B;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.unitsOrdered")
    private Integer salesAndTrafficByDateSalesByDateUnitsOrdered;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.unitsOrderedB2B")
    private Integer salesAndTrafficByDateSalesByDateUnitsOrderedB2B;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.unitsRefunded")
    private Integer salesAndTrafficByDateSalesByDateUnitsRefunded;
    @Basic
    @Column(name = "salesAndTrafficByDate.salesByDate.unitsShipped")
    private Integer salesAndTrafficByDateSalesByDateUnitsShipped;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate")
    private Object salesAndTrafficByDateTrafficByDate;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.averageOfferCount")
    private Integer salesAndTrafficByDateTrafficByDateAverageOfferCount;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.averageParentItems")
    private Integer salesAndTrafficByDateTrafficByDateAverageParentItems;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.browserPageViews")
    private Integer salesAndTrafficByDateTrafficByDateBrowserPageViews;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.browserPageViewsB2B")
    private Integer salesAndTrafficByDateTrafficByDateBrowserPageViewsB2B;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.browserSessions")
    private Integer salesAndTrafficByDateTrafficByDateBrowserSessions;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.browserSessionsB2B")
    private Integer salesAndTrafficByDateTrafficByDateBrowserSessionsB2B;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.buyBoxPercentage")
    private Double salesAndTrafficByDateTrafficByDateBuyBoxPercentage;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.buyBoxPercentageB2B")
    private Double salesAndTrafficByDateTrafficByDateBuyBoxPercentageB2B;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.feedbackReceived")
    private Integer salesAndTrafficByDateTrafficByDateFeedbackReceived;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.mobileAppPageViews")
    private Integer salesAndTrafficByDateTrafficByDateMobileAppPageViews;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.mobileAppPageViewsB2B")
    private Integer salesAndTrafficByDateTrafficByDateMobileAppPageViewsB2B;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.mobileAppSessions")
    private Integer salesAndTrafficByDateTrafficByDateMobileAppSessions;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.mobileAppSessionsB2B")
    private Integer salesAndTrafficByDateTrafficByDateMobileAppSessionsB2B;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.negativeFeedbackReceived")
    private Integer salesAndTrafficByDateTrafficByDateNegativeFeedbackReceived;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.orderItemSessionPercentage")
    private Double salesAndTrafficByDateTrafficByDateOrderItemSessionPercentage;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.orderItemSessionPercentageB2B")
    private Double salesAndTrafficByDateTrafficByDateOrderItemSessionPercentageB2B;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.pageViews")
    private Integer salesAndTrafficByDateTrafficByDatePageViews;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.pageViewsB2B")
    private Integer salesAndTrafficByDateTrafficByDatePageViewsB2B;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.receivedNegativeFeedbackRate")
    private Integer salesAndTrafficByDateTrafficByDateReceivedNegativeFeedbackRate;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.sessions")
    private Integer salesAndTrafficByDateTrafficByDateSessions;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.sessionsB2B")
    private Integer salesAndTrafficByDateTrafficByDateSessionsB2B;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.unitSessionPercentage")
    private Double salesAndTrafficByDateTrafficByDateUnitSessionPercentage;
    @Basic
    @Column(name = "salesAndTrafficByDate.trafficByDate.unitSessionPercentageB2B")
    private Integer salesAndTrafficByDateTrafficByDateUnitSessionPercentageB2B;

}
