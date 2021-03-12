package com.threeline.test.dtos.responses;

import java.util.List;

public class StatsResponse {
    private boolean success;
    private Integer start;
    private Integer limit;
    private Integer size;
    private List<CardSchemeCountData> payload;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }


    public List<CardSchemeCountData> getPayload() {
        return payload;
    }

    public void setPayload(List<CardSchemeCountData> payload) {
        this.payload = payload;
    }
}
