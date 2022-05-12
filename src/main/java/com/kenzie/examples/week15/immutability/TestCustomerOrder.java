package com.kenzie.examples.week15.immutability;

import java.util.Date;

public class TestCustomerOrder {
    public TestCustomerOrder(Date date) {
        this.date = date;
    }

    private Date date;


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
