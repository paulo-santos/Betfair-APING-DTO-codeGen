package com.betfair.aping.betting.entities;

import java.util.Date;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class Event {
    /**
    * The unique id for the event
    */
    private String id;
    /**
    * The name of the event
    */
    private String name;
    /**
    * The ISO-2 code for the event.  A list of ISO-2 codes is available via http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
    */
    private String countryCode;
    /**
    * The timezone in which the event is taking place
    */
    private String timezone;
    /**
    * venue
    */
    private String venue;
    /**
    * The scheduled start date and time of the event.
    */
    private Date openDate;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * The unique id for the event
    */

    public String getId(){
        return id;
    }
     
    /**
    * The unique id for the event
    */

    public void setId(String id){
        this.id = id;
    }
     
     
    /**
    * The name of the event
    */

    public String getName(){
        return name;
    }
     
    /**
    * The name of the event
    */

    public void setName(String name){
        this.name = name;
    }
     
     
    /**
    * The ISO-2 code for the event.  A list of ISO-2 codes is available via http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
    */

    public String getCountryCode(){
        return countryCode;
    }
     
    /**
    * The ISO-2 code for the event.  A list of ISO-2 codes is available via http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
    */

    public void setCountryCode(String countryCode){
        this.countryCode = countryCode;
    }
     
     
    /**
    * The timezone in which the event is taking place
    */

    public String getTimezone(){
        return timezone;
    }
     
    /**
    * The timezone in which the event is taking place
    */

    public void setTimezone(String timezone){
        this.timezone = timezone;
    }
     
     
    /**
    * venue
    */

    public String getVenue(){
        return venue;
    }
     
    /**
    * venue
    */

    public void setVenue(String venue){
        this.venue = venue;
    }
     
     
    /**
    * The scheduled start date and time of the event.
    */

    public Date getOpenDate(){
        return openDate;
    }
     
    /**
    * The scheduled start date and time of the event.
    */

    public void setOpenDate(Date openDate){
        this.openDate = openDate;
    }
    
}
