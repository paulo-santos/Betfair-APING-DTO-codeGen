package com.betfair.aping.betting.entities;

import java.util.Date;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class ItemDescription {
    /**
    * The event type name, translated into the requested locale. Available at EVENT_TYPE groupBy or lower.
    */
    private String eventTypeDesc;
    /**
    * The eventName, or openDate + venue, translated into the requested locale. Available at EVENT groupBy or lower.
    */
    private String eventDesc;
    /**
    * The market name or racing market type ("Win", "To Be Placed (2 places)", "To Be Placed (5 places)" etc) translated into the requested locale. Available at MARKET groupBy or lower.
    */
    private String marketDesc;
    /**
    * The start time of the market (in ISO-8601 format, not translated). Available at MARKET groupBy or lower.
    */
    private Date marketStartTime;
    /**
    * The runner name, maybe including the handicap, translated into the requested locale. Available at BET groupBy.
    */
    private String runnerDesc;
    /**
    * The numberOfWinners on a market. Available at BET groupBy.
    */
    private Integer numberOfWinners;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * The event type name, translated into the requested locale. Available at EVENT_TYPE groupBy or lower.
    */
    public String getEventTypeDesc(){
        return eventTypeDesc;
    }
     /**
    * The event type name, translated into the requested locale. Available at EVENT_TYPE groupBy or lower.
    */
    public void setEventTypeDesc(String eventTypeDesc){
        this.eventTypeDesc = eventTypeDesc;
    }
     
     /**
    * The eventName, or openDate + venue, translated into the requested locale. Available at EVENT groupBy or lower.
    */
    public String getEventDesc(){
        return eventDesc;
    }
     /**
    * The eventName, or openDate + venue, translated into the requested locale. Available at EVENT groupBy or lower.
    */
    public void setEventDesc(String eventDesc){
        this.eventDesc = eventDesc;
    }
     
     /**
    * The market name or racing market type ("Win", "To Be Placed (2 places)", "To Be Placed (5 places)" etc) translated into the requested locale. Available at MARKET groupBy or lower.
    */
    public String getMarketDesc(){
        return marketDesc;
    }
     /**
    * The market name or racing market type ("Win", "To Be Placed (2 places)", "To Be Placed (5 places)" etc) translated into the requested locale. Available at MARKET groupBy or lower.
    */
    public void setMarketDesc(String marketDesc){
        this.marketDesc = marketDesc;
    }
     
     /**
    * The start time of the market (in ISO-8601 format, not translated). Available at MARKET groupBy or lower.
    */
    public Date getMarketStartTime(){
        return marketStartTime;
    }
     /**
    * The start time of the market (in ISO-8601 format, not translated). Available at MARKET groupBy or lower.
    */
    public void setMarketStartTime(Date marketStartTime){
        this.marketStartTime = marketStartTime;
    }
     
     /**
    * The runner name, maybe including the handicap, translated into the requested locale. Available at BET groupBy.
    */
    public String getRunnerDesc(){
        return runnerDesc;
    }
     /**
    * The runner name, maybe including the handicap, translated into the requested locale. Available at BET groupBy.
    */
    public void setRunnerDesc(String runnerDesc){
        this.runnerDesc = runnerDesc;
    }
     
     /**
    * The numberOfWinners on a market. Available at BET groupBy.
    */
    public Integer getNumberOfWinners(){
        return numberOfWinners;
    }
     /**
    * The numberOfWinners on a market. Available at BET groupBy.
    */
    public void setNumberOfWinners(Integer numberOfWinners){
        this.numberOfWinners = numberOfWinners;
    }
    
}
