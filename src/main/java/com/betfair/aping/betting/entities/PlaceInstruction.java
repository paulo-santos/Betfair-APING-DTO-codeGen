package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.OrderType;
import com.betfair.aping.betting.enums.Side;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class PlaceInstruction {
    private OrderType orderType;
    /**
    * REQUIRED
    * The selection_id.
    */
    private Long selectionId;
    /**
    * The handicap associated with the runner in case of Asian handicap markets, null otherwise.
    */
    private Double handicap;
    /**
    * REQUIRED
    * Back or Lay
    */
    private Side side;
    /**
    * A simple exchange bet for immediate execution
    */
    private LimitOrder limitOrder;
    /**
    * Bets are matched if, and only if, the returned starting price is better than a specified price. In the case of back bets, LOC bets are matched if the calculated starting price is greater than the specified price. In the case of lay bets, LOC bets are matched if the starting price is less than the specified price. If the specified limit is equal to the starting price, then it may be matched, partially matched, or may not be matched at all, depending on how much is needed to balance all bets against each other (MOC, LOC and normal exchange bets)
    */
    private LimitOnCloseOrder limitOnCloseOrder;
    /**
    * Bets remain unmatched until the market is reconciled. They are matched and settled at a price that is representative of the market at the point the market is turned in-play. The market is reconciled to find a starting price and MOC bets are settled at whatever starting price is returned. MOC bets are always matched and settled, unless a starting price is not available for the selection. Market on Close bets can only be placed before the starting price is determined
    */
    private MarketOnCloseOrder marketOnCloseOrder;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    public OrderType getOrderType(){
        return orderType;
    }
     
    public void setOrderType(OrderType orderType){
        this.orderType = orderType;
    }
     
     /**
    * REQUIRED
    * The selection_id.
    */
    public Long getSelectionId(){
        return selectionId;
    }
     /**
    * REQUIRED
    * The selection_id.
    */
    public void setSelectionId(Long selectionId){
        this.selectionId = selectionId;
    }
     
     /**
    * The handicap associated with the runner in case of Asian handicap markets, null otherwise.
    */
    public Double getHandicap(){
        return handicap;
    }
     /**
    * The handicap associated with the runner in case of Asian handicap markets, null otherwise.
    */
    public void setHandicap(Double handicap){
        this.handicap = handicap;
    }
     
     /**
    * REQUIRED
    * Back or Lay
    */
    public Side getSide(){
        return side;
    }
     /**
    * REQUIRED
    * Back or Lay
    */
    public void setSide(Side side){
        this.side = side;
    }
     
     /**
    * A simple exchange bet for immediate execution
    */
    public LimitOrder getLimitOrder(){
        return limitOrder;
    }
     /**
    * A simple exchange bet for immediate execution
    */
    public void setLimitOrder(LimitOrder limitOrder){
        this.limitOrder = limitOrder;
    }
     
     /**
    * Bets are matched if, and only if, the returned starting price is better than a specified price. In the case of back bets, LOC bets are matched if the calculated starting price is greater than the specified price. In the case of lay bets, LOC bets are matched if the starting price is less than the specified price. If the specified limit is equal to the starting price, then it may be matched, partially matched, or may not be matched at all, depending on how much is needed to balance all bets against each other (MOC, LOC and normal exchange bets)
    */
    public LimitOnCloseOrder getLimitOnCloseOrder(){
        return limitOnCloseOrder;
    }
     /**
    * Bets are matched if, and only if, the returned starting price is better than a specified price. In the case of back bets, LOC bets are matched if the calculated starting price is greater than the specified price. In the case of lay bets, LOC bets are matched if the starting price is less than the specified price. If the specified limit is equal to the starting price, then it may be matched, partially matched, or may not be matched at all, depending on how much is needed to balance all bets against each other (MOC, LOC and normal exchange bets)
    */
    public void setLimitOnCloseOrder(LimitOnCloseOrder limitOnCloseOrder){
        this.limitOnCloseOrder = limitOnCloseOrder;
    }
     
     /**
    * Bets remain unmatched until the market is reconciled. They are matched and settled at a price that is representative of the market at the point the market is turned in-play. The market is reconciled to find a starting price and MOC bets are settled at whatever starting price is returned. MOC bets are always matched and settled, unless a starting price is not available for the selection. Market on Close bets can only be placed before the starting price is determined
    */
    public MarketOnCloseOrder getMarketOnCloseOrder(){
        return marketOnCloseOrder;
    }
     /**
    * Bets remain unmatched until the market is reconciled. They are matched and settled at a price that is representative of the market at the point the market is turned in-play. The market is reconciled to find a starting price and MOC bets are settled at whatever starting price is returned. MOC bets are always matched and settled, unless a starting price is not available for the selection. Market on Close bets can only be placed before the starting price is determined
    */
    public void setMarketOnCloseOrder(MarketOnCloseOrder marketOnCloseOrder){
        this.marketOnCloseOrder = marketOnCloseOrder;
    }
    
}
