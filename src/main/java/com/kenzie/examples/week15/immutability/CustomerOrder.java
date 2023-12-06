package com.kenzie.examples.week15.immutability;

import java.math.BigDecimal;
import java.util.Date;

public final class CustomerOrder {
    private final long customerID;
    private final String name;
    private final BigDecimal orderAmount;
    private final Date orderDate;
    /**
     * Constructor.
     * @param customerID - Customer identifier
     * @param name - Customer full name
     * @param orderAmount - Dollar amount of order
     * @param orderDate - Day order was made
     */
    public CustomerOrder(long customerID, String name, BigDecimal orderAmount, Date orderDate) {
        this.customerID = customerID;
        this.name = name;
        this.orderAmount = orderAmount;
        this.orderDate = new Date(orderDate.getTime()); // defensive copy
    }
    /**
     * Returns immutable primitive long.
     * Since long is immutable in Java, a new long will be returned.
     * @return customer identifier
     */
    public long getCustomerID() {
        return customerID;
    }
    /**
     * Returns immutable String.
     * Since String is immutable in Java, a new String will be returned.
     * @return customer name
     */
    public String getName() {
        return name;
    }
    /**
     * Returns immutable BigDecimal.
     * Since BigDecimal is immutable in Java, a new BigDecimal will be returned.
     * @return order amount
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }
    /**
     * Returns mutable copy of the order date.
     * Since Date is mutable in Java, we defensively copy its value to a new Date object.
     * @return a new instance of the orderDate;
     */
    public Date getOrderDate() {
        return new Date(orderDate.getTime());
    }
    /**
     * Compute the total cost of the order.
     * Since BigDecimal is immutable in Java, a new BigDecimal will be returned.
     * @param taxRate - the tax rate for the purchase
     * @return order cost
     */
    public BigDecimal computeBill(BigDecimal taxRate) {
        BigDecimal taxRatio = taxRate.add(new BigDecimal("1.0"));
        return orderAmount.multiply(taxRatio);
    }
}