package com.betfair.aping.account.entities;

import java.util.Date;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class StatementLegacyData {
    /**
    * The average matched price of the bet (null if no part has been matched)
    */
    private Double avgPrice;
    /**
    * The amount of the stake of your bet. (0 for commission payments or deposit/withdrawals)
    */
    private Double betSize;
    /**
    * Back or lay
    */
    private String betType;
    /**
    * Exchange, Market on Close SP bet, or Limit on Close SP bet.
    */
    private String betCategoryType;
    /**
    * Commission rate on market
    */
    private String commissionRate;
    /**
    * Please note: this is the Id of the market without the associated exchangeId
    */
    private Long eventId;
    /**
    * Event Type
    */
    private Long eventTypeId;
    /**
    * Full Market Name. For card payment items, this field contains the card name
    */
    private String fullMarketName;
    /**
    * Gross Bet Amount
    */
    private Double grossBetAmount;
    /**
    * Market Name. For card transactions, this field indicates the type of card transaction (deposit, deposit fee, or withdrawal).
    */
    private String marketName;
    /**
    * Market type - please see Chapter 61. For account deposits and withdrawals, marketType is set to NOT_APPLICABLE.
    */
    private String marketType;
    /**
    * Date and time of bet placement
    */
    private Date placedDate;
    /**
    * Id of the selection (this will be the same for the same selection across markets)
    */
    private Long selectionId;
    /**
    * Name of the selection
    */
    private String selectionName;
    /**
    * Date and time at the bet portion was settled
    */
    private Date startDate;
    /**
    * Debit or credit
    */
    private String transactionType;
    private Long transactionId;
    /**
    * Win or loss
    */
    private String winLose;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * The average matched price of the bet (null if no part has been matched)
    */
    public Double getAvgPrice(){
        return avgPrice;
    }
     /**
    * The average matched price of the bet (null if no part has been matched)
    */
    public void setAvgPrice(Double avgPrice){
        this.avgPrice = avgPrice;
    }
     
     /**
    * The amount of the stake of your bet. (0 for commission payments or deposit/withdrawals)
    */
    public Double getBetSize(){
        return betSize;
    }
     /**
    * The amount of the stake of your bet. (0 for commission payments or deposit/withdrawals)
    */
    public void setBetSize(Double betSize){
        this.betSize = betSize;
    }
     
     /**
    * Back or lay
    */
    public String getBetType(){
        return betType;
    }
     /**
    * Back or lay
    */
    public void setBetType(String betType){
        this.betType = betType;
    }
     
     /**
    * Exchange, Market on Close SP bet, or Limit on Close SP bet.
    */
    public String getBetCategoryType(){
        return betCategoryType;
    }
     /**
    * Exchange, Market on Close SP bet, or Limit on Close SP bet.
    */
    public void setBetCategoryType(String betCategoryType){
        this.betCategoryType = betCategoryType;
    }
     
     /**
    * Commission rate on market
    */
    public String getCommissionRate(){
        return commissionRate;
    }
     /**
    * Commission rate on market
    */
    public void setCommissionRate(String commissionRate){
        this.commissionRate = commissionRate;
    }
     
     /**
    * Please note: this is the Id of the market without the associated exchangeId
    */
    public Long getEventId(){
        return eventId;
    }
     /**
    * Please note: this is the Id of the market without the associated exchangeId
    */
    public void setEventId(Long eventId){
        this.eventId = eventId;
    }
     
     /**
    * Event Type
    */
    public Long getEventTypeId(){
        return eventTypeId;
    }
     /**
    * Event Type
    */
    public void setEventTypeId(Long eventTypeId){
        this.eventTypeId = eventTypeId;
    }
     
     /**
    * Full Market Name. For card payment items, this field contains the card name
    */
    public String getFullMarketName(){
        return fullMarketName;
    }
     /**
    * Full Market Name. For card payment items, this field contains the card name
    */
    public void setFullMarketName(String fullMarketName){
        this.fullMarketName = fullMarketName;
    }
     
     /**
    * Gross Bet Amount
    */
    public Double getGrossBetAmount(){
        return grossBetAmount;
    }
     /**
    * Gross Bet Amount
    */
    public void setGrossBetAmount(Double grossBetAmount){
        this.grossBetAmount = grossBetAmount;
    }
     
     /**
    * Market Name. For card transactions, this field indicates the type of card transaction (deposit, deposit fee, or withdrawal).
    */
    public String getMarketName(){
        return marketName;
    }
     /**
    * Market Name. For card transactions, this field indicates the type of card transaction (deposit, deposit fee, or withdrawal).
    */
    public void setMarketName(String marketName){
        this.marketName = marketName;
    }
     
     /**
    * Market type - please see Chapter 61. For account deposits and withdrawals, marketType is set to NOT_APPLICABLE.
    */
    public String getMarketType(){
        return marketType;
    }
     /**
    * Market type - please see Chapter 61. For account deposits and withdrawals, marketType is set to NOT_APPLICABLE.
    */
    public void setMarketType(String marketType){
        this.marketType = marketType;
    }
     
     /**
    * Date and time of bet placement
    */
    public Date getPlacedDate(){
        return placedDate;
    }
     /**
    * Date and time of bet placement
    */
    public void setPlacedDate(Date placedDate){
        this.placedDate = placedDate;
    }
     
     /**
    * Id of the selection (this will be the same for the same selection across markets)
    */
    public Long getSelectionId(){
        return selectionId;
    }
     /**
    * Id of the selection (this will be the same for the same selection across markets)
    */
    public void setSelectionId(Long selectionId){
        this.selectionId = selectionId;
    }
     
     /**
    * Name of the selection
    */
    public String getSelectionName(){
        return selectionName;
    }
     /**
    * Name of the selection
    */
    public void setSelectionName(String selectionName){
        this.selectionName = selectionName;
    }
     
     /**
    * Date and time at the bet portion was settled
    */
    public Date getStartDate(){
        return startDate;
    }
     /**
    * Date and time at the bet portion was settled
    */
    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }
     
     /**
    * Debit or credit
    */
    public String getTransactionType(){
        return transactionType;
    }
     /**
    * Debit or credit
    */
    public void setTransactionType(String transactionType){
        this.transactionType = transactionType;
    }
     
     
    public Long getTransactionId(){
        return transactionId;
    }
     
    public void setTransactionId(Long transactionId){
        this.transactionId = transactionId;
    }
     
     /**
    * Win or loss
    */
    public String getWinLose(){
        return winLose;
    }
     /**
    * Win or loss
    */
    public void setWinLose(String winLose){
        this.winLose = winLose;
    }
    
}
