package com.betfair.aping.account.entities;

import java.util.Date;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class TimeRange {
    /**
    * from, format: ISO 8601)
    */
    private Date from;
    /**
    * to, format: ISO 8601
    */
    private Date to;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * from, format: ISO 8601)
    */
    public Date getFrom(){
        return from;
    }
     /**
    * from, format: ISO 8601)
    */
    public void setFrom(Date from){
        this.from = from;
    }
     
     /**
    * to, format: ISO 8601
    */
    public Date getTo(){
        return to;
    }
     /**
    * to, format: ISO 8601
    */
    public void setTo(Date to){
        this.to = to;
    }
    
}
