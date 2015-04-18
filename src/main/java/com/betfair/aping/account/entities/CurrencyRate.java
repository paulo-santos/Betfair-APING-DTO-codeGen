package com.betfair.aping.account.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class CurrencyRate {
    /**
    * Three letter ISO 4217 code
    */
    private String currencyCode;
    /**
    * Exchange rate for the currency specified in the request
    */
    private Double rate;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * Three letter ISO 4217 code
    */
    public String getCurrencyCode(){
        return currencyCode;
    }
     /**
    * Three letter ISO 4217 code
    */
    public void setCurrencyCode(String currencyCode){
        this.currencyCode = currencyCode;
    }
     
     /**
    * Exchange rate for the currency specified in the request
    */
    public Double getRate(){
        return rate;
    }
     /**
    * Exchange rate for the currency specified in the request
    */
    public void setRate(Double rate){
        this.rate = rate;
    }
    
}
