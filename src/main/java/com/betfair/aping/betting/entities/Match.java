package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.Side;
import java.util.Date;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class Match {
    /**
    * Only present if no rollup
    */
    private String betId;
    /**
    * Only present if no rollup
    */
    private String matchId;
    /**
    * REQUIRED
    * Indicates if the bet is a Back or a LAY
    */
    private Side side;
    /**
    * REQUIRED
    * Either actual match price or avg match price depending on rollup.
    */
    private Double price;
    /**
    * REQUIRED
    * Size matched at in this fragment, or at this price or avg price depending on rollup
    */
    private Double size;
    /**
    * Only present if no rollup
    */
    private Date matchDate;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * Only present if no rollup
    */

    public String getBetId(){
        return betId;
    }
     
    /**
    * Only present if no rollup
    */

    public void setBetId(String betId){
        this.betId = betId;
    }
     
     
    /**
    * Only present if no rollup
    */

    public String getMatchId(){
        return matchId;
    }
     
    /**
    * Only present if no rollup
    */

    public void setMatchId(String matchId){
        this.matchId = matchId;
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
    * Either actual match price or avg match price depending on rollup.
    */

    public Double getPrice(){
        return price;
    }
     
    /**
    * REQUIRED
    * Either actual match price or avg match price depending on rollup.
    */

    public void setPrice(Double price){
        this.price = price;
    }
     
     
    /**
    * REQUIRED
    * Size matched at in this fragment, or at this price or avg price depending on rollup
    */

    public Double getSize(){
        return size;
    }
     
    /**
    * REQUIRED
    * Size matched at in this fragment, or at this price or avg price depending on rollup
    */

    public void setSize(Double size){
        this.size = size;
    }
     
     
    /**
    * Only present if no rollup
    */

    public Date getMatchDate(){
        return matchDate;
    }
     
    /**
    * Only present if no rollup
    */

    public void setMatchDate(Date matchDate){
        this.matchDate = matchDate;
    }
    
}
