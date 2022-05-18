package com.kenzie.examples.week16.amazonshippingservice;

import java.util.Objects;

public class AddressServiceRequest {
    private final String country;
    public AddressServiceRequest(String country) {
        this.country = country;
    }
    public String getCustomerId() {
        return this.getCustomerId();
    }
    public String getCountry() {
        return this.country;
    }
    @Override
    public int hashCode() {
        return Objects.hash(country);
    }

    public boolean equals() {
        return Objects.equals(this.country,country);
    }
}
