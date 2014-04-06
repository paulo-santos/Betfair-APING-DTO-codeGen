package com.betfair.aping.account.entities;

import com.betfair.aping.account.enums.SubscriptionStatus;
import java.util.Date;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class SubscriptionTokenInfo {
    /**
    * REQUIRED
    * Subscription token
    */
    private String subscriptionToken;
    /**
    * Subscription Activated date
    */
    private Date activatedDateTime;
    /**
    * Subscription Expiry date
    */
    private Date expiryDateTime;
    /**
    * Subscription Expired date
    */
    private Date expiredDateTime;
    /**
    * Subscription Cancelled date
    */
    private Date cancellationDateTime;
    /**
    * Subscription status
    */
    private SubscriptionStatus subscriptionStatus;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * REQUIRED
    * Subscription token
    */

    public String getSubscriptionToken(){
        return subscriptionToken;
    }
     
    /**
    * REQUIRED
    * Subscription token
    */

    public void setSubscriptionToken(String subscriptionToken){
        this.subscriptionToken = subscriptionToken;
    }
     
     
    /**
    * Subscription Activated date
    */

    public Date getActivatedDateTime(){
        return activatedDateTime;
    }
     
    /**
    * Subscription Activated date
    */

    public void setActivatedDateTime(Date activatedDateTime){
        this.activatedDateTime = activatedDateTime;
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
    
}
