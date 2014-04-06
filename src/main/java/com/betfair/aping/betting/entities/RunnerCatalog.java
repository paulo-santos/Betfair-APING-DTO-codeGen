package com.betfair.aping.betting.entities;

import java.util.Map;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class RunnerCatalog {
    /**
    * REQUIRED
    * The unique id for the selection.
    */
    private Long selectionId;
    /**
    * REQUIRED
    * The name of the runner
    */
    private String runnerName;
    /**
    * REQUIRED
    * The handicap
    */
    private Double handicap;
    /**
    * REQUIRED
    * The sort priority of this runner
    */
    private Integer sortPriority;
    /**
    * Metadata associated with the runner.  For a description of this data for Horse Racing, please see Runner Metadata Description
    */
    private Map<String,String> metadata;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * REQUIRED
    * The unique id for the selection.
    */

    public Long getSelectionId(){
        return selectionId;
    }
     
    /**
    * REQUIRED
    * The unique id for the selection.
    */

    public void setSelectionId(Long selectionId){
        this.selectionId = selectionId;
    }
     
     
    /**
    * REQUIRED
    * The name of the runner
    */

    public String getRunnerName(){
        return runnerName;
    }
     
    /**
    * REQUIRED
    * The name of the runner
    */

    public void setRunnerName(String runnerName){
        this.runnerName = runnerName;
    }
     
     
    /**
    * REQUIRED
    * The handicap
    */

    public Double getHandicap(){
        return handicap;
    }
     
    /**
    * REQUIRED
    * The handicap
    */

    public void setHandicap(Double handicap){
        this.handicap = handicap;
    }
     
     
    /**
    * REQUIRED
    * The sort priority of this runner
    */

    public Integer getSortPriority(){
        return sortPriority;
    }
     
    /**
    * REQUIRED
    * The sort priority of this runner
    */

    public void setSortPriority(Integer sortPriority){
        this.sortPriority = sortPriority;
    }
     
     
    /**
    * Metadata associated with the runner.  For a description of this data for Horse Racing, please see Runner Metadata Description
    */

    public Map<String,String> getMetadata(){
        return metadata;
    }
     
    /**
    * Metadata associated with the runner.  For a description of this data for Horse Racing, please see Runner Metadata Description
    */

    public void setMetadata(Map<String,String> metadata){
        this.metadata = metadata;
    }
    
}
