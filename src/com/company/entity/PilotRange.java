package com.company.entity;

public enum PilotRange {
    FIRST_PILOT("first pilot"),
    SECOND_PILOT("second pilot");

    private final String pRange;

    PilotRange(String pRange) {
        this.pRange = pRange;
    }

    public String getpRange() {
        return pRange;
    }

    public static PilotRange getByRange(String pRange){
        for(PilotRange range : values()){
            if(range.getpRange().equals(pRange)){
                return range;
            }
        }
        throw new IllegalArgumentException("No enum found with range: [" + pRange + "]");
    }
}
