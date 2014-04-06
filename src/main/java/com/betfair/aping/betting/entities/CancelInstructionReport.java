package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.InstructionReportErrorCode;
import com.betfair.aping.betting.enums.InstructionReportStatus;
import java.util.Date;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class CancelInstructionReport {
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
    * The instruction that was requested
    */
    private CancelInstruction instruction;
    private Double sizeCancelled;
    private Date cancelledDate;


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
    * The instruction that was requested
    */

    public CancelInstruction getInstruction(){
        return instruction;
    }
     
    /**
    * The instruction that was requested
    */

    public void setInstruction(CancelInstruction instruction){
        this.instruction = instruction;
    }
     
     
    public Double getSizeCancelled(){
        return sizeCancelled;
    }
     
    public void setSizeCancelled(Double sizeCancelled){
        this.sizeCancelled = sizeCancelled;
    }
     
     
    public Date getCancelledDate(){
        return cancelledDate;
    }
     
    public void setCancelledDate(Date cancelledDate){
        this.cancelledDate = cancelledDate;
    }
    
}
