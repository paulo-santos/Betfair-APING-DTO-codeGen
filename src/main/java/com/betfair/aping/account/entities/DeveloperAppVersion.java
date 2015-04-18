package com.betfair.aping.account.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class DeveloperAppVersion {
    /**
    * REQUIRED
    * The sportex user who owns the specific version of the application
    */
    private String owner;
    /**
    * REQUIRED
    * The unique Id of the application version
    */
    private Long versionId;
    /**
    * REQUIRED
    * The version identifier string such as 1.0, 2.0. Unique for a given application.
    */
    private String version;
    /**
    * REQUIRED
    * The unqiue application key associated with this application version
    */
    private String applicationKey;
    /**
    * REQUIRED
    * Indicates whether the data exposed by platform services as seen by this application key is delayed or realtime.
    */
    private Boolean delayData;
    /**
    * REQUIRED
    * Indicates whether the application version needs explicit subscription
    */
    private Boolean subscriptionRequired;
    /**
    * REQUIRED
    * Indicates whether the application version needs explicit management by the software owner. A value of false indicates, this is a version meant for personal developer use.
    */
    private Boolean ownerManaged;
    /**
    * REQUIRED
    * Indicates whether the application version is currently active
    */
    private Boolean active;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * REQUIRED
    * The sportex user who owns the specific version of the application
    */
    public String getOwner(){
        return owner;
    }
     /**
    * REQUIRED
    * The sportex user who owns the specific version of the application
    */
    public void setOwner(String owner){
        this.owner = owner;
    }
     
     /**
    * REQUIRED
    * The unique Id of the application version
    */
    public Long getVersionId(){
        return versionId;
    }
     /**
    * REQUIRED
    * The unique Id of the application version
    */
    public void setVersionId(Long versionId){
        this.versionId = versionId;
    }
     
     /**
    * REQUIRED
    * The version identifier string such as 1.0, 2.0. Unique for a given application.
    */
    public String getVersion(){
        return version;
    }
     /**
    * REQUIRED
    * The version identifier string such as 1.0, 2.0. Unique for a given application.
    */
    public void setVersion(String version){
        this.version = version;
    }
     
     /**
    * REQUIRED
    * The unqiue application key associated with this application version
    */
    public String getApplicationKey(){
        return applicationKey;
    }
     /**
    * REQUIRED
    * The unqiue application key associated with this application version
    */
    public void setApplicationKey(String applicationKey){
        this.applicationKey = applicationKey;
    }
     
     /**
    * REQUIRED
    * Indicates whether the data exposed by platform services as seen by this application key is delayed or realtime.
    */
    public Boolean getDelayData(){
        return delayData;
    }
     /**
    * REQUIRED
    * Indicates whether the data exposed by platform services as seen by this application key is delayed or realtime.
    */
    public void setDelayData(Boolean delayData){
        this.delayData = delayData;
    }
     
     /**
    * REQUIRED
    * Indicates whether the application version needs explicit subscription
    */
    public Boolean getSubscriptionRequired(){
        return subscriptionRequired;
    }
     /**
    * REQUIRED
    * Indicates whether the application version needs explicit subscription
    */
    public void setSubscriptionRequired(Boolean subscriptionRequired){
        this.subscriptionRequired = subscriptionRequired;
    }
     
     /**
    * REQUIRED
    * Indicates whether the application version needs explicit management by the software owner. A value of false indicates, this is a version meant for personal developer use.
    */
    public Boolean getOwnerManaged(){
        return ownerManaged;
    }
     /**
    * REQUIRED
    * Indicates whether the application version needs explicit management by the software owner. A value of false indicates, this is a version meant for personal developer use.
    */
    public void setOwnerManaged(Boolean ownerManaged){
        this.ownerManaged = ownerManaged;
    }
     
     /**
    * REQUIRED
    * Indicates whether the application version is currently active
    */
    public Boolean getActive(){
        return active;
    }
     /**
    * REQUIRED
    * Indicates whether the application version is currently active
    */
    public void setActive(Boolean active){
        this.active = active;
    }
    
}
