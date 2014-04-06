package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class RunnerId {
    /**
    * REQUIRED
    * The id of the market bet on
    */
    private String marketId;
    /**
    * REQUIRED
    * The id of the selection bet on
    */
    private Long selectionId;
    /**
    * The handicap associated with the runner in case of asian handicap markets, null otherwise.
    */
    private Double handicap;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * REQUIRED
    * The id of the market bet on
    */

    public String getMarketId(){
        return marketId;
    }
     
    /**
    * REQUIRED
    * The id of the market bet on
    */

    public void setMarketId(String marketId){
        this.marketId = marketId;
    }
     
     
    /**
    * REQUIRED
    * The id of the selection bet on
    */

    public Long getSelectionId(){
        return selectionId;
    }
     
    /**
    * REQUIRED
    * The id of the selection bet on
    */

    public void setSelectionId(Long selectionId){
        this.selectionId = selectionId;
    }
     
     
    /**
    * The handicap associated with the runner in case of asian handicap markets, null otherwise.
    */

    public Double getHandicap(){
        return handicap;
    }
     
    /**
    * The handicap associated with the runner in case of asian handicap markets, null otherwise.
    */

    public void setHandicap(Double handicap){
        this.handicap = handicap;
    }
    
}
