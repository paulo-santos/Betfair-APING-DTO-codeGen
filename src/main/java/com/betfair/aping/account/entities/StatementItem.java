package com.betfair.aping.account.entities;

import com.betfair.aping.account.enums.ItemClass;
import java.util.Date;
import java.util.Map;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class StatementItem {
    /**
    * An external reference, eg. equivalent to betId in the case of an exchange bet statement item.
    */
    private String refId;
    /**
    * REQUIRED
    * The date and time of the statement item, eg. equivalent to settledData for an exchange bet statement item. (in ISO-8601 format, not translated)
    */
    private Date itemDate;
    /**
    * The amount of money the balance is adjusted by
    */
    private Double amount;
    /**
    * Account balance.
    */
    private Double balance;
    /**
    * Class of statement item. This value will determine which set of keys will be included in itemClassData
    */
    private ItemClass itemClass;
    /**
    * Key value pairs describing the current statement item. The set of keys will be determined by the itemClass
    */
    private Map<String,String> itemClassData;
    /**
    * Set of fields originally returned from APIv6. Provided to facilitate migration from APIv6 to API-NG, and ultimately onto itemClass and itemClassData
    */
    private StatementLegacyData legacyData;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     /**
    * An external reference, eg. equivalent to betId in the case of an exchange bet statement item.
    */
    public String getRefId(){
        return refId;
    }
     /**
    * An external reference, eg. equivalent to betId in the case of an exchange bet statement item.
    */
    public void setRefId(String refId){
        this.refId = refId;
    }
     
     /**
    * REQUIRED
    * The date and time of the statement item, eg. equivalent to settledData for an exchange bet statement item. (in ISO-8601 format, not translated)
    */
    public Date getItemDate(){
        return itemDate;
    }
     /**
    * REQUIRED
    * The date and time of the statement item, eg. equivalent to settledData for an exchange bet statement item. (in ISO-8601 format, not translated)
    */
    public void setItemDate(Date itemDate){
        this.itemDate = itemDate;
    }
     
     /**
    * The amount of money the balance is adjusted by
    */
    public Double getAmount(){
        return amount;
    }
     /**
    * The amount of money the balance is adjusted by
    */
    public void setAmount(Double amount){
        this.amount = amount;
    }
     
     /**
    * Account balance.
    */
    public Double getBalance(){
        return balance;
    }
     /**
    * Account balance.
    */
    public void setBalance(Double balance){
        this.balance = balance;
    }
     
     /**
    * Class of statement item. This value will determine which set of keys will be included in itemClassData
    */
    public ItemClass getItemClass(){
        return itemClass;
    }
     /**
    * Class of statement item. This value will determine which set of keys will be included in itemClassData
    */
    public void setItemClass(ItemClass itemClass){
        this.itemClass = itemClass;
    }
     
     /**
    * Key value pairs describing the current statement item. The set of keys will be determined by the itemClass
    */
    public Map<String,String> getItemClassData(){
        return itemClassData;
    }
     /**
    * Key value pairs describing the current statement item. The set of keys will be determined by the itemClass
    */
    public void setItemClassData(Map<String,String> itemClassData){
        this.itemClassData = itemClassData;
    }
     
     /**
    * Set of fields originally returned from APIv6. Provided to facilitate migration from APIv6 to API-NG, and ultimately onto itemClass and itemClassData
    */
    public StatementLegacyData getLegacyData(){
        return legacyData;
    }
     /**
    * Set of fields originally returned from APIv6. Provided to facilitate migration from APIv6 to API-NG, and ultimately onto itemClass and itemClassData
    */
    public void setLegacyData(StatementLegacyData legacyData){
        this.legacyData = legacyData;
    }
    
}
