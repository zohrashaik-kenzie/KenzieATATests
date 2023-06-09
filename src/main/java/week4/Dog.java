package week4;

import java.util.ArrayList;

public class Dog {

    //members - name, breed, age, color
    String name;
    String breed;
    int age;
    String color;

    String buyCoat() {
        if (color.equalsIgnoreCase("Orange")) {
           return "Lets buy you a white coat";
        } else {
            return "Lets buy you a black coat";
        }
    }

    public static void main(String[] args){

        Dog dog1Object = new Dog();
        ArrayList<Dog> dogList = new ArrayList<>();
        dog1Object.breed = "Bulldog";
        dog1Object.color = "Light Gray";
        dog1Object.age = 5;
        dog1Object.name = "Fido";
        dogList.add(dog1Object);
        System.out.println(dog1Object.name);
        String coatColor = dog1Object.buyCoat();
        System.out.println(coatColor);

        Dog dog2Object = new Dog();
        dog2Object.breed = "Beagle";
        dog2Object.color = "Orange";
        dog2Object.age = 6;
        dog2Object.name = "Rover";
        dogList.add(dog2Object);
        System.out.println(dog2Object.name);
        dog2Object.buyCoat();

        System.out.println(dogList.get(0).name);
        System.out.println(dogList.get(1).name);


    }
}
