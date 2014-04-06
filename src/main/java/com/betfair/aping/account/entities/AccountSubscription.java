package com.betfair.aping.account.entities;

import java.util.List;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class AccountSubscription {
    /**
    * REQUIRED
    * Lis t of subscription token details
    */
    private List<SubscriptionTokenInfo> subscriptionTokens;
    /**
    * Application name
    */
    private String applicationName;
    /**
    * Application version Id
    */
    private String applicationVersionId;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * REQUIRED
    * Lis t of subscription token details
    */

    public List<SubscriptionTokenInfo> getSubscriptionTokens(){
        return subscriptionTokens;
    }
     
    /**
    * REQUIRED
    * Lis t of subscription token details
    */

    public void setSubscriptionTokens(List<SubscriptionTokenInfo> subscriptionTokens){
        this.subscriptionTokens = subscriptionTokens;
    }
     
     
    /**
    * Application name
    */

    public String getApplicationName(){
        return applicationName;
    }
     
    /**
    * Application name
    */

    public void setApplicationName(String applicationName){
        this.applicationName = applicationName;
    }
     
     
    /**
    * Application version Id
    */

    public String getApplicationVersionId(){
        return applicationVersionId;
    }
     
    /**
    * Application version Id
    */

    public void setApplicationVersionId(String applicationVersionId){
        this.applicationVersionId = applicationVersionId;
    }
    
}
