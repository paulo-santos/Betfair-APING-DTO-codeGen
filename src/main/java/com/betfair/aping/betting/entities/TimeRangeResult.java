package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class TimeRangeResult {
    /**
    * TimeRange
    */
    private TimeRange timeRange;
    /**
    * Count of markets associated with this TimeRange
    */
    private Integer marketCount;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * TimeRange
    */

    public TimeRange getTimeRange(){
        return timeRange;
    }
     
    /**
    * TimeRange
    */

    public void setTimeRange(TimeRange timeRange){
        this.timeRange = timeRange;
    }
     
     
    /**
    * Count of markets associated with this TimeRange
    */

    public Integer getMarketCount(){
        return marketCount;
    }
     
    /**
    * Count of markets associated with this TimeRange
    */

    public void setMarketCount(Integer marketCount){
        this.marketCount = marketCount;
    }
    
}
