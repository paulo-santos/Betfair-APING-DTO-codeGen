package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class EventTypeResult {
    /**
    * The ID identifying the Event Type
    */
    private EventType eventType;
    /**
    * Count of markets associated with this eventType
    */
    private Integer marketCount;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * The ID identifying the Event Type
    */

    public EventType getEventType(){
        return eventType;
    }
     
    /**
    * The ID identifying the Event Type
    */

    public void setEventType(EventType eventType){
        this.eventType = eventType;
    }
     
     
    /**
    * Count of markets associated with this eventType
    */

    public Integer getMarketCount(){
        return marketCount;
    }
     
    /**
    * Count of markets associated with this eventType
    */

    public void setMarketCount(Integer marketCount){
        this.marketCount = marketCount;
    }
    
}
