package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.PriceData;
import java.util.Set;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class PriceProjection {
    /**
    * The basic price data you want to receive in the response.
    */
    private Set<PriceData> priceData;
    /**
    * Options to alter the default representation of best offer prices Applicable to EX_BEST_OFFERS priceData selection
    */
    private ExBestOffersOverrides exBestOffersOverrides;
    /**
    * Indicates if the returned prices should include virtual prices. Applicable to EX_BEST_OFFERS and EX_ALL_OFFERS priceData selections, default value is false.
    */
    private Boolean virtualise;
    /**
    * Indicates if the volume returned at each price point should be the absolute value or a cumulative sum of volumes available at the price and all better prices. If unspecified defaults to false. Applicable to EX_BEST_OFFERS and EX_ALL_OFFERS price projections. Not supported as yet.
    */
    private Boolean rolloverStakes;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * The basic price data you want to receive in the response.
    */

    public Set<PriceData> getPriceData(){
        return priceData;
    }
     
    /**
    * The basic price data you want to receive in the response.
    */

    public void setPriceData(Set<PriceData> priceData){
        this.priceData = priceData;
    }
     
     
    /**
    * Options to alter the default representation of best offer prices Applicable to EX_BEST_OFFERS priceData selection
    */

    public ExBestOffersOverrides getExBestOffersOverrides(){
        return exBestOffersOverrides;
    }
     
    /**
    * Options to alter the default representation of best offer prices Applicable to EX_BEST_OFFERS priceData selection
    */

    public void setExBestOffersOverrides(ExBestOffersOverrides exBestOffersOverrides){
        this.exBestOffersOverrides = exBestOffersOverrides;
    }
     
     
    /**
    * Indicates if the returned prices should include virtual prices. Applicable to EX_BEST_OFFERS and EX_ALL_OFFERS priceData selections, default value is false.
    */

    public Boolean getVirtualise(){
        return virtualise;
    }
     
    /**
    * Indicates if the returned prices should include virtual prices. Applicable to EX_BEST_OFFERS and EX_ALL_OFFERS priceData selections, default value is false.
    */

    public void setVirtualise(Boolean virtualise){
        this.virtualise = virtualise;
    }
     
     
    /**
    * Indicates if the volume returned at each price point should be the absolute value or a cumulative sum of volumes available at the price and all better prices. If unspecified defaults to false. Applicable to EX_BEST_OFFERS and EX_ALL_OFFERS price projections. Not supported as yet.
    */

    public Boolean getRolloverStakes(){
        return rolloverStakes;
    }
     
    /**
    * Indicates if the volume returned at each price point should be the absolute value or a cumulative sum of volumes available at the price and all better prices. If unspecified defaults to false. Applicable to EX_BEST_OFFERS and EX_ALL_OFFERS price projections. Not supported as yet.
    */

    public void setRolloverStakes(Boolean rolloverStakes){
        this.rolloverStakes = rolloverStakes;
    }
    
}
