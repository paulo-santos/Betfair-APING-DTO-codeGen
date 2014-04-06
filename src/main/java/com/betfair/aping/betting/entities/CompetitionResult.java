package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class CompetitionResult {
    /**
    * Competition
    */
    private Competition competition;
    /**
    * Count of markets associated with this competition
    */
    private Integer marketCount;
    /**
    * Region in which this competition is happening
    */
    private String competitionRegion;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * Competition
    */

    public Competition getCompetition(){
        return competition;
    }
     
    /**
    * Competition
    */

    public void setCompetition(Competition competition){
        this.competition = competition;
    }
     
     
    /**
    * Count of markets associated with this competition
    */

    public Integer getMarketCount(){
        return marketCount;
    }
     
    /**
    * Count of markets associated with this competition
    */

    public void setMarketCount(Integer marketCount){
        this.marketCount = marketCount;
    }
     
     
    /**
    * Region in which this competition is happening
    */

    public String getCompetitionRegion(){
        return competitionRegion;
    }
     
    /**
    * Region in which this competition is happening
    */

    public void setCompetitionRegion(String competitionRegion){
        this.competitionRegion = competitionRegion;
    }
    
}
