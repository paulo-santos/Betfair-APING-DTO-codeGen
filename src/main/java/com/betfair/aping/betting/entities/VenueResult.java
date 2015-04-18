package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class VenueResult {
    /**
    * Venue
    */
    private String venue;
    /**
    * Count of markets associated with this Venue
    */
    private Integer marketCount;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * Venue
    */
    public String getVenue(){
        return venue;
    }
     /**
    * Venue
    */
    public void setVenue(String venue){
        this.venue = venue;
    }
     
     /**
    * Count of markets associated with this Venue
    */
    public Integer getMarketCount(){
        return marketCount;
    }
     /**
    * Count of markets associated with this Venue
    */
    public void setMarketCount(Integer marketCount){
        this.marketCount = marketCount;
    }
    
}
