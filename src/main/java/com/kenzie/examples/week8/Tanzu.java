package com.kenzie.examples.week8;

public enum Tanzu {
    TAP(IConstants.TAP),
    TMC(IConstants.TMC),
    TKO(IConstants.TKO),
    TO(IConstants.TO);

    String description;

    Tanzu(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    private static void getEnum(Enum t){
        if(t.compareTo(Tanzu.TAP) == 0){
            System.out.println("You are using Tanzu Application Platform");
        } else  if(t.compareTo(Tanzu.TKO) == 0){
            System.out.println("You are using Tanzu Kubernetes for Operations");
        }
    }
    public static void main(String[] args){

        System.out.println(Tanzu.TAP.getDescription());
    }
}
