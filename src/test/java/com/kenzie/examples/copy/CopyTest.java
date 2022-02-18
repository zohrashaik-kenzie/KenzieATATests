package com.kenzie.examples.copy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CopyTest {

    @Test
    public void whenShallowCopying_thenObjectsShouldNotBeSame() {

        Address address = new Address("Downing St 10", "London", "England");
        User pm = new User("Prime", "Minister", address);

        User shallowCopy = new User(
                pm.getFirstName(), pm.getLastName(), pm.getAddress());

        Assertions.assertEquals(shallowCopy,pm);
    }

    @Test
    public void whenModifyingOriginalObject_ThenCopyShouldChange() {

        Address address = new Address("Downing St 10", "London", "England");
        User pm = new User("Prime", "Minister", address);

        User shallowCopy = new User(
                pm.getFirstName(), pm.getLastName(), pm.getAddress());

        shallowCopy.getAddress().setCountry("Great Britain");
     //   address.setCountry("Great Britain");
        Assertions.assertEquals(shallowCopy.getAddress().getCountry(),
                pm.getAddress().getCountry());
    }

    @Test
    public void whenModifyingOriginalObject_thenCopyShouldNotChange() {
        Address address = new Address("Downing St 10", "London", "England");
        User pm = new User("Prime", "Minister", address);
        User deepCopy = new User(pm);
        deepCopy.getAddress().setCountry("Great Britan");
       // address.setCountry("Great Britain");
        Assertions.assertNotEquals(
                pm.getAddress().getCountry(),
                deepCopy.getAddress().getCountry());
    }

}
