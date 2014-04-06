package com.betfair.aping.betting.enums;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public enum OrderProjection {
    /**
    *EXECUTABLE and EXECUTION_COMPLETE orders
    */
    ALL,
    /**
    *An order that has a remaining unmatched portion
    */
    EXECUTABLE,
    /**
    *An order that does not have any remaining unmatched portion
    */
    EXECUTION_COMPLETE
}
