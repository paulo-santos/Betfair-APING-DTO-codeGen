package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class ReplaceInstruction {
    /**
    * REQUIRED
    * Unique identifier for the bet
    */
    private String betId;
    /**
    * REQUIRED
    * The price to replace the bet at
    */
    private Double newPrice;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * REQUIRED
    * Unique identifier for the bet
    */

    public String getBetId(){
        return betId;
    }
     
    /**
    * REQUIRED
    * Unique identifier for the bet
    */

    public void setBetId(String betId){
        this.betId = betId;
    }
     
     
    /**
    * REQUIRED
    * The price to replace the bet at
    */

    public Double getNewPrice(){
        return newPrice;
    }
     
    /**
    * REQUIRED
    * The price to replace the bet at
    */

    public void setNewPrice(Double newPrice){
        this.newPrice = newPrice;
    }
    
}
