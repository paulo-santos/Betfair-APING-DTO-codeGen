package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.InstructionReportErrorCode;
import com.betfair.aping.betting.enums.InstructionReportStatus;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class ReplaceInstructionReport {
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
    * Cancelation report for the original order
    */
    private CancelInstructionReport cancelInstructionReport;
    /**
    * Placement report for the new order
    */
    private PlaceInstructionReport placeInstructionReport;


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
    * Cancelation report for the original order
    */

    public CancelInstructionReport getCancelInstructionReport(){
        return cancelInstructionReport;
    }
     
    /**
    * Cancelation report for the original order
    */

    public void setCancelInstructionReport(CancelInstructionReport cancelInstructionReport){
        this.cancelInstructionReport = cancelInstructionReport;
    }
     
     
    /**
    * Placement report for the new order
    */

    public PlaceInstructionReport getPlaceInstructionReport(){
        return placeInstructionReport;
    }
     
    /**
    * Placement report for the new order
    */

    public void setPlaceInstructionReport(PlaceInstructionReport placeInstructionReport){
        this.placeInstructionReport = placeInstructionReport;
    }
    
}
