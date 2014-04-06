package com.betfair.aping.betting.enums;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public enum PersistenceType {
    /**
    *Lapse the order at turn-in-play
    */
    LAPSE,
    /**
    *Persist the order to in-play
    */
    PERSIST,
    /**
    *Put the order into the auction (SP) at turn-in-play
    */
    MARKET_ON_CLOSE
}
