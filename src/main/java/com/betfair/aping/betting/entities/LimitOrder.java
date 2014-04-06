package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.PersistenceType;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class LimitOrder {
    /**
    * REQUIRED
    * The size of the bet.
    */
    private Double size;
    /**
    * REQUIRED
    * The limit price
    */
    private Double price;
    /**
    * REQUIRED
    * What to do with the order at turn-in-play
    */
    private PersistenceType persistenceType;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * REQUIRED
    * The size of the bet.
    */

    public Double getSize(){
        return size;
    }
     
    /**
    * REQUIRED
    * The size of the bet.
    */

    public void setSize(Double size){
        this.size = size;
    }
     
     
    /**
    * REQUIRED
    * The limit price
    */

    public Double getPrice(){
        return price;
    }
     
    /**
    * REQUIRED
    * The limit price
    */

    public void setPrice(Double price){
        this.price = price;
    }
     
     
    /**
    * REQUIRED
    * What to do with the order at turn-in-play
    */

    public PersistenceType getPersistenceType(){
        return persistenceType;
    }
     
    /**
    * REQUIRED
    * What to do with the order at turn-in-play
    */

    public void setPersistenceType(PersistenceType persistenceType){
        this.persistenceType = persistenceType;
    }
    
}
