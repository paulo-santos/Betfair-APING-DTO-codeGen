package com.betfair.aping.account.entities;

import java.util.List;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class AccountStatementReport {
    /**
    * REQUIRED
    * The list of statement items returned by your request.
    */
    private List<StatementItem> accountStatement;
    /**
    * REQUIRED
    * Indicates whether there are further result items beyond this page.
    */
    private Boolean moreAvailable;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * REQUIRED
    * The list of statement items returned by your request.
    */
    public List<StatementItem> getAccountStatement(){
        return accountStatement;
    }
     /**
    * REQUIRED
    * The list of statement items returned by your request.
    */
    public void setAccountStatement(List<StatementItem> accountStatement){
        this.accountStatement = accountStatement;
    }
     
     /**
    * REQUIRED
    * Indicates whether there are further result items beyond this page.
    */
    public Boolean getMoreAvailable(){
        return moreAvailable;
    }
     /**
    * REQUIRED
    * Indicates whether there are further result items beyond this page.
    */
    public void setMoreAvailable(Boolean moreAvailable){
        this.moreAvailable = moreAvailable;
    }
    
}
