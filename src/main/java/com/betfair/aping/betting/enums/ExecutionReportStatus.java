package com.betfair.aping.betting.enums;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public enum ExecutionReportStatus {
    /**
    *Order processed successfully
    */
    SUCCESS,
    /**
    *Order failed.
    */
    FAILURE,
    /**
    *The order itself has been accepted, but at least one (possibly all) actions have generated errors
    */
    PROCESSED_WITH_ERRORS,
    /**
    *Order timed out.
    */
    TIMEOUT
}
