package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.OrderStatus;
import com.betfair.aping.betting.enums.OrderType;
import com.betfair.aping.betting.enums.PersistenceType;
import com.betfair.aping.betting.enums.Side;
import java.util.Date;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class Order {
    private String betId;
    /**
    * REQUIRED
    * BSP Order type.
    */
    private OrderType orderType;
    /**
    * REQUIRED
    * Either EXECUTABLE (an unmatched amount remains) or EXECUTION_COMPLETE (no unmatched amount remains).
    */
    private OrderStatus status;
    /**
    * REQUIRED
    * What to do with the order at turn-in-play
    */
    private PersistenceType persistenceType;
    /**
    * REQUIRED
    * Indicates if the bet is a Back or a LAY
    */
    private Side side;
    /**
    * REQUIRED
    * The price of the bet.
    */
    private Double price;
    /**
    * REQUIRED
    * The size of the bet.
    */
    private Double size;
    /**
    * REQUIRED
    * Not to be confused with size. This is the liability of a given BSP bet.
    */
    private Double bspLiability;
    /**
    * REQUIRED
    * The date, to the second, the bet was placed.
    */
    private Date placedDate;
    /**
    * The average price matched at. Voided match fragments are removed from this average calculation.
    */
    private Double avgPriceMatched;
    /**
    * The current amount of this bet that was matched.
    */
    private Double sizeMatched;
    /**
    * The current amount of this bet that is unmatched.
    */
    private Double sizeRemaining;
    /**
    * The current amount of this bet that was lapsed.
    */
    private Double sizeLapsed;
    /**
    * The current amount of this bet that was cancelled.
    */
    private Double sizeCancelled;
    /**
    * The current amount of this bet that was voided.
    */
    private Double sizeVoided;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    public String getBetId(){
        return betId;
    }
     
    public void setBetId(String betId){
        this.betId = betId;
    }
     
     
    /**
    * REQUIRED
    * BSP Order type.
    */

    public OrderType getOrderType(){
        return orderType;
    }
     
    /**
    * REQUIRED
    * BSP Order type.
    */

    public void setOrderType(OrderType orderType){
        this.orderType = orderType;
    }
     
     
    /**
    * REQUIRED
    * Either EXECUTABLE (an unmatched amount remains) or EXECUTION_COMPLETE (no unmatched amount remains).
    */

    public OrderStatus getStatus(){
        return status;
    }
     
    /**
    * REQUIRED
    * Either EXECUTABLE (an unmatched amount remains) or EXECUTION_COMPLETE (no unmatched amount remains).
    */

    public void setStatus(OrderStatus status){
        this.status = status;
    }
     
     
    /**
    * REQUIRED
    * What to do with the order at turn-in-play
    */

    public PersistenceType getPersistenceType(){
        return persistenceType;
    }
     
    /**
    * REQUIRED
    * What to do with the order at turn-in-play
    */

    public void setPersistenceType(PersistenceType persistenceType){
        this.persistenceType = persistenceType;
    }
     
     
    /**
    * REQUIRED
    * Indicates if the bet is a Back or a LAY
    */

    public Side getSide(){
        return side;
    }
     
    /**
    * REQUIRED
    * Indicates if the bet is a Back or a LAY
    */

    public void setSide(Side side){
        this.side = side;
    }
     
     
    /**
    * REQUIRED
    * The price of the bet.
    */

    public Double getPrice(){
        return price;
    }
     
    /**
    * REQUIRED
    * The price of the bet.
    */

    public void setPrice(Double price){
        this.price = price;
    }
     
     
    /**
    * REQUIRED
    * The size of the bet.
    */

    public Double getSize(){
        return size;
    }
     
    /**
    * REQUIRED
    * The size of the bet.
    */

    public void setSize(Double size){
        this.size = size;
    }
     
     
    /**
    * REQUIRED
    * Not to be confused with size. This is the liability of a given BSP bet.
    */

    public Double getBspLiability(){
        return bspLiability;
    }
     
    /**
    * REQUIRED
    * Not to be confused with size. This is the liability of a given BSP bet.
    */

    public void setBspLiability(Double bspLiability){
        this.bspLiability = bspLiability;
    }
     
     
    /**
    * REQUIRED
    * The date, to the second, the bet was placed.
    */

    public Date getPlacedDate(){
        return placedDate;
    }
     
    /**
    * REQUIRED
    * The date, to the second, the bet was placed.
    */

    public void setPlacedDate(Date placedDate){
        this.placedDate = placedDate;
    }
     
     
    /**
    * The average price matched at. Voided match fragments are removed from this average calculation.
    */

    public Double getAvgPriceMatched(){
        return avgPriceMatched;
    }
     
    /**
    * The average price matched at. Voided match fragments are removed from this average calculation.
    */

    public void setAvgPriceMatched(Double avgPriceMatched){
        this.avgPriceMatched = avgPriceMatched;
    }
     
     
    /**
    * The current amount of this bet that was matched.
    */

    public Double getSizeMatched(){
        return sizeMatched;
    }
     
    /**
    * The current amount of this bet that was matched.
    */

    public void setSizeMatched(Double sizeMatched){
        this.sizeMatched = sizeMatched;
    }
     
     
    /**
    * The current amount of this bet that is unmatched.
    */

    public Double getSizeRemaining(){
        return sizeRemaining;
    }
     
    /**
    * The current amount of this bet that is unmatched.
    */

    public void setSizeRemaining(Double sizeRemaining){
        this.sizeRemaining = sizeRemaining;
    }
     
     
    /**
    * The current amount of this bet that was lapsed.
    */

    public Double getSizeLapsed(){
        return sizeLapsed;
    }
     
    /**
    * The current amount of this bet that was lapsed.
    */

    public void setSizeLapsed(Double sizeLapsed){
        this.sizeLapsed = sizeLapsed;
    }
     
     
    /**
    * The current amount of this bet that was cancelled.
    */

    public Double getSizeCancelled(){
        return sizeCancelled;
    }
     
    /**
    * The current amount of this bet that was cancelled.
    */

    public void setSizeCancelled(Double sizeCancelled){
        this.sizeCancelled = sizeCancelled;
    }
     
     
    /**
    * The current amount of this bet that was voided.
    */

    public Double getSizeVoided(){
        return sizeVoided;
    }
     
    /**
    * The current amount of this bet that was voided.
    */

    public void setSizeVoided(Double sizeVoided){
        this.sizeVoided = sizeVoided;
    }
    
}
