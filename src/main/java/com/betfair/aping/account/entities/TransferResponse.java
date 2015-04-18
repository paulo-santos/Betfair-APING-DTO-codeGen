package com.betfair.aping.account.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class TransferResponse {
    /**
    * REQUIRED
    * The id of the transfer transaction that will be used in tracking the transfers between the wallets
    */
    private String transactionId;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * REQUIRED
    * The id of the transfer transaction that will be used in tracking the transfers between the wallets
    */
    public String getTransactionId(){
        return transactionId;
    }
     /**
    * REQUIRED
    * The id of the transfer transaction that will be used in tracking the transfers between the wallets
    */
    public void setTransactionId(String transactionId){
        this.transactionId = transactionId;
    }
    
}
