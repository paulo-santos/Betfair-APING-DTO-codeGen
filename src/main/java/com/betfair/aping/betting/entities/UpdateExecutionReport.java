package com.betfair.aping.betting.entities;

import com.betfair.aping.betting.enums.ExecutionReportErrorCode;
import com.betfair.aping.betting.enums.ExecutionReportStatus;
import java.util.List;

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class UpdateExecutionReport {
    /**
    * Echo of the customerRef if passed.
    */
    private String customerRef;
    private ExecutionReportStatus status;
    private ExecutionReportErrorCode errorCode;
    /**
    * Echo of marketId passed
    */
    private String marketId;
    private List<UpdateInstructionReport> instructionReports;


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
     
    /**
    * Echo of the customerRef if passed.
    */

    public String getCustomerRef(){
        return customerRef;
    }
     
    /**
    * Echo of the customerRef if passed.
    */

    public void setCustomerRef(String customerRef){
        this.customerRef = customerRef;
    }
     
     
    public ExecutionReportStatus getStatus(){
        return status;
    }
     
    public void setStatus(ExecutionReportStatus status){
        this.status = status;
    }
     
     
    public ExecutionReportErrorCode getErrorCode(){
        return errorCode;
    }
     
    public void setErrorCode(ExecutionReportErrorCode errorCode){
        this.errorCode = errorCode;
    }
     
     
    /**
    * Echo of marketId passed
    */

    public String getMarketId(){
        return marketId;
    }
     
    /**
    * Echo of marketId passed
    */

    public void setMarketId(String marketId){
        this.marketId = marketId;
    }
     
     
    public List<UpdateInstructionReport> getInstructionReports(){
        return instructionReports;
    }
     
    public void setInstructionReports(List<UpdateInstructionReport> instructionReports){
        this.instructionReports = instructionReports;
    }
    
}
