package com.betfair.aping.account.enums;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public enum IncludeItem {
    /**
    *Include all items
    */
    ALL,
    /**
    *Include payments only
    */
    DEPOSITS_WITHDRAWALS,
    /**
    *Include exchange bets only
    */
    EXCHANGE,
    /**
    *Include poker transactions only
    */
    POKER_ROOM
}
