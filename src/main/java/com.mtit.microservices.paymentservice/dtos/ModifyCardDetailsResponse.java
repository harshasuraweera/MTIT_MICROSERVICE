package com.mtit.microservices.paymentservice.dtos;

public class ModifyCardDetailsResponse {

    private String recordId;
    private String message;
    private String newcardNumber;
    private String newcardHolderName;
    private String newmonth;
    private String newyear;
    private String newcvv;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNewcardNumber() {
        return newcardNumber;
    }

    public void setNewcardNumber(String newcardNumber) {
        this.newcardNumber = newcardNumber;
    }

    public String getNewcardHolderName() {
        return newcardHolderName;
    }

    public void setNewcardHolderName(String newcardHolderName) {
        this.newcardHolderName = newcardHolderName;
    }

    public String getNewmonth() {
        return newmonth;
    }

    public void setNewmonth(String newmonth) {
        this.newmonth = newmonth;
    }

    public String getNewyear() {
        return newyear;
    }

    public void setNewyear(String newyear) {
        this.newyear = newyear;
    }

    public String getNewcvv() {
        return newcvv;
    }

    public void setNewcvv(String newcvv) {
        this.newcvv = newcvv;
    }

    @Override
    public String toString() {
        return "ModifyCardDetailsResponse{" +
                "recordId='" + recordId + '\'' +
                ", message='" + message + '\'' +
                ", newcardNumber='" + newcardNumber + '\'' +
                ", newcardHolderName='" + newcardHolderName + '\'' +
                ", newmonth='" + newmonth + '\'' +
                ", newyear='" + newyear + '\'' +
                ", newcvv='" + newcvv + '\'' +
                '}';
    }
}

