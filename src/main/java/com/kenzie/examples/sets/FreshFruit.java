package com.kenzie.examples.sets;

import java.util.Objects;

public class FreshFruit {

    private String name;
    private boolean isSeedless;
    private long purchaseCount;

    public FreshFruit(String name, boolean isSeedless) {
        this.name = name;
        this.isSeedless = isSeedless;
        this.purchaseCount = 0;
    }


    public FreshFruit(String name, boolean isSeedless, long purchaseCount) {
        this.name = name;
        this.isSeedless = isSeedless;
        this.purchaseCount = purchaseCount;
    }

    // Updates the current purchase count by the provided purchaseQuantity
    public void addPurchase(int purchaseQuantity) {
        this.purchaseCount = this.purchaseCount + purchaseQuantity;
    }



    @Override
    public String toString() {
        return "FreshFruit{" +
                "name='" + name + '\'' +
                ", isSeedless=" + isSeedless +
                ", purchaseCount=" + purchaseCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreshFruit that = (FreshFruit) o;
        return isSeedless == that.isSeedless &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isSeedless);
    }
}
