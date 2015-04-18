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
    * Region based on users zip/postcode (ISO 3166-1 alpha-3 format). Defaults to GBR if zip/postcode cannot be identified.
    */
    private String region;
    /**
    * User Time Zone.
    */
    private String timezone;
    /**
    * User Discount Rate.
    */
    private Double discountRate;
    /**
    * The Betfair points balance.
    */
    private Integer pointsBalance;
    /**
    * The customer's country of residence (ISO 2 Char format)
    */
    private String countryCode;


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
    * Region based on users zip/postcode (ISO 3166-1 alpha-3 format). Defaults to GBR if zip/postcode cannot be identified.
    */
    public String getRegion(){
        return region;
    }
     /**
    * Region based on users zip/postcode (ISO 3166-1 alpha-3 format). Defaults to GBR if zip/postcode cannot be identified.
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
    * User Discount Rate.
    */
    public Double getDiscountRate(){
        return discountRate;
    }
     /**
    * User Discount Rate.
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
     
     /**
    * The customer's country of residence (ISO 2 Char format)
    */
    public String getCountryCode(){
        return countryCode;
    }
     /**
    * The customer's country of residence (ISO 2 Char format)
    */
    public void setCountryCode(String countryCode){
        this.countryCode = countryCode;
    }
    
}
