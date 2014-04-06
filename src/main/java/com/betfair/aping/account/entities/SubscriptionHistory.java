package com.betfair.aping.account.entities;

import com.betfair.aping.account.enums.SubscriptionStatus;
import java.util.Date;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class SubscriptionHistory {
    /**
    * REQUIRED
    * Application key identifier
    */
    private String subscriptionToken;
    /**
    * Subscription Expiry date
    */
    private Date expiryDateTime;
    /**
    * Subscription Expired date
    */
    private Date expiredDateTime;
    /**
    * Subscription Create date
    */
    private Date createdDateTime;
    /**
    * Subscription Activation date
    */
    private Date activationDateTime;
    /**
    * Subscription Cancelled date
    */
    private Date cancellationDateTime;
    /**
    * Subscription status
    */
    private SubscriptionStatus subscriptionStatus;
    /**
    * Client reference
    */
    private String clientReference;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * REQUIRED
    * Application key identifier
    */

    public String getSubscriptionToken(){
        return subscriptionToken;
    }
     
    /**
    * REQUIRED
    * Application key identifier
    */

    public void setSubscriptionToken(String subscriptionToken){
        this.subscriptionToken = subscriptionToken;
    }
     
     
    /**
    * Subscription Expiry date
    */

    public Date getExpiryDateTime(){
        return expiryDateTime;
    }
     
    /**
    * Subscription Expiry date
    */

    public void setExpiryDateTime(Date expiryDateTime){
        this.expiryDateTime = expiryDateTime;
    }
     
     
    /**
    * Subscription Expired date
    */

    public Date getExpiredDateTime(){
        return expiredDateTime;
    }
     
    /**
    * Subscription Expired date
    */

    public void setExpiredDateTime(Date expiredDateTime){
        this.expiredDateTime = expiredDateTime;
    }
     
     
    /**
    * Subscription Create date
    */

    public Date getCreatedDateTime(){
        return createdDateTime;
    }
     
    /**
    * Subscription Create date
    */

    public void setCreatedDateTime(Date createdDateTime){
        this.createdDateTime = createdDateTime;
    }
     
     
    /**
    * Subscription Activation date
    */

    public Date getActivationDateTime(){
        return activationDateTime;
    }
     
    /**
    * Subscription Activation date
    */

    public void setActivationDateTime(Date activationDateTime){
        this.activationDateTime = activationDateTime;
    }
     
     
    /**
    * Subscription Cancelled date
    */

    public Date getCancellationDateTime(){
        return cancellationDateTime;
    }
     
    /**
    * Subscription Cancelled date
    */

    public void setCancellationDateTime(Date cancellationDateTime){
        this.cancellationDateTime = cancellationDateTime;
    }
     
     
    /**
    * Subscription status
    */

    public SubscriptionStatus getSubscriptionStatus(){
        return subscriptionStatus;
    }
     
    /**
    * Subscription status
    */

    public void setSubscriptionStatus(SubscriptionStatus subscriptionStatus){
        this.subscriptionStatus = subscriptionStatus;
    }
     
     
    /**
    * Client reference
    */

    public String getClientReference(){
        return clientReference;
    }
     
    /**
    * Client reference
    */

    public void setClientReference(String clientReference){
        this.clientReference = clientReference;
    }
    
}
