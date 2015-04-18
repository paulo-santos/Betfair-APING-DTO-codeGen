package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.OrderStatus;
import com.betfair.aping.betting.enums.OrderType;
import com.betfair.aping.betting.enums.PersistenceType;
import com.betfair.aping.betting.enums.Side;
import java.util.Date;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class CurrentOrderSummary {
    /**
    * REQUIRED
    * The bet ID of the original place order.
    */
    private String betId;
    /**
    * REQUIRED
    * The market id the order is for.
    */
    private String marketId;
    /**
    * REQUIRED
    * The selection id the order is for.
    */
    private Long selectionId;
    /**
    * REQUIRED
    * The handicap associated with the runner in case of Asian handicap markets, null otherwise.
    */
    private Double handicap;
    /**
    * REQUIRED
    * The price and size of the bet.
    */
    private PriceSize priceSize;
    /**
    * REQUIRED
    * Not to be confused with size. This is the liability of a given BSP bet.
    */
    private Double bspLiability;
    /**
    * REQUIRED
    * BACK/LAY
    */
    private Side side;
    /**
    * REQUIRED
    * Either EXECUTABLE (an unmatched amount remains) or EXECUTION_COMPLETE (no unmatched amount remains).
    */
    private OrderStatus status;
    /**
    * REQUIRED
    * What to do with the order at turn-in-play.
    */
    private PersistenceType persistenceType;
    /**
    * REQUIRED
    * BSP Order type.
    */
    private OrderType orderType;
    /**
    * REQUIRED
    * The date, to the second, the bet was placed.
    */
    private Date placedDate;
    /**
    * REQUIRED
    * The date, to the second, of the last matched bet fragment (where applicable)
    */
    private Date matchedDate;
    /**
    * The average price matched at. Voided match fragments are removed from this average calculation. The price is automatically adjusted in the event of non runners being declared with applicable reduction factors.
    */
    private Double averagePriceMatched;
    /**
    * The current amount of this bet that was matched.
    */
    private Double sizeMatched;
    /**
    * The current amount of this bet that is unmatched.
    */
    private Double sizeRemaining;
    /**
    * The current amount of this bet that was lapsed.
    */
    private Double sizeLapsed;
    /**
    * The current amount of this bet that was cancelled.
    */
    private Double sizeCancelled;
    /**
    * The current amount of this bet that was voided.
    */
    private Double sizeVoided;
    /**
    * The regulator authorisation code.
    */
    private String regulatorAuthCode;
    /**
    * The regulator Code.
    */
    private String regulatorCode;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * REQUIRED
    * The bet ID of the original place order.
    */
    public String getBetId(){
        return betId;
    }
     /**
    * REQUIRED
    * The bet ID of the original place order.
    */
    public void setBetId(String betId){
        this.betId = betId;
    }
     
     /**
    * REQUIRED
    * The market id the order is for.
    */
    public String getMarketId(){
        return marketId;
    }
     /**
    * REQUIRED
    * The market id the order is for.
    */
    public void setMarketId(String marketId){
        this.marketId = marketId;
    }
     
     /**
    * REQUIRED
    * The selection id the order is for.
    */
    public Long getSelectionId(){
        return selectionId;
    }
     /**
    * REQUIRED
    * The selection id the order is for.
    */
    public void setSelectionId(Long selectionId){
        this.selectionId = selectionId;
    }
     
     /**
    * REQUIRED
    * The handicap associated with the runner in case of Asian handicap markets, null otherwise.
    */
    public Double getHandicap(){
        return handicap;
    }
     /**
    * REQUIRED
    * The handicap associated with the runner in case of Asian handicap markets, null otherwise.
    */
    public void setHandicap(Double handicap){
        this.handicap = handicap;
    }
     
     /**
    * REQUIRED
    * The price and size of the bet.
    */
    public PriceSize getPriceSize(){
        return priceSize;
    }
     /**
    * REQUIRED
    * The price and size of the bet.
    */
    public void setPriceSize(PriceSize priceSize){
        this.priceSize = priceSize;
    }
     
     /**
    * REQUIRED
    * Not to be confused with size. This is the liability of a given BSP bet.
    */
    public Double getBspLiability(){
        return bspLiability;
    }
     /**
    * REQUIRED
    * Not to be confused with size. This is the liability of a given BSP bet.
    */
    public void setBspLiability(Double bspLiability){
        this.bspLiability = bspLiability;
    }
     
     /**
    * REQUIRED
    * BACK/LAY
    */
    public Side getSide(){
        return side;
    }
     /**
    * REQUIRED
    * BACK/LAY
    */
    public void setSide(Side side){
        this.side = side;
    }
     
     /**
    * REQUIRED
    * Either EXECUTABLE (an unmatched amount remains) or EXECUTION_COMPLETE (no unmatched amount remains).
    */
    public OrderStatus getStatus(){
        return status;
    }
     /**
    * REQUIRED
    * Either EXECUTABLE (an unmatched amount remains) or EXECUTION_COMPLETE (no unmatched amount remains).
    */
    public void setStatus(OrderStatus status){
        this.status = status;
    }
     
     /**
    * REQUIRED
    * What to do with the order at turn-in-play.
    */
    public PersistenceType getPersistenceType(){
        return persistenceType;
    }
     /**
    * REQUIRED
    * What to do with the order at turn-in-play.
    */
    public void setPersistenceType(PersistenceType persistenceType){
        this.persistenceType = persistenceType;
    }
     
     /**
    * REQUIRED
    * BSP Order type.
    */
    public OrderType getOrderType(){
        return orderType;
    }
     /**
    * REQUIRED
    * BSP Order type.
    */
    public void setOrderType(OrderType orderType){
        this.orderType = orderType;
    }
     
     /**
    * REQUIRED
    * The date, to the second, the bet was placed.
    */
    public Date getPlacedDate(){
        return placedDate;
    }
     /**
    * REQUIRED
    * The date, to the second, the bet was placed.
    */
    public void setPlacedDate(Date placedDate){
        this.placedDate = placedDate;
    }
     
     /**
    * REQUIRED
    * The date, to the second, of the last matched bet fragment (where applicable)
    */
    public Date getMatchedDate(){
        return matchedDate;
    }
     /**
    * REQUIRED
    * The date, to the second, of the last matched bet fragment (where applicable)
    */
    public void setMatchedDate(Date matchedDate){
        this.matchedDate = matchedDate;
    }
     
     /**
    * The average price matched at. Voided match fragments are removed from this average calculation. The price is automatically adjusted in the event of non runners being declared with applicable reduction factors.
    */
    public Double getAveragePriceMatched(){
        return averagePriceMatched;
    }
     /**
    * The average price matched at. Voided match fragments are removed from this average calculation. The price is automatically adjusted in the event of non runners being declared with applicable reduction factors.
    */
    public void setAveragePriceMatched(Double averagePriceMatched){
        this.averagePriceMatched = averagePriceMatched;
    }
     
     /**
    * The current amount of this bet that was matched.
    */
    public Double getSizeMatched(){
        return sizeMatched;
    }
     /**
    * The current amount of this bet that was matched.
    */
    public void setSizeMatched(Double sizeMatched){
        this.sizeMatched = sizeMatched;
    }
     
     /**
    * The current amount of this bet that is unmatched.
    */
    public Double getSizeRemaining(){
        return sizeRemaining;
    }
     /**
    * The current amount of this bet that is unmatched.
    */
    public void setSizeRemaining(Double sizeRemaining){
        this.sizeRemaining = sizeRemaining;
    }
     
     /**
    * The current amount of this bet that was lapsed.
    */
    public Double getSizeLapsed(){
        return sizeLapsed;
    }
     /**
    * The current amount of this bet that was lapsed.
    */
    public void setSizeLapsed(Double sizeLapsed){
        this.sizeLapsed = sizeLapsed;
    }
     
     /**
    * The current amount of this bet that was cancelled.
    */
    public Double getSizeCancelled(){
        return sizeCancelled;
    }
     /**
    * The current amount of this bet that was cancelled.
    */
    public void setSizeCancelled(Double sizeCancelled){
        this.sizeCancelled = sizeCancelled;
    }
     
     /**
    * The current amount of this bet that was voided.
    */
    public Double getSizeVoided(){
        return sizeVoided;
    }
     /**
    * The current amount of this bet that was voided.
    */
    public void setSizeVoided(Double sizeVoided){
        this.sizeVoided = sizeVoided;
    }
     
     /**
    * The regulator authorisation code.
    */
    public String getRegulatorAuthCode(){
        return regulatorAuthCode;
    }
     /**
    * The regulator authorisation code.
    */
    public void setRegulatorAuthCode(String regulatorAuthCode){
        this.regulatorAuthCode = regulatorAuthCode;
    }
     
     /**
    * The regulator Code.
    */
    public String getRegulatorCode(){
        return regulatorCode;
    }
     /**
    * The regulator Code.
    */
    public void setRegulatorCode(String regulatorCode){
        this.regulatorCode = regulatorCode;
    }
    
}
