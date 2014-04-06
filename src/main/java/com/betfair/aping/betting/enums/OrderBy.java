package com.betfair.aping.betting.enums;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public enum OrderBy {
    /**
    *Order by placed time, then bet id.
    */
    BY_BET,
    /**
    *Order by market id, then placed time, then bet id.
    */
    BY_MARKET,
    /**
    *Order by time of last matched fragment (if any), then placed time, then bet id
    */
    BY_MATCH_TIME
}
