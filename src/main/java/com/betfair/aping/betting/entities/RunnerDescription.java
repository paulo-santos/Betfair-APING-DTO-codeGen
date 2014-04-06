package com.betfair.aping.betting.entities;

import java.util.Map;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class RunnerDescription {
    /**
    * REQUIRED
    * The name of the runner
    */
    private String runnerName;
    /**
    * The metadata for this runner, such as horse racing silks.
    */
    private Map<String,String> metadata;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
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
    * The metadata for this runner, such as horse racing silks.
    */

    public Map<String,String> getMetadata(){
        return metadata;
    }
     
    /**
    * The metadata for this runner, such as horse racing silks.
    */

    public void setMetadata(Map<String,String> metadata){
        this.metadata = metadata;
    }
    
}
