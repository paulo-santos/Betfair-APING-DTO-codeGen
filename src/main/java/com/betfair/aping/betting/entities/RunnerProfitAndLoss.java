package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class RunnerProfitAndLoss {
    /**
    * The unique identifier for the selection
    */
    private Long selectionId;
    /**
    * Profit or loss for the market if this selection is the winner.
    */
    private Double ifWin;
    /**
    * Profit or loss for the market if this selection is the loser. Only returned for multi-winner odds markets.
    */
    private Double ifLose;
    /**
    * Profit or loss for the market if this selection is placed. Applies to marketType EACH_WAY only.
    */
    private Double ifPlace;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * The unique identifier for the selection
    */
    public Long getSelectionId(){
        return selectionId;
    }
     /**
    * The unique identifier for the selection
    */
    public void setSelectionId(Long selectionId){
        this.selectionId = selectionId;
    }
     
     /**
    * Profit or loss for the market if this selection is the winner.
    */
    public Double getIfWin(){
        return ifWin;
    }
     /**
    * Profit or loss for the market if this selection is the winner.
    */
    public void setIfWin(Double ifWin){
        this.ifWin = ifWin;
    }
     
     /**
    * Profit or loss for the market if this selection is the loser. Only returned for multi-winner odds markets.
    */
    public Double getIfLose(){
        return ifLose;
    }
     /**
    * Profit or loss for the market if this selection is the loser. Only returned for multi-winner odds markets.
    */
    public void setIfLose(Double ifLose){
        this.ifLose = ifLose;
    }
     
     /**
    * Profit or loss for the market if this selection is placed. Applies to marketType EACH_WAY only.
    */
    public Double getIfPlace(){
        return ifPlace;
    }
     /**
    * Profit or loss for the market if this selection is placed. Applies to marketType EACH_WAY only.
    */
    public void setIfPlace(Double ifPlace){
        this.ifPlace = ifPlace;
    }
    
}
