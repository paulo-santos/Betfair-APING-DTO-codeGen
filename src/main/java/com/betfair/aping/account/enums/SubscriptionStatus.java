package com.betfair.aping.account.enums;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public enum SubscriptionStatus {
    /**
    *Any subscription status
    */
    ALL,
    /**
    *Only activated subscriptions
    */
    ACTIVATED,
    /**
    *Only unactivated subscriptions
    */
    UNACTIVATED,
    /**
    *Only cancelled subscriptions
    */
    CANCELLED,
    /**
    *Only expired subscriptions
    */
    EXPIRED
}
