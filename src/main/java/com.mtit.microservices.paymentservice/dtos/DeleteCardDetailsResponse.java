package com.mtit.microservices.paymentservice.dtos;

public class DeleteCardDetailsResponse {

    private String recordId;
    private String message;

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


    @Override
    public String toString() {
        return "DeleteCardDetailsResponse{" +
                "recordId='" + recordId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

