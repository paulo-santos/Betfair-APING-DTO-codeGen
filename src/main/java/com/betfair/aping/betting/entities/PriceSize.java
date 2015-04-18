package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class PriceSize {
    /**
    * REQUIRED
    * The price available
    */
    private Double price;
    /**
    * REQUIRED
    * The stake available
    */
    private Double size;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * REQUIRED
    * The price available
    */
    public Double getPrice(){
        return price;
    }
     /**
    * REQUIRED
    * The price available
    */
    public void setPrice(Double price){
        this.price = price;
    }
     
     /**
    * REQUIRED
    * The stake available
    */
    public Double getSize(){
        return size;
    }
     /**
    * REQUIRED
    * The stake available
    */
    public void setSize(Double size){
        this.size = size;
    }
    
}
