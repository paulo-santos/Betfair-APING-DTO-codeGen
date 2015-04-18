package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class MarketLineRangeInfo {
    /**
    * REQUIRED
    * maxPrice
    */
    private Double maxUnitValue;
    /**
    * REQUIRED
    * minPrice
    */
    private Double minUnitValue;
    /**
    * REQUIRED
    * interval
    */
    private Double interval;
    /**
    * REQUIRED
    * unit
    */
    private String marketUnit;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * REQUIRED
    * maxPrice
    */
    public Double getMaxUnitValue(){
        return maxUnitValue;
    }
     /**
    * REQUIRED
    * maxPrice
    */
    public void setMaxUnitValue(Double maxUnitValue){
        this.maxUnitValue = maxUnitValue;
    }
     
     /**
    * REQUIRED
    * minPrice
    */
    public Double getMinUnitValue(){
        return minUnitValue;
    }
     /**
    * REQUIRED
    * minPrice
    */
    public void setMinUnitValue(Double minUnitValue){
        this.minUnitValue = minUnitValue;
    }
     
     /**
    * REQUIRED
    * interval
    */
    public Double getInterval(){
        return interval;
    }
     /**
    * REQUIRED
    * interval
    */
    public void setInterval(Double interval){
        this.interval = interval;
    }
     
     /**
    * REQUIRED
    * unit
    */
    public String getMarketUnit(){
        return marketUnit;
    }
     /**
    * REQUIRED
    * unit
    */
    public void setMarketUnit(String marketUnit){
        this.marketUnit = marketUnit;
    }
    
}
