package com.betfair.aping.account.entities;


import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class AccountDetailsResponse {
    /**
    * Default user currency Code.
    */
    private String currencyCode;
    /**
    * First Name.
    */
    private String firstName;
    /**
    * Last Name.
    */
    private String lastName;
    /**
    * Locale Code.
    */
    private String localeCode;
    /**
    * Region.
    */
    private String region;
    /**
    * User Time Zone.
    */
    private String timezone;
    /**
    * Uer Discount Rate.
    */
    private Double discountRate;
    /**
    * The Betfair points balance.
    */
    private Integer pointsBalance;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * Default user currency Code.
    */

    public String getCurrencyCode(){
        return currencyCode;
    }
     
    /**
    * Default user currency Code.
    */

    public void setCurrencyCode(String currencyCode){
        this.currencyCode = currencyCode;
    }
     
     
    /**
    * First Name.
    */

    public String getFirstName(){
        return firstName;
    }
     
    /**
    * First Name.
    */

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
     
     
    /**
    * Last Name.
    */

    public String getLastName(){
        return lastName;
    }
     
    /**
    * Last Name.
    */

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
     
     
    /**
    * Locale Code.
    */

    public String getLocaleCode(){
        return localeCode;
    }
     
    /**
    * Locale Code.
    */

    public void setLocaleCode(String localeCode){
        this.localeCode = localeCode;
    }
     
     
    /**
    * Region.
    */

    public String getRegion(){
        return region;
    }
     
    /**
    * Region.
    */

    public void setRegion(String region){
        this.region = region;
    }
     
     
    /**
    * User Time Zone.
    */

    public String getTimezone(){
        return timezone;
    }
     
    /**
    * User Time Zone.
    */

    public void setTimezone(String timezone){
        this.timezone = timezone;
    }
     
     
    /**
    * Uer Discount Rate.
    */

    public Double getDiscountRate(){
        return discountRate;
    }
     
    /**
    * Uer Discount Rate.
    */

    public void setDiscountRate(Double discountRate){
        this.discountRate = discountRate;
    }
     
     
    /**
    * The Betfair points balance.
    */

    public Integer getPointsBalance(){
        return pointsBalance;
    }
     
    /**
    * The Betfair points balance.
    */

    public void setPointsBalance(Integer pointsBalance){
        this.pointsBalance = pointsBalance;
    }
    
}
