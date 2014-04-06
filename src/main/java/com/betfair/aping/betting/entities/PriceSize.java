package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class PriceSize {
    private Double price;
    private Double size;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    public Double getPrice(){
        return price;
    }
     
    public void setPrice(Double price){
        this.price = price;
    }
     
     
    public Double getSize(){
        return size;
    }
     
    public void setSize(Double size){
        this.size = size;
    }
    
}
