package com.threeline.test.dtos.responses;

public class CardSchemeResponse {
    private boolean success;
    private CardSchemePayloadResponse payload;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public CardSchemePayloadResponse getPayload() {
        return payload;
    }

    public void setPayload(CardSchemePayloadResponse payload) {
        this.payload = payload;
    }
}
