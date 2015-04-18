package com.betfair.aping.betting.entities;

import java.util.List;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class MarketProfitAndLoss {
    /**
    * The unique identifier for the market
    */
    private String marketId;
    /**
    * The commission rate applied to P&L values. Only returned if netOfCommision option is requested
    */
    private Double commissionApplied;
    /**
    * Calculated profit and loss data.
    */
    private List<RunnerProfitAndLoss> profitAndLosses;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * The unique identifier for the market
    */
    public String getMarketId(){
        return marketId;
    }
     /**
    * The unique identifier for the market
    */
    public void setMarketId(String marketId){
        this.marketId = marketId;
    }
     
     /**
    * The commission rate applied to P&L values. Only returned if netOfCommision option is requested
    */
    public Double getCommissionApplied(){
        return commissionApplied;
    }
     /**
    * The commission rate applied to P&L values. Only returned if netOfCommision option is requested
    */
    public void setCommissionApplied(Double commissionApplied){
        this.commissionApplied = commissionApplied;
    }
     
     /**
    * Calculated profit and loss data.
    */
    public List<RunnerProfitAndLoss> getProfitAndLosses(){
        return profitAndLosses;
    }
     /**
    * Calculated profit and loss data.
    */
    public void setProfitAndLosses(List<RunnerProfitAndLoss> profitAndLosses){
        this.profitAndLosses = profitAndLosses;
    }
    
}
