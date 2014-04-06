package com.betfair.aping.betting.entities;

import java.util.List;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class ExchangePrices {
    private List<PriceSize> availableToBack;
    private List<PriceSize> availableToLay;
    private List<PriceSize> tradedVolume;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    public List<PriceSize> getAvailableToBack(){
        return availableToBack;
    }
     
    public void setAvailableToBack(List<PriceSize> availableToBack){
        this.availableToBack = availableToBack;
    }
     
     
    public List<PriceSize> getAvailableToLay(){
        return availableToLay;
    }
     
    public void setAvailableToLay(List<PriceSize> availableToLay){
        this.availableToLay = availableToLay;
    }
     
     
    public List<PriceSize> getTradedVolume(){
        return tradedVolume;
    }
     
    public void setTradedVolume(List<PriceSize> tradedVolume){
        this.tradedVolume = tradedVolume;
    }
    
}
