package com.betfair.aping.betting.entities;

import java.util.List;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class StartingPrices {
    /**
    * What the starting price would be if the market was reconciled now taking into account the SP bets as well as unmatched exchange bets on the same selection in the exchange.
    */
    private Double nearPrice;
    /**
    * What the starting price would be if the market was reconciled now taking into account only the currently place SP bets. The Far Price is not as complicated but not as accurate and only accounts for money on the exchange at SP.
    */
    private Double farPrice;
    /**
    * The back bets matched at the actual Betfair Starting Price
    */
    private List<PriceSize> backStakeTaken;
    /**
    * The lay amount matched at the actual Betfair Starting Price
    */
    private List<PriceSize> layLiabilityTaken;
    /**
    * The final BSP price for this runner. Only available for a BSP market that has been reconciled.
    */
    private Double actualSP;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * What the starting price would be if the market was reconciled now taking into account the SP bets as well as unmatched exchange bets on the same selection in the exchange.
    */

    public Double getNearPrice(){
        return nearPrice;
    }
     
    /**
    * What the starting price would be if the market was reconciled now taking into account the SP bets as well as unmatched exchange bets on the same selection in the exchange.
    */

    public void setNearPrice(Double nearPrice){
        this.nearPrice = nearPrice;
    }
     
     
    /**
    * What the starting price would be if the market was reconciled now taking into account only the currently place SP bets. The Far Price is not as complicated but not as accurate and only accounts for money on the exchange at SP.
    */

    public Double getFarPrice(){
        return farPrice;
    }
     
    /**
    * What the starting price would be if the market was reconciled now taking into account only the currently place SP bets. The Far Price is not as complicated but not as accurate and only accounts for money on the exchange at SP.
    */

    public void setFarPrice(Double farPrice){
        this.farPrice = farPrice;
    }
     
     
    /**
    * The back bets matched at the actual Betfair Starting Price
    */

    public List<PriceSize> getBackStakeTaken(){
        return backStakeTaken;
    }
     
    /**
    * The back bets matched at the actual Betfair Starting Price
    */

    public void setBackStakeTaken(List<PriceSize> backStakeTaken){
        this.backStakeTaken = backStakeTaken;
    }
     
     
    /**
    * The lay amount matched at the actual Betfair Starting Price
    */

    public List<PriceSize> getLayLiabilityTaken(){
        return layLiabilityTaken;
    }
     
    /**
    * The lay amount matched at the actual Betfair Starting Price
    */

    public void setLayLiabilityTaken(List<PriceSize> layLiabilityTaken){
        this.layLiabilityTaken = layLiabilityTaken;
    }
     
     
    /**
    * The final BSP price for this runner. Only available for a BSP market that has been reconciled.
    */

    public Double getActualSP(){
        return actualSP;
    }
     
    /**
    * The final BSP price for this runner. Only available for a BSP market that has been reconciled.
    */

    public void setActualSP(Double actualSP){
        this.actualSP = actualSP;
    }
    
}
