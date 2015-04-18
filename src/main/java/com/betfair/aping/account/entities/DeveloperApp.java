package com.betfair.aping.account.entities;

import java.util.List;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class DeveloperApp {
    /**
    * REQUIRED
    * The unique name of the application
    */
    private String appName;
    /**
    * REQUIRED
    * A unique id of this application
    */
    private Long appId;
    /**
    * REQUIRED
    * The application versions (including application keys)
    */
    private List<DeveloperAppVersion> appVersions;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * REQUIRED
    * The unique name of the application
    */
    public String getAppName(){
        return appName;
    }
     /**
    * REQUIRED
    * The unique name of the application
    */
    public void setAppName(String appName){
        this.appName = appName;
    }
     
     /**
    * REQUIRED
    * A unique id of this application
    */
    public Long getAppId(){
        return appId;
    }
     /**
    * REQUIRED
    * A unique id of this application
    */
    public void setAppId(Long appId){
        this.appId = appId;
    }
     
     /**
    * REQUIRED
    * The application versions (including application keys)
    */
    public List<DeveloperAppVersion> getAppVersions(){
        return appVersions;
    }
     /**
    * REQUIRED
    * The application versions (including application keys)
    */
    public void setAppVersions(List<DeveloperAppVersion> appVersions){
        this.appVersions = appVersions;
    }
    
}
