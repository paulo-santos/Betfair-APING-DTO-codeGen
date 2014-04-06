package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.MarketBettingType;
import java.util.Date;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class MarketDescription {
    /**
    * REQUIRED
    * If 'true' the market supports 'Keep' bets if the market is to be turned in-play
    */
    private Boolean persistenceEnabled;
    /**
    * REQUIRED
    * If 'true' the market supports Betfair SP betting
    */
    private Boolean bspMarket;
    /**
    * REQUIRED
    * The market start time
    */
    private Date marketTime;
    /**
    * REQUIRED
    * The market suspend time
    */
    private Date suspendTime;
    /**
    * settled time
    */
    private Date settleTime;
    /**
    * REQUIRED
    * See MarketBettingType
    */
    private MarketBettingType bettingType;
    /**
    * REQUIRED
    * If 'true' the market is set to turn in-play
    */
    private Boolean turnInPlayEnabled;
    /**
    * REQUIRED
    * Market base type
    */
    private String marketType;
    /**
    * REQUIRED
    * The market regulator
    */
    private String regulator;
    /**
    * REQUIRED
    * The commission rate applicable to the market
    */
    private Double marketBaseRate;
    /**
    * REQUIRED
    * Indicates whether or not the user's discount rate is taken into account on this market. If ‘false’ all users will be charged the same commission rate, regardless of discount rate.
    */
    private Boolean discountAllowed;
    /**
    * The wallet to which the market belongs (UK/AUS)
    */
    private String wallet;
    /**
    * The market rules.
    */
    private String rules;
    private Boolean rulesHasDate;
    /**
    * Any additional information regarding the market
    */
    private String clarifications;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * REQUIRED
    * If 'true' the market supports 'Keep' bets if the market is to be turned in-play
    */

    public Boolean getPersistenceEnabled(){
        return persistenceEnabled;
    }
     
    /**
    * REQUIRED
    * If 'true' the market supports 'Keep' bets if the market is to be turned in-play
    */

    public void setPersistenceEnabled(Boolean persistenceEnabled){
        this.persistenceEnabled = persistenceEnabled;
    }
     
     
    /**
    * REQUIRED
    * If 'true' the market supports Betfair SP betting
    */

    public Boolean getBspMarket(){
        return bspMarket;
    }
     
    /**
    * REQUIRED
    * If 'true' the market supports Betfair SP betting
    */

    public void setBspMarket(Boolean bspMarket){
        this.bspMarket = bspMarket;
    }
     
     
    /**
    * REQUIRED
    * The market start time
    */

    public Date getMarketTime(){
        return marketTime;
    }
     
    /**
    * REQUIRED
    * The market start time
    */

    public void setMarketTime(Date marketTime){
        this.marketTime = marketTime;
    }
     
     
    /**
    * REQUIRED
    * The market suspend time
    */

    public Date getSuspendTime(){
        return suspendTime;
    }
     
    /**
    * REQUIRED
    * The market suspend time
    */

    public void setSuspendTime(Date suspendTime){
        this.suspendTime = suspendTime;
    }
     
     
    /**
    * settled time
    */

    public Date getSettleTime(){
        return settleTime;
    }
     
    /**
    * settled time
    */

    public void setSettleTime(Date settleTime){
        this.settleTime = settleTime;
    }
     
     
    /**
    * REQUIRED
    * See MarketBettingType
    */

    public MarketBettingType getBettingType(){
        return bettingType;
    }
     
    /**
    * REQUIRED
    * See MarketBettingType
    */

    public void setBettingType(MarketBettingType bettingType){
        this.bettingType = bettingType;
    }
     
     
    /**
    * REQUIRED
    * If 'true' the market is set to turn in-play
    */

    public Boolean getTurnInPlayEnabled(){
        return turnInPlayEnabled;
    }
     
    /**
    * REQUIRED
    * If 'true' the market is set to turn in-play
    */

    public void setTurnInPlayEnabled(Boolean turnInPlayEnabled){
        this.turnInPlayEnabled = turnInPlayEnabled;
    }
     
     
    /**
    * REQUIRED
    * Market base type
    */

    public String getMarketType(){
        return marketType;
    }
     
    /**
    * REQUIRED
    * Market base type
    */

    public void setMarketType(String marketType){
        this.marketType = marketType;
    }
     
     
    /**
    * REQUIRED
    * The market regulator
    */

    public String getRegulator(){
        return regulator;
    }
     
    /**
    * REQUIRED
    * The market regulator
    */

    public void setRegulator(String regulator){
        this.regulator = regulator;
    }
     
     
    /**
    * REQUIRED
    * The commission rate applicable to the market
    */

    public Double getMarketBaseRate(){
        return marketBaseRate;
    }
     
    /**
    * REQUIRED
    * The commission rate applicable to the market
    */

    public void setMarketBaseRate(Double marketBaseRate){
        this.marketBaseRate = marketBaseRate;
    }
     
     
    /**
    * REQUIRED
    * Indicates whether or not the user's discount rate is taken into account on this market. If ‘false’ all users will be charged the same commission rate, regardless of discount rate.
    */

    public Boolean getDiscountAllowed(){
        return discountAllowed;
    }
     
    /**
    * REQUIRED
    * Indicates whether or not the user's discount rate is taken into account on this market. If ‘false’ all users will be charged the same commission rate, regardless of discount rate.
    */

    public void setDiscountAllowed(Boolean discountAllowed){
        this.discountAllowed = discountAllowed;
    }
     
     
    /**
    * The wallet to which the market belongs (UK/AUS)
    */

    public String getWallet(){
        return wallet;
    }
     
    /**
    * The wallet to which the market belongs (UK/AUS)
    */

    public void setWallet(String wallet){
        this.wallet = wallet;
    }
     
     
    /**
    * The market rules.
    */

    public String getRules(){
        return rules;
    }
     
    /**
    * The market rules.
    */

    public void setRules(String rules){
        this.rules = rules;
    }
     
     
    public Boolean getRulesHasDate(){
        return rulesHasDate;
    }
     
    public void setRulesHasDate(Boolean rulesHasDate){
        this.rulesHasDate = rulesHasDate;
    }
     
     
    /**
    * Any additional information regarding the market
    */

    public String getClarifications(){
        return clarifications;
    }
     
    /**
    * Any additional information regarding the market
    */

    public void setClarifications(String clarifications){
        this.clarifications = clarifications;
    }
    
}
