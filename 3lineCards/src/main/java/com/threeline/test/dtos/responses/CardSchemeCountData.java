package com.threeline.test.dtos.responses;

public class CardSchemeCountData {
    private String schemeId;
    private Integer count;

    public CardSchemeCountData(String schemeId, Integer count) {
        this.schemeId = schemeId;
        this.count = count;
    }

    public String getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(String schemeId) {
        this.schemeId = schemeId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
