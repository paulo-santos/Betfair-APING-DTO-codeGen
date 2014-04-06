package com.betfair.aping.betting.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class MarketLicence {
    /**
    * REQUIRED
    * The wallet from which funds will be taken when betting on this market
    */
    private String wallet;
    /**
    * The rules for this market
    */
    private String rules;
    /**
    * The market's start date and time are relevant to the rules.
    */
    private Boolean rulesHasDate;
    /**
    * Clarifications to the rules for the market
    */
    private String clarifications;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * REQUIRED
    * The wallet from which funds will be taken when betting on this market
    */

    public String getWallet(){
        return wallet;
    }
     
    /**
    * REQUIRED
    * The wallet from which funds will be taken when betting on this market
    */

    public void setWallet(String wallet){
        this.wallet = wallet;
    }
     
     
    /**
    * The rules for this market
    */

    public String getRules(){
        return rules;
    }
     
    /**
    * The rules for this market
    */

    public void setRules(String rules){
        this.rules = rules;
    }
     
     
    /**
    * The market's start date and time are relevant to the rules.
    */

    public Boolean getRulesHasDate(){
        return rulesHasDate;
    }
     
    /**
    * The market's start date and time are relevant to the rules.
    */

    public void setRulesHasDate(Boolean rulesHasDate){
        this.rulesHasDate = rulesHasDate;
    }
     
     
    /**
    * Clarifications to the rules for the market
    */

    public String getClarifications(){
        return clarifications;
    }
     
    /**
    * Clarifications to the rules for the market
    */

    public void setClarifications(String clarifications){
        this.clarifications = clarifications;
    }
    
}
