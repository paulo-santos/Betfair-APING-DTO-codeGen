package com.betfair.aping.account.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class AccountFundsResponse {
    /**
    * Amount available to bet.
    */
    private Double availableToBetBalance;
    /**
    * Current exposure.
    */
    private Double exposure;
    /**
    * Sum of retained commission.
    */
    private Double retainedCommission;
    /**
    * Exposure limit.
    */
    private Double exposureLimit;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * Amount available to bet.
    */

    public Double getAvailableToBetBalance(){
        return availableToBetBalance;
    }
     
    /**
    * Amount available to bet.
    */

    public void setAvailableToBetBalance(Double availableToBetBalance){
        this.availableToBetBalance = availableToBetBalance;
    }
     
     
    /**
    * Current exposure.
    */

    public Double getExposure(){
        return exposure;
    }
     
    /**
    * Current exposure.
    */

    public void setExposure(Double exposure){
        this.exposure = exposure;
    }
     
     
    /**
    * Sum of retained commission.
    */

    public Double getRetainedCommission(){
        return retainedCommission;
    }
     
    /**
    * Sum of retained commission.
    */

    public void setRetainedCommission(Double retainedCommission){
        this.retainedCommission = retainedCommission;
    }
     
     
    /**
    * Exposure limit.
    */

    public Double getExposureLimit(){
        return exposureLimit;
    }
     
    /**
    * Exposure limit.
    */

    public void setExposureLimit(Double exposureLimit){
        this.exposureLimit = exposureLimit;
    }
    
}
