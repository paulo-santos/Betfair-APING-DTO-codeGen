package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class CancelInstruction {
    /**
    * REQUIRED
    * The betId
    */
    private String betId;
    /**
    * If supplied then this is a partial cancel.  Should be set to 'null' if no size reduction is required.
    */
    private Double sizeReduction;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * REQUIRED
    * The betId
    */

    public String getBetId(){
        return betId;
    }
     
    /**
    * REQUIRED
    * The betId
    */

    public void setBetId(String betId){
        this.betId = betId;
    }
     
     
    /**
    * If supplied then this is a partial cancel.  Should be set to 'null' if no size reduction is required.
    */

    public Double getSizeReduction(){
        return sizeReduction;
    }
     
    /**
    * If supplied then this is a partial cancel.  Should be set to 'null' if no size reduction is required.
    */

    public void setSizeReduction(Double sizeReduction){
        this.sizeReduction = sizeReduction;
    }
    
}
