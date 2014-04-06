package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class LimitOnCloseOrder {
    /**
    * REQUIRED
    * The size of the bet.
    */
    private Double liability;
    /**
    * REQUIRED
    * The limit price of the bet if LOC
    */
    private Double price;


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
     
     
    /**
    * REQUIRED
    * The limit price of the bet if LOC
    */

    public Double getPrice(){
        return price;
    }
     
    /**
    * REQUIRED
    * The limit price of the bet if LOC
    */

    public void setPrice(Double price){
        this.price = price;
    }
    
}
