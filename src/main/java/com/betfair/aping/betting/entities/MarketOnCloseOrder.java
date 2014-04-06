package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class MarketOnCloseOrder {
    /**
    * REQUIRED
    * The size of the bet.
    */
    private Double liability;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * REQUIRED
    * The size of the bet.
    */

    public Double getLiability(){
        return liability;
    }
     
    /**
    * REQUIRED
    * The size of the bet.
    */

    public void setLiability(Double liability){
        this.liability = liability;
    }
    
}
