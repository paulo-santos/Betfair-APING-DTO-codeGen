package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class MarketVersion {
    /**
    * A non-monotonically increasing number indicating market changes
    */
    private Long version;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * A non-monotonically increasing number indicating market changes
    */

    public Long getVersion(){
        return version;
    }
     
    /**
    * A non-monotonically increasing number indicating market changes
    */

    public void setVersion(Long version){
        this.version = version;
    }
    
}
