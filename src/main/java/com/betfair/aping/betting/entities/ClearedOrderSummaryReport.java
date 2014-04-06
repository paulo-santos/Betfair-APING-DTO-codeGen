package com.betfair.aping.betting.entities;

import java.util.List;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class ClearedOrderSummaryReport {
    /**
    * REQUIRED
    * The list of cleared orders returned by your query. This will be a valid list (i.e. empty or non-empty but never 'null').
    */
    private List<ClearedOrderSummary> clearedOrders;
    /**
    * REQUIRED
    * Indicates whether there are further result items beyond this page. Note that underlying data is highly time-dependent and the subsequent search orders query might return an empty result.
    */
    private Boolean moreAvailable;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * REQUIRED
    * The list of cleared orders returned by your query. This will be a valid list (i.e. empty or non-empty but never 'null').
    */

    public List<ClearedOrderSummary> getClearedOrders(){
        return clearedOrders;
    }
     
    /**
    * REQUIRED
    * The list of cleared orders returned by your query. This will be a valid list (i.e. empty or non-empty but never 'null').
    */

    public void setClearedOrders(List<ClearedOrderSummary> clearedOrders){
        this.clearedOrders = clearedOrders;
    }
     
     
    /**
    * REQUIRED
    * Indicates whether there are further result items beyond this page. Note that underlying data is highly time-dependent and the subsequent search orders query might return an empty result.
    */

    public Boolean getMoreAvailable(){
        return moreAvailable;
    }
     
    /**
    * REQUIRED
    * Indicates whether there are further result items beyond this page. Note that underlying data is highly time-dependent and the subsequent search orders query might return an empty result.
    */

    public void setMoreAvailable(Boolean moreAvailable){
        this.moreAvailable = moreAvailable;
    }
    
}
