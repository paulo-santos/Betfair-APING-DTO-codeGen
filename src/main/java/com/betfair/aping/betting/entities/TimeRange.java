package com.betfair.aping.betting.entities;

import java.util.Date;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class TimeRange {
    /**
    * from
    */
    private Date from;
    /**
    * to
    */
    private Date to;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * from
    */

    public Date getFrom(){
        return from;
    }
     
    /**
    * from
    */

    public void setFrom(Date from){
        this.from = from;
    }
     
     
    /**
    * to
    */

    public Date getTo(){
        return to;
    }
     
    /**
    * to
    */

    public void setTo(Date to){
        this.to = to;
    }
    
}
