package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.InstructionReportErrorCode;
import com.betfair.aping.betting.enums.InstructionReportStatus;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class UpdateInstructionReport {
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
    private UpdateInstruction instruction;


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

    public UpdateInstruction getInstruction(){
        return instruction;
    }
     
    /**
    * REQUIRED
    * The instruction that was requested
    */

    public void setInstruction(UpdateInstruction instruction){
        this.instruction = instruction;
    }
    
}
