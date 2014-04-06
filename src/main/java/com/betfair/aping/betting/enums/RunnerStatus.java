package com.betfair.aping.betting.enums;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public enum RunnerStatus {
    /**
    *ACTIVE
    */
    ACTIVE,
    /**
    *WINNER
    */
    WINNER,
    /**
    *LOSER
    */
    LOSER,
    /**
    *REMOVED_VACANT applies to Greyhounds. Greyhound markets always return a fixed number of runners (traps). If a dog has been removed, the trap is shown as vacant.
    */
    REMOVED_VACANT,
    /**
    *REMOVED
    */
    REMOVED,
    /**
    *The selection is hidden from the market.  This occurs in Horse Racing markets were runners is hidden when it is doesn’t hold an official entry following an entry stage. This could be because the horse was never entered or because they have been scratched from a race at a declaration stage.
    */
    HIDDEN
}
