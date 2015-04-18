package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.OrderType;
import com.betfair.aping.betting.enums.PersistenceType;
import com.betfair.aping.betting.enums.Side;
import java.util.Date;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class ClearedOrderSummary {
    /**
    * The id of the event type bet on. Available at EVENT_TYPE groupBy level or lower.
    */
    private String eventTypeId;
    /**
    * The id of the event bet on. Available at EVENT groupBy level or lower.
    */
    private String eventId;
    /**
    * The id of the market bet on. Available at MARKET groupBy level or lower.
    */
    private String marketId;
    /**
    * The id of the selection bet on. Available at RUNNER groupBy level or lower.
    */
    private Long selectionId;
    /**
    * The id of the market bet on. Available at MARKET groupBy level or lower.
    */
    private Double handicap;
    /**
    * The id of the bet. Available at BET groupBy level.
    */
    private String betId;
    /**
    * The date the bet order was placed by the customer. Only available at BET groupBy level.
    */
    private Date placedDate;
    /**
    * The turn in play persistence state of the order at bet placement time. This field will be empty or omitted on true SP bets. Only available at BET groupBy level.
    */
    private PersistenceType persistenceType;
    /**
    * The type of bet (e.g standard limited-liability Exchange bet (LIMIT), a standard BSP bet (MARKET_ON_CLOSE), or a minimum-accepted-price BSP bet (LIMIT_ON_CLOSE)). If the bet has a OrderType of MARKET_ON_CLOSE and a persistenceType of MARKET_ON_CLOSE then it is a bet which has transitioned from LIMIT to MARKET_ON_CLOSE. Only available at BET groupBy level.
    */
    private OrderType orderType;
    /**
    * Whether the bet was a back or lay bet. Available at SIDE groupBy level or lower.
    */
    private Side side;
    /**
    * A container for all the ancillary data and localised text valid for this Item
    */
    private ItemDescription itemDescription;
    /**
    * The average requested price across all settled bet orders under this Item. Available at SIDE groupBy level or lower.
    */
    private Double priceRequested;
    /**
    * The date and time the bet order was settled by Betfair. Available at SIDE groupBy level or lower.
    */
    private Date settledDate;
    /**
    * The number of actual bets within this grouping (will be 1 for BET groupBy)
    */
    private Integer betCount;
    /**
    * The cumulative amount of commission paid by the customer across all bets under this Item, in the account currency. Available at EXCHANGE, EVENT_TYPE, EVENT and MARKET level groupings only.
    */
    private Double commission;
    /**
    * The average matched price across all settled bets or bet fragments under this Item. Available at SIDE groupBy level or lower.
    */
    private Double priceMatched;
    /**
    * If true, then the matched price was affected by a reduction factor due to of a runner removal from this Horse Racing market.
    */
    private Boolean priceReduced;
    /**
    * The cumulative bet size that was settled as matched or voided under this Item, in the account currency. Available at SIDE groupBy level or lower.
    */
    private Double sizeSettled;
    /**
    * The profit or loss (negative profit) gained on this line, in the account currency
    */
    private Double profit;
    /**
    * The amount of the bet that was available to be matched, before cancellation or lapsing, in the account currency
    */
    private Double sizeCancelled;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * The id of the event type bet on. Available at EVENT_TYPE groupBy level or lower.
    */
    public String getEventTypeId(){
        return eventTypeId;
    }
     /**
    * The id of the event type bet on. Available at EVENT_TYPE groupBy level or lower.
    */
    public void setEventTypeId(String eventTypeId){
        this.eventTypeId = eventTypeId;
    }
     
     /**
    * The id of the event bet on. Available at EVENT groupBy level or lower.
    */
    public String getEventId(){
        return eventId;
    }
     /**
    * The id of the event bet on. Available at EVENT groupBy level or lower.
    */
    public void setEventId(String eventId){
        this.eventId = eventId;
    }
     
     /**
    * The id of the market bet on. Available at MARKET groupBy level or lower.
    */
    public String getMarketId(){
        return marketId;
    }
     /**
    * The id of the market bet on. Available at MARKET groupBy level or lower.
    */
    public void setMarketId(String marketId){
        this.marketId = marketId;
    }
     
     /**
    * The id of the selection bet on. Available at RUNNER groupBy level or lower.
    */
    public Long getSelectionId(){
        return selectionId;
    }
     /**
    * The id of the selection bet on. Available at RUNNER groupBy level or lower.
    */
    public void setSelectionId(Long selectionId){
        this.selectionId = selectionId;
    }
     
     /**
    * The id of the market bet on. Available at MARKET groupBy level or lower.
    */
    public Double getHandicap(){
        return handicap;
    }
     /**
    * The id of the market bet on. Available at MARKET groupBy level or lower.
    */
    public void setHandicap(Double handicap){
        this.handicap = handicap;
    }
     
     /**
    * The id of the bet. Available at BET groupBy level.
    */
    public String getBetId(){
        return betId;
    }
     /**
    * The id of the bet. Available at BET groupBy level.
    */
    public void setBetId(String betId){
        this.betId = betId;
    }
     
     /**
    * The date the bet order was placed by the customer. Only available at BET groupBy level.
    */
    public Date getPlacedDate(){
        return placedDate;
    }
     /**
    * The date the bet order was placed by the customer. Only available at BET groupBy level.
    */
    public void setPlacedDate(Date placedDate){
        this.placedDate = placedDate;
    }
     
     /**
    * The turn in play persistence state of the order at bet placement time. This field will be empty or omitted on true SP bets. Only available at BET groupBy level.
    */
    public PersistenceType getPersistenceType(){
        return persistenceType;
    }
     /**
    * The turn in play persistence state of the order at bet placement time. This field will be empty or omitted on true SP bets. Only available at BET groupBy level.
    */
    public void setPersistenceType(PersistenceType persistenceType){
        this.persistenceType = persistenceType;
    }
     
     /**
    * The type of bet (e.g standard limited-liability Exchange bet (LIMIT), a standard BSP bet (MARKET_ON_CLOSE), or a minimum-accepted-price BSP bet (LIMIT_ON_CLOSE)). If the bet has a OrderType of MARKET_ON_CLOSE and a persistenceType of MARKET_ON_CLOSE then it is a bet which has transitioned from LIMIT to MARKET_ON_CLOSE. Only available at BET groupBy level.
    */
    public OrderType getOrderType(){
        return orderType;
    }
     /**
    * The type of bet (e.g standard limited-liability Exchange bet (LIMIT), a standard BSP bet (MARKET_ON_CLOSE), or a minimum-accepted-price BSP bet (LIMIT_ON_CLOSE)). If the bet has a OrderType of MARKET_ON_CLOSE and a persistenceType of MARKET_ON_CLOSE then it is a bet which has transitioned from LIMIT to MARKET_ON_CLOSE. Only available at BET groupBy level.
    */
    public void setOrderType(OrderType orderType){
        this.orderType = orderType;
    }
     
     /**
    * Whether the bet was a back or lay bet. Available at SIDE groupBy level or lower.
    */
    public Side getSide(){
        return side;
    }
     /**
    * Whether the bet was a back or lay bet. Available at SIDE groupBy level or lower.
    */
    public void setSide(Side side){
        this.side = side;
    }
     
     /**
    * A container for all the ancillary data and localised text valid for this Item
    */
    public ItemDescription getItemDescription(){
        return itemDescription;
    }
     /**
    * A container for all the ancillary data and localised text valid for this Item
    */
    public void setItemDescription(ItemDescription itemDescription){
        this.itemDescription = itemDescription;
    }
     
     /**
    * The average requested price across all settled bet orders under this Item. Available at SIDE groupBy level or lower.
    */
    public Double getPriceRequested(){
        return priceRequested;
    }
     /**
    * The average requested price across all settled bet orders under this Item. Available at SIDE groupBy level or lower.
    */
    public void setPriceRequested(Double priceRequested){
        this.priceRequested = priceRequested;
    }
     
     /**
    * The date and time the bet order was settled by Betfair. Available at SIDE groupBy level or lower.
    */
    public Date getSettledDate(){
        return settledDate;
    }
     /**
    * The date and time the bet order was settled by Betfair. Available at SIDE groupBy level or lower.
    */
    public void setSettledDate(Date settledDate){
        this.settledDate = settledDate;
    }
     
     /**
    * The number of actual bets within this grouping (will be 1 for BET groupBy)
    */
    public Integer getBetCount(){
        return betCount;
    }
     /**
    * The number of actual bets within this grouping (will be 1 for BET groupBy)
    */
    public void setBetCount(Integer betCount){
        this.betCount = betCount;
    }
     
     /**
    * The cumulative amount of commission paid by the customer across all bets under this Item, in the account currency. Available at EXCHANGE, EVENT_TYPE, EVENT and MARKET level groupings only.
    */
    public Double getCommission(){
        return commission;
    }
     /**
    * The cumulative amount of commission paid by the customer across all bets under this Item, in the account currency. Available at EXCHANGE, EVENT_TYPE, EVENT and MARKET level groupings only.
    */
    public void setCommission(Double commission){
        this.commission = commission;
    }
     
     /**
    * The average matched price across all settled bets or bet fragments under this Item. Available at SIDE groupBy level or lower.
    */
    public Double getPriceMatched(){
        return priceMatched;
    }
     /**
    * The average matched price across all settled bets or bet fragments under this Item. Available at SIDE groupBy level or lower.
    */
    public void setPriceMatched(Double priceMatched){
        this.priceMatched = priceMatched;
    }
     
     /**
    * If true, then the matched price was affected by a reduction factor due to of a runner removal from this Horse Racing market.
    */
    public Boolean getPriceReduced(){
        return priceReduced;
    }
     /**
    * If true, then the matched price was affected by a reduction factor due to of a runner removal from this Horse Racing market.
    */
    public void setPriceReduced(Boolean priceReduced){
        this.priceReduced = priceReduced;
    }
     
     /**
    * The cumulative bet size that was settled as matched or voided under this Item, in the account currency. Available at SIDE groupBy level or lower.
    */
    public Double getSizeSettled(){
        return sizeSettled;
    }
     /**
    * The cumulative bet size that was settled as matched or voided under this Item, in the account currency. Available at SIDE groupBy level or lower.
    */
    public void setSizeSettled(Double sizeSettled){
        this.sizeSettled = sizeSettled;
    }
     
     /**
    * The profit or loss (negative profit) gained on this line, in the account currency
    */
    public Double getProfit(){
        return profit;
    }
     /**
    * The profit or loss (negative profit) gained on this line, in the account currency
    */
    public void setProfit(Double profit){
        this.profit = profit;
    }
     
     /**
    * The amount of the bet that was available to be matched, before cancellation or lapsing, in the account currency
    */
    public Double getSizeCancelled(){
        return sizeCancelled;
    }
     /**
    * The amount of the bet that was available to be matched, before cancellation or lapsing, in the account currency
    */
    public void setSizeCancelled(Double sizeCancelled){
        this.sizeCancelled = sizeCancelled;
    }
    
}
