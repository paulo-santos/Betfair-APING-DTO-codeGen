package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.RunnerStatus;
import java.util.Date;
import java.util.List;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class Runner {
    /**
    * REQUIRED
    * The unique id of the runner (selection)
    */
    private Long selectionId;
    /**
    * REQUIRED
    * The handicap
    */
    private Double handicap;
    /**
    * REQUIRED
    * The status of the selection (i.e., ACTIVE, REMOVED, WINNER, LOSER, HIDDEN)
    */
    private RunnerStatus status;
    /**
    * REQUIRED
    * The adjustment factor applied if the selection is removed
    */
    private Double adjustmentFactor;
    /**
    * The price of the most recent bet matched on this selection
    */
    private Double lastPriceTraded;
    /**
    * The total amount matched on this runner
    */
    private Double totalMatched;
    /**
    * If date and time the runner was removed
    */
    private Date removalDate;
    /**
    * The BSP related prices for this runner
    */
    private StartingPrices sp;
    /**
    * The Exchange prices available for this runner
    */
    private ExchangePrices ex;
    /**
    * List of orders in the market
    */
    private List<Order> orders;
    /**
    * List of matches (i.e, orders that have been fully or partially executed)
    */
    private List<Match> matches;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * REQUIRED
    * The unique id of the runner (selection)
    */

    public Long getSelectionId(){
        return selectionId;
    }
     
    /**
    * REQUIRED
    * The unique id of the runner (selection)
    */

    public void setSelectionId(Long selectionId){
        this.selectionId = selectionId;
    }
     
     
    /**
    * REQUIRED
    * The handicap
    */

    public Double getHandicap(){
        return handicap;
    }
     
    /**
    * REQUIRED
    * The handicap
    */

    public void setHandicap(Double handicap){
        this.handicap = handicap;
    }
     
     
    /**
    * REQUIRED
    * The status of the selection (i.e., ACTIVE, REMOVED, WINNER, LOSER, HIDDEN)
    */

    public RunnerStatus getStatus(){
        return status;
    }
     
    /**
    * REQUIRED
    * The status of the selection (i.e., ACTIVE, REMOVED, WINNER, LOSER, HIDDEN)
    */

    public void setStatus(RunnerStatus status){
        this.status = status;
    }
     
     
    /**
    * REQUIRED
    * The adjustment factor applied if the selection is removed
    */

    public Double getAdjustmentFactor(){
        return adjustmentFactor;
    }
     
    /**
    * REQUIRED
    * The adjustment factor applied if the selection is removed
    */

    public void setAdjustmentFactor(Double adjustmentFactor){
        this.adjustmentFactor = adjustmentFactor;
    }
     
     
    /**
    * The price of the most recent bet matched on this selection
    */

    public Double getLastPriceTraded(){
        return lastPriceTraded;
    }
     
    /**
    * The price of the most recent bet matched on this selection
    */

    public void setLastPriceTraded(Double lastPriceTraded){
        this.lastPriceTraded = lastPriceTraded;
    }
     
     
    /**
    * The total amount matched on this runner
    */

    public Double getTotalMatched(){
        return totalMatched;
    }
     
    /**
    * The total amount matched on this runner
    */

    public void setTotalMatched(Double totalMatched){
        this.totalMatched = totalMatched;
    }
     
     
    /**
    * If date and time the runner was removed
    */

    public Date getRemovalDate(){
        return removalDate;
    }
     
    /**
    * If date and time the runner was removed
    */

    public void setRemovalDate(Date removalDate){
        this.removalDate = removalDate;
    }
     
     
    /**
    * The BSP related prices for this runner
    */

    public StartingPrices getSp(){
        return sp;
    }
     
    /**
    * The BSP related prices for this runner
    */

    public void setSp(StartingPrices sp){
        this.sp = sp;
    }
     
     
    /**
    * The Exchange prices available for this runner
    */

    public ExchangePrices getEx(){
        return ex;
    }
     
    /**
    * The Exchange prices available for this runner
    */

    public void setEx(ExchangePrices ex){
        this.ex = ex;
    }
     
     
    /**
    * List of orders in the market
    */

    public List<Order> getOrders(){
        return orders;
    }
     
    /**
    * List of orders in the market
    */

    public void setOrders(List<Order> orders){
        this.orders = orders;
    }
     
     
    /**
    * List of matches (i.e, orders that have been fully or partially executed)
    */

    public List<Match> getMatches(){
        return matches;
    }
     
    /**
    * List of matches (i.e, orders that have been fully or partially executed)
    */

    public void setMatches(List<Match> matches){
        this.matches = matches;
    }
    
}
