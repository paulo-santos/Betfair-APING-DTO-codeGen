package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class MarketTypeResult {
    /**
    * Market Type
    */
    private String marketType;
    /**
    * Count of markets associated with this marketType
    */
    private Integer marketCount;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * Market Type
    */

    public String getMarketType(){
        return marketType;
    }
     
    /**
    * Market Type
    */

    public void setMarketType(String marketType){
        this.marketType = marketType;
    }
     
     
    /**
    * Count of markets associated with this marketType
    */

    public Integer getMarketCount(){
        return marketCount;
    }
     
    /**
    * Count of markets associated with this marketType
    */

    public void setMarketCount(Integer marketCount){
        this.marketCount = marketCount;
    }
    
}
