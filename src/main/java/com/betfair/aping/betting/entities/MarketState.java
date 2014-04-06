package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.MarketStatus;
import java.util.Date;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class MarketState {
    /**
    * REQUIRED
    * The current status of the market
    */
    private MarketStatus status;
    /**
    * REQUIRED
    * The current bet delay in force on the market in seconds
    */
    private Integer betDelay;
    /**
    * REQUIRED
    * If true indicates that the market has been through reconciliation as a BSP market
    */
    private Boolean bspReconciled;
    /**
    * REQUIRED
    * If true indicates that runners may not be added
    */
    private Boolean complete;
    /**
    * REQUIRED
    * If true indicates that the market is currently in-play
    */
    private Boolean inplay;
    /**
    * REQUIRED
    * Indicates the number of runners for this market
    */
    private Integer numberOfActiveRunners;
    /**
    * REQUIRED
    * Indicates the time a bet was last matched in this market.
    */
    private Date lastMatchTime;
    /**
    * REQUIRED
    * Indicates the total amount matched for this market
    */
    private Double totalMatched;
    /**
    * REQUIRED
    * Zero for closed markets
    */
    private Double totalAvailable;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * REQUIRED
    * The current status of the market
    */

    public MarketStatus getStatus(){
        return status;
    }
     
    /**
    * REQUIRED
    * The current status of the market
    */

    public void setStatus(MarketStatus status){
        this.status = status;
    }
     
     
    /**
    * REQUIRED
    * The current bet delay in force on the market in seconds
    */

    public Integer getBetDelay(){
        return betDelay;
    }
     
    /**
    * REQUIRED
    * The current bet delay in force on the market in seconds
    */

    public void setBetDelay(Integer betDelay){
        this.betDelay = betDelay;
    }
     
     
    /**
    * REQUIRED
    * If true indicates that the market has been through reconciliation as a BSP market
    */

    public Boolean getBspReconciled(){
        return bspReconciled;
    }
     
    /**
    * REQUIRED
    * If true indicates that the market has been through reconciliation as a BSP market
    */

    public void setBspReconciled(Boolean bspReconciled){
        this.bspReconciled = bspReconciled;
    }
     
     
    /**
    * REQUIRED
    * If true indicates that runners may not be added
    */

    public Boolean getComplete(){
        return complete;
    }
     
    /**
    * REQUIRED
    * If true indicates that runners may not be added
    */

    public void setComplete(Boolean complete){
        this.complete = complete;
    }
     
     
    /**
    * REQUIRED
    * If true indicates that the market is currently in-play
    */

    public Boolean getInplay(){
        return inplay;
    }
     
    /**
    * REQUIRED
    * If true indicates that the market is currently in-play
    */

    public void setInplay(Boolean inplay){
        this.inplay = inplay;
    }
     
     
    /**
    * REQUIRED
    * Indicates the number of runners for this market
    */

    public Integer getNumberOfActiveRunners(){
        return numberOfActiveRunners;
    }
     
    /**
    * REQUIRED
    * Indicates the number of runners for this market
    */

    public void setNumberOfActiveRunners(Integer numberOfActiveRunners){
        this.numberOfActiveRunners = numberOfActiveRunners;
    }
     
     
    /**
    * REQUIRED
    * Indicates the time a bet was last matched in this market.
    */

    public Date getLastMatchTime(){
        return lastMatchTime;
    }
     
    /**
    * REQUIRED
    * Indicates the time a bet was last matched in this market.
    */

    public void setLastMatchTime(Date lastMatchTime){
        this.lastMatchTime = lastMatchTime;
    }
     
     
    /**
    * REQUIRED
    * Indicates the total amount matched for this market
    */

    public Double getTotalMatched(){
        return totalMatched;
    }
     
    /**
    * REQUIRED
    * Indicates the total amount matched for this market
    */

    public void setTotalMatched(Double totalMatched){
        this.totalMatched = totalMatched;
    }
     
     
    /**
    * REQUIRED
    * Zero for closed markets
    */

    public Double getTotalAvailable(){
        return totalAvailable;
    }
     
    /**
    * REQUIRED
    * Zero for closed markets
    */

    public void setTotalAvailable(Double totalAvailable){
        this.totalAvailable = totalAvailable;
    }
    
}
