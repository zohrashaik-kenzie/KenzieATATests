package com.kenzie.examples.week8.advancedshape;

import com.kenzie.examples.week8.IConstants;

public enum Tanzu {
    TAP(IConstants.TAP),
    TKO(IConstants.TKO),
    TMC(IConstants.TMC),
    TO(IConstants.TO);

    private String description;


    Tanzu(String s) {
       this.description = s;
    }

    public String getDescription() {


        return description;
    }

    public static void main(String[] args){
        String description = Tanzu.TAP.getDescription();
        System.out.println(description);
    }
}
