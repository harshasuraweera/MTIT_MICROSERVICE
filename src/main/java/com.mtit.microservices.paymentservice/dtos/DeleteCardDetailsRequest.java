package com.mtit.microservices.paymentservice.dtos;

public class DeleteCardDetailsRequest {

    private String recordId;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }



    @Override
    public String toString() {
        return "DeleteCardDetailsRequest{" +
                "recordId='" + recordId + '\'' +
                '}';
    }
}
