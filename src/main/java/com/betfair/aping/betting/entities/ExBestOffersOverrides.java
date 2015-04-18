package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.RollupModel;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class ExBestOffersOverrides {
    /**
    * The maximum number of prices to return on each side for each runner. If unspecified defaults to 3.
    */
    private Integer bestPricesDepth;
    /**
    * The model to use when rolling up available sizes. If unspecified defaults to STAKE rollup model with rollupLimit of minimum stake in the specified currency.
    */
    private RollupModel rollupModel;
    /**
    * The volume limit to use when rolling up returned sizes. The exact definition of the limit depends on the rollupModel. If no limit is provided it will use minimum stake as default the value. Ignored if no rollup model is specified.
    */
    private Integer rollupLimit;
    /**
    * Only applicable when rollupModel is MANAGED_LIABILITY. The rollup model switches from being stake based to liability based at the smallest lay price which is >= rollupLiabilityThreshold.service level default (TBD). Not supported as yet.
    */
    private Double rollupLiabilityThreshold;
    /**
    * Only applicable when rollupModel is MANAGED_LIABILITY. (rollupLiabilityFactor * rollupLimit) is the minimum liabilty the user is deemed to be comfortable with. After the rollupLiabilityThreshold price subsequent volumes will be rolled up to minimum value such that the liability >= the minimum liability.service level default (5). Not supported as yet.
    */
    private Integer rollupLiabilityFactor;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * The maximum number of prices to return on each side for each runner. If unspecified defaults to 3.
    */
    public Integer getBestPricesDepth(){
        return bestPricesDepth;
    }
     /**
    * The maximum number of prices to return on each side for each runner. If unspecified defaults to 3.
    */
    public void setBestPricesDepth(Integer bestPricesDepth){
        this.bestPricesDepth = bestPricesDepth;
    }
     
     /**
    * The model to use when rolling up available sizes. If unspecified defaults to STAKE rollup model with rollupLimit of minimum stake in the specified currency.
    */
    public RollupModel getRollupModel(){
        return rollupModel;
    }
     /**
    * The model to use when rolling up available sizes. If unspecified defaults to STAKE rollup model with rollupLimit of minimum stake in the specified currency.
    */
    public void setRollupModel(RollupModel rollupModel){
        this.rollupModel = rollupModel;
    }
     
     /**
    * The volume limit to use when rolling up returned sizes. The exact definition of the limit depends on the rollupModel. If no limit is provided it will use minimum stake as default the value. Ignored if no rollup model is specified.
    */
    public Integer getRollupLimit(){
        return rollupLimit;
    }
     /**
    * The volume limit to use when rolling up returned sizes. The exact definition of the limit depends on the rollupModel. If no limit is provided it will use minimum stake as default the value. Ignored if no rollup model is specified.
    */
    public void setRollupLimit(Integer rollupLimit){
        this.rollupLimit = rollupLimit;
    }
     
     /**
    * Only applicable when rollupModel is MANAGED_LIABILITY. The rollup model switches from being stake based to liability based at the smallest lay price which is >= rollupLiabilityThreshold.service level default (TBD). Not supported as yet.
    */
    public Double getRollupLiabilityThreshold(){
        return rollupLiabilityThreshold;
    }
     /**
    * Only applicable when rollupModel is MANAGED_LIABILITY. The rollup model switches from being stake based to liability based at the smallest lay price which is >= rollupLiabilityThreshold.service level default (TBD). Not supported as yet.
    */
    public void setRollupLiabilityThreshold(Double rollupLiabilityThreshold){
        this.rollupLiabilityThreshold = rollupLiabilityThreshold;
    }
     
     /**
    * Only applicable when rollupModel is MANAGED_LIABILITY. (rollupLiabilityFactor * rollupLimit) is the minimum liabilty the user is deemed to be comfortable with. After the rollupLiabilityThreshold price subsequent volumes will be rolled up to minimum value such that the liability >= the minimum liability.service level default (5). Not supported as yet.
    */
    public Integer getRollupLiabilityFactor(){
        return rollupLiabilityFactor;
    }
     /**
    * Only applicable when rollupModel is MANAGED_LIABILITY. (rollupLiabilityFactor * rollupLimit) is the minimum liabilty the user is deemed to be comfortable with. After the rollupLiabilityThreshold price subsequent volumes will be rolled up to minimum value such that the liability >= the minimum liability.service level default (5). Not supported as yet.
    */
    public void setRollupLiabilityFactor(Integer rollupLiabilityFactor){
        this.rollupLiabilityFactor = rollupLiabilityFactor;
    }
    
}
