package com.mtit.microservices.paymentservice.dtos;

public class DeleteCardDetailsResponse {

    private String cardId;
    private String message;

    public String getcardId() {
        return cardId;
    }

    public void setcardId(String cardId) {
        this.cardId = cardId;
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
                "cardId='" + cardId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

