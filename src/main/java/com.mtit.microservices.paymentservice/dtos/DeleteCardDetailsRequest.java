package com.mtit.microservices.paymentservice.dtos;

public class DeleteCardDetailsRequest {

    private String recordId;

    public String getrecordId() {
        return recordId;
    }

    public void setrecordId(String recordId) {
        this.recordId = recordId;
    }


    @Override
    public String toString() {
        return "DeleteCardDetailsRequest{" +
                ", recordId=" + recordId +
                '}';
    }
}
