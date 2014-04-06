package com.betfair.aping.betting.enums;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public enum OrderStatus {
    /**
    *An order that does not have any remaining unmatched portion.
    */
    EXECUTION_COMPLETE,
    /**
    *An order that has a remaining unmatched portion.
    */
    EXECUTABLE
}
