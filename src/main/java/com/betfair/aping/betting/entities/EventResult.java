package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class EventResult {
    /**
    * Event
    */
    private Event event;
    /**
    * Count of markets associated with this event
    */
    private Integer marketCount;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * Event
    */

    public Event getEvent(){
        return event;
    }
     
    /**
    * Event
    */

    public void setEvent(Event event){
        this.event = event;
    }
     
     
    /**
    * Count of markets associated with this event
    */

    public Integer getMarketCount(){
        return marketCount;
    }
     
    /**
    * Count of markets associated with this event
    */

    public void setMarketCount(Integer marketCount){
        this.marketCount = marketCount;
    }
    
}
