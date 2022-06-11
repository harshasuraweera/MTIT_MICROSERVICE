package com.mtit.microservices.paymentservice.dtos;

public class DeleteCardDetailsRequest {

    private String cardId;

    public String getcardId() {
        return cardId;
    }

    public void setcardId(String cardId) {
        this.cardId = cardId;
    }


    @Override
    public String toString() {
        return "DeleteCardDetailsRequest{" +
                ", cardId=" + cardId +
                '}';
    }
}
