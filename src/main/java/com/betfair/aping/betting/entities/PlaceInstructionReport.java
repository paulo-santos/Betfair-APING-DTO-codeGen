package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.InstructionReportErrorCode;
import com.betfair.aping.betting.enums.InstructionReportStatus;
import java.util.Date;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class PlaceInstructionReport {
    /**
    * REQUIRED
    * whether the command succeeded or failed
    */
    private InstructionReportStatus status;
    /**
    * cause of failure, or null if command succeeds
    */
    private InstructionReportErrorCode errorCode;
    /**
    * REQUIRED
    * The instruction that was requested
    */
    private PlaceInstruction instruction;
    /**
    * The bet ID of the new bet. May be null on failure.
    */
    private String betId;
    /**
    * The date on which the bet was placed
    */
    private Date placedDate;
    /**
    * The average price matched
    */
    private Double averagePriceMatched;
    /**
    * The size matched.
    */
    private Double sizeMatched;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * REQUIRED
    * whether the command succeeded or failed
    */

    public InstructionReportStatus getStatus(){
        return status;
    }
     
    /**
    * REQUIRED
    * whether the command succeeded or failed
    */

    public void setStatus(InstructionReportStatus status){
        this.status = status;
    }
     
     
    /**
    * cause of failure, or null if command succeeds
    */

    public InstructionReportErrorCode getErrorCode(){
        return errorCode;
    }
     
    /**
    * cause of failure, or null if command succeeds
    */

    public void setErrorCode(InstructionReportErrorCode errorCode){
        this.errorCode = errorCode;
    }
     
     
    /**
    * REQUIRED
    * The instruction that was requested
    */

    public PlaceInstruction getInstruction(){
        return instruction;
    }
     
    /**
    * REQUIRED
    * The instruction that was requested
    */

    public void setInstruction(PlaceInstruction instruction){
        this.instruction = instruction;
    }
     
     
    /**
    * The bet ID of the new bet. May be null on failure.
    */

    public String getBetId(){
        return betId;
    }
     
    /**
    * The bet ID of the new bet. May be null on failure.
    */

    public void setBetId(String betId){
        this.betId = betId;
    }
     
     
    /**
    * The date on which the bet was placed
    */

    public Date getPlacedDate(){
        return placedDate;
    }
     
    /**
    * The date on which the bet was placed
    */

    public void setPlacedDate(Date placedDate){
        this.placedDate = placedDate;
    }
     
     
    /**
    * The average price matched
    */

    public Double getAveragePriceMatched(){
        return averagePriceMatched;
    }
     
    /**
    * The average price matched
    */

    public void setAveragePriceMatched(Double averagePriceMatched){
        this.averagePriceMatched = averagePriceMatched;
    }
     
     
    /**
    * The size matched.
    */

    public Double getSizeMatched(){
        return sizeMatched;
    }
     
    /**
    * The size matched.
    */

    public void setSizeMatched(Double sizeMatched){
        this.sizeMatched = sizeMatched;
    }
    
}
