package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.MarketBettingType;
import com.betfair.aping.betting.enums.OrderStatus;
import java.util.Set;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class MarketFilter {
    /**
    * Restrict markets by any text associated with the market such as the Name, Event, Competition, etc. You can include a wildcard (*) character as long as it is not the first character.
    */
    private String textQuery;
    /**
    * Restrict markets by the Exchange where the market operates
    */
    private Set<String> exchangeIds;
    /**
    * Restrict markets by event type associated with the market. (i.e., Football, Hockey, etc)
    */
    private Set<String> eventTypeIds;
    /**
    * Restrict markets by the event id associated with the market.
    */
    private Set<String> eventIds;
    /**
    * Restrict markets by the competitions associated with the market.
    */
    private Set<String> competitionIds;
    /**
    * Restrict markets by the market id associated with the market.
    */
    private Set<String> marketIds;
    /**
    * Restrict markets by the venue associated with the market. Currently only Horse Racing markets have venues.
    */
    private Set<String> venues;
    /**
    * Restrict to bsp markets only, if True or non-bsp markets if False. If not specified then returns both BSP and non-BSP markets
    */
    private Boolean bspOnly;
    /**
    * Restrict to markets that will turn in play if True or will not turn in play if false. If not specified, returns both.
    */
    private Boolean turnInPlayEnabled;
    /**
    * Restrict to markets that are currently in play if True or are not currently in play if false. If not specified, returns both.
    */
    private Boolean inPlayOnly;
    /**
    * Restrict to markets that match the betting type of the market (i.e. Odds, Asian Handicap Singles, or Asian Handicap Doubles
    */
    private Set<MarketBettingType> marketBettingTypes;
    /**
    * Restrict to markets that are in the specified country or countries
    */
    private Set<String> marketCountries;
    /**
    * Restrict to markets that match the type of the market (i.e., MATCH_ODDS, HALF_TIME_SCORE). You should use this instead of relying on the market name as the market type codes are the same in all locales
    */
    private Set<String> marketTypeCodes;
    /**
    * Restrict to markets with a market start time before or after the specified date
    */
    private TimeRange marketStartTime;
    /**
    * Restrict to markets that I have one or more orders in these status.
    */
    private Set<OrderStatus> withOrders;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * Restrict markets by any text associated with the market such as the Name, Event, Competition, etc. You can include a wildcard (*) character as long as it is not the first character.
    */

    public String getTextQuery(){
        return textQuery;
    }
     
    /**
    * Restrict markets by any text associated with the market such as the Name, Event, Competition, etc. You can include a wildcard (*) character as long as it is not the first character.
    */

    public void setTextQuery(String textQuery){
        this.textQuery = textQuery;
    }
     
     
    /**
    * Restrict markets by the Exchange where the market operates
    */

    public Set<String> getExchangeIds(){
        return exchangeIds;
    }
     
    /**
    * Restrict markets by the Exchange where the market operates
    */

    public void setExchangeIds(Set<String> exchangeIds){
        this.exchangeIds = exchangeIds;
    }
     
     
    /**
    * Restrict markets by event type associated with the market. (i.e., Football, Hockey, etc)
    */

    public Set<String> getEventTypeIds(){
        return eventTypeIds;
    }
     
    /**
    * Restrict markets by event type associated with the market. (i.e., Football, Hockey, etc)
    */

    public void setEventTypeIds(Set<String> eventTypeIds){
        this.eventTypeIds = eventTypeIds;
    }
     
     
    /**
    * Restrict markets by the event id associated with the market.
    */

    public Set<String> getEventIds(){
        return eventIds;
    }
     
    /**
    * Restrict markets by the event id associated with the market.
    */

    public void setEventIds(Set<String> eventIds){
        this.eventIds = eventIds;
    }
     
     
    /**
    * Restrict markets by the competitions associated with the market.
    */

    public Set<String> getCompetitionIds(){
        return competitionIds;
    }
     
    /**
    * Restrict markets by the competitions associated with the market.
    */

    public void setCompetitionIds(Set<String> competitionIds){
        this.competitionIds = competitionIds;
    }
     
     
    /**
    * Restrict markets by the market id associated with the market.
    */

    public Set<String> getMarketIds(){
        return marketIds;
    }
     
    /**
    * Restrict markets by the market id associated with the market.
    */

    public void setMarketIds(Set<String> marketIds){
        this.marketIds = marketIds;
    }
     
     
    /**
    * Restrict markets by the venue associated with the market. Currently only Horse Racing markets have venues.
    */

    public Set<String> getVenues(){
        return venues;
    }
     
    /**
    * Restrict markets by the venue associated with the market. Currently only Horse Racing markets have venues.
    */

    public void setVenues(Set<String> venues){
        this.venues = venues;
    }
     
     
    /**
    * Restrict to bsp markets only, if True or non-bsp markets if False. If not specified then returns both BSP and non-BSP markets
    */

    public Boolean getBspOnly(){
        return bspOnly;
    }
     
    /**
    * Restrict to bsp markets only, if True or non-bsp markets if False. If not specified then returns both BSP and non-BSP markets
    */

    public void setBspOnly(Boolean bspOnly){
        this.bspOnly = bspOnly;
    }
     
     
    /**
    * Restrict to markets that will turn in play if True or will not turn in play if false. If not specified, returns both.
    */

    public Boolean getTurnInPlayEnabled(){
        return turnInPlayEnabled;
    }
     
    /**
    * Restrict to markets that will turn in play if True or will not turn in play if false. If not specified, returns both.
    */

    public void setTurnInPlayEnabled(Boolean turnInPlayEnabled){
        this.turnInPlayEnabled = turnInPlayEnabled;
    }
     
     
    /**
    * Restrict to markets that are currently in play if True or are not currently in play if false. If not specified, returns both.
    */

    public Boolean getInPlayOnly(){
        return inPlayOnly;
    }
     
    /**
    * Restrict to markets that are currently in play if True or are not currently in play if false. If not specified, returns both.
    */

    public void setInPlayOnly(Boolean inPlayOnly){
        this.inPlayOnly = inPlayOnly;
    }
     
     
    /**
    * Restrict to markets that match the betting type of the market (i.e. Odds, Asian Handicap Singles, or Asian Handicap Doubles
    */

    public Set<MarketBettingType> getMarketBettingTypes(){
        return marketBettingTypes;
    }
     
    /**
    * Restrict to markets that match the betting type of the market (i.e. Odds, Asian Handicap Singles, or Asian Handicap Doubles
    */

    public void setMarketBettingTypes(Set<MarketBettingType> marketBettingTypes){
        this.marketBettingTypes = marketBettingTypes;
    }
     
     
    /**
    * Restrict to markets that are in the specified country or countries
    */

    public Set<String> getMarketCountries(){
        return marketCountries;
    }
     
    /**
    * Restrict to markets that are in the specified country or countries
    */

    public void setMarketCountries(Set<String> marketCountries){
        this.marketCountries = marketCountries;
    }
     
     
    /**
    * Restrict to markets that match the type of the market (i.e., MATCH_ODDS, HALF_TIME_SCORE). You should use this instead of relying on the market name as the market type codes are the same in all locales
    */

    public Set<String> getMarketTypeCodes(){
        return marketTypeCodes;
    }
     
    /**
    * Restrict to markets that match the type of the market (i.e., MATCH_ODDS, HALF_TIME_SCORE). You should use this instead of relying on the market name as the market type codes are the same in all locales
    */

    public void setMarketTypeCodes(Set<String> marketTypeCodes){
        this.marketTypeCodes = marketTypeCodes;
    }
     
     
    /**
    * Restrict to markets with a market start time before or after the specified date
    */

    public TimeRange getMarketStartTime(){
        return marketStartTime;
    }
     
    /**
    * Restrict to markets with a market start time before or after the specified date
    */

    public void setMarketStartTime(TimeRange marketStartTime){
        this.marketStartTime = marketStartTime;
    }
     
     
    /**
    * Restrict to markets that I have one or more orders in these status.
    */

    public Set<OrderStatus> getWithOrders(){
        return withOrders;
    }
     
    /**
    * Restrict to markets that I have one or more orders in these status.
    */

    public void setWithOrders(Set<OrderStatus> withOrders){
        this.withOrders = withOrders;
    }
    
}
