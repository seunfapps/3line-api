package com.threeline.test.api.dtos.responses;

public class AlgoTestResultResponse {
    private int [] originalA;
    private int [] originalB;
    private int [] modified;
    private int [] recoveredA;
    private int [] recoveredB;

    public int[] getOriginalA() {
        return originalA;
    }

    public void setOriginalA(int[] originalA) {
        this.originalA = originalA;
    }

    public int[] getOriginalB() {
        return originalB;
    }

    public void setOriginalB(int[] originalB) {
        this.originalB = originalB;
    }

    public int[] getModified() {
        return modified;
    }

    public void setModified(int[] modified) {
        this.modified = modified;
    }

    public int[] getRecoveredA() {
        return recoveredA;
    }

    public void setRecoveredA(int[] recoveredA) {
        this.recoveredA = recoveredA;
    }

    public int[] getRecoveredB() {
        return recoveredB;
    }

    public void setRecoveredB(int[] recoveredB) {
        this.recoveredB = recoveredB;
    }
}
