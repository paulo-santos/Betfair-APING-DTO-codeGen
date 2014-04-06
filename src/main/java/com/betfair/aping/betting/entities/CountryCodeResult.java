package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class CountryCodeResult {
    /**
    * The ISO-2 code for the event.  A list of ISO-2 codes is available via http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
    */
    private String countryCode;
    /**
    * Count of markets associated with this Country Code
    */
    private Integer marketCount;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * The ISO-2 code for the event.  A list of ISO-2 codes is available via http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
    */

    public String getCountryCode(){
        return countryCode;
    }
     
    /**
    * The ISO-2 code for the event.  A list of ISO-2 codes is available via http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
    */

    public void setCountryCode(String countryCode){
        this.countryCode = countryCode;
    }
     
     
    /**
    * Count of markets associated with this Country Code
    */

    public Integer getMarketCount(){
        return marketCount;
    }
     
    /**
    * Count of markets associated with this Country Code
    */

    public void setMarketCount(Integer marketCount){
        this.marketCount = marketCount;
    }
    
}
