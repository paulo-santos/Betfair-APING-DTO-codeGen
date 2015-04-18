package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.PersistenceType;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class UpdateInstruction {
    /**
    * REQUIRED
    * Unique identifier for the bet
    */
    private String betId;
    /**
    * REQUIRED
    * The new persistence type to update this bet to
    */
    private PersistenceType newPersistenceType;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * REQUIRED
    * Unique identifier for the bet
    */
    public String getBetId(){
        return betId;
    }
     /**
    * REQUIRED
    * Unique identifier for the bet
    */
    public void setBetId(String betId){
        this.betId = betId;
    }
     
     /**
    * REQUIRED
    * The new persistence type to update this bet to
    */
    public PersistenceType getNewPersistenceType(){
        return newPersistenceType;
    }
     /**
    * REQUIRED
    * The new persistence type to update this bet to
    */
    public void setNewPersistenceType(PersistenceType newPersistenceType){
        this.newPersistenceType = newPersistenceType;
    }
    
}
