package com.betfair.aping.betting.entities;

import java.util.List;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class CurrentOrderSummaryReport {
    /**
    * REQUIRED
    * The list of current orders returned by your query. This will be a valid list (i.e. empty or non-empty but never 'null').
    */
    private List<CurrentOrderSummary> currentOrders;
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
    * The list of current orders returned by your query. This will be a valid list (i.e. empty or non-empty but never 'null').
    */

    public List<CurrentOrderSummary> getCurrentOrders(){
        return currentOrders;
    }
     
    /**
    * REQUIRED
    * The list of current orders returned by your query. This will be a valid list (i.e. empty or non-empty but never 'null').
    */

    public void setCurrentOrders(List<CurrentOrderSummary> currentOrders){
        this.currentOrders = currentOrders;
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
