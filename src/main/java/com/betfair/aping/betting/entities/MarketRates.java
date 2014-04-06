package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class MarketRates {
    /**
    * REQUIRED
    * marketBaseRate
    */
    private Double marketBaseRate;
    /**
    * REQUIRED
    * discountAllowed
    */
    private Boolean discountAllowed;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * REQUIRED
    * marketBaseRate
    */

    public Double getMarketBaseRate(){
        return marketBaseRate;
    }
     
    /**
    * REQUIRED
    * marketBaseRate
    */

    public void setMarketBaseRate(Double marketBaseRate){
        this.marketBaseRate = marketBaseRate;
    }
     
     
    /**
    * REQUIRED
    * discountAllowed
    */

    public Boolean getDiscountAllowed(){
        return discountAllowed;
    }
     
    /**
    * REQUIRED
    * discountAllowed
    */

    public void setDiscountAllowed(Boolean discountAllowed){
        this.discountAllowed = discountAllowed;
    }
    
}
