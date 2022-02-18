package com.kenzie.examples.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {



    static class WeightCompare implements Comparator<Cat>
    {
        public int compare(Cat c1, Cat c2)
        {
           if (c1.getWeight() > c2.getWeight()) return -1;
           else if (c1.getWeight() < c2.getWeight()) return 1;

           return 0;
        }
    }

    static class SpeedCompare implements Comparator<Cat>
    {
        public int compare(Cat c1, Cat c2)
        {
            if (c1.getSpeed() > c2.getSpeed()) return -1;
            else if (c1.getSpeed() < c2.getSpeed()) return 1;

            return 0;
        }
    }


    public static void main(String[] args){
        Cat lion = new Cat("Panthera leo (Lion)",500, 40);
        Cat tiger = new Cat("Panthera tigris (Tiger)", 400, 30);
        Cat jaguar = new Cat("Panthera onca (Jaguar)", 250, 50);
        Cat snowLeopard = new Cat("Panthera uncia (Snow Leopard)", 72,35);
        Cat cheetah = new Cat("Acinonyx jubatus (Cheetah)", 200, 80);
        Cat puma = new Cat("Puma concolor (Puma)", 120, 45);

        List<Cat> cats = new ArrayList();
        cats.add(lion);
        cats.add(tiger);
        cats.add(jaguar);
        cats.add(snowLeopard);
        cats.add(cheetah);
        cats.add(puma);

        System.out.println("\nSorted by Weight");
        WeightCompare weightCompare = new WeightCompare();
        Collections.sort(cats, weightCompare);

        cats.forEach(cat ->
                System.out.println(cat.getBinomialName() + ", Weight: " + cat.getWeight()));

        System.out.println("\nSorted by Speed");
        SpeedCompare speedCompare = new SpeedCompare();
        Collections.sort(cats, speedCompare);

        cats.forEach(cat ->
                System.out.println(cat.getBinomialName() + ", Speed: " + cat.getSpeed()));

    }

}

