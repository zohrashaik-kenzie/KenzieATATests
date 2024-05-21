package com.kenzie.examples.week15.immutability;

import java.math.BigDecimal;
import java.util.Date;

public class TestCustomerOrder{
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

    public static void main(String[] args){
        CustomerOrder order = new CustomerOrder(10L,"Customer one", new BigDecimal(100.0),new Date());
      //  order.setCustomerID(20L);
    }
}
