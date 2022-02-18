package com.kenzie.examples.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo  {


    public static void main(String[] args){
        ComparableCat lion = new ComparableCat("Panthera leo (Lion)",500, 40);
        ComparableCat tiger = new ComparableCat("Panthera tigris (Tiger)", 400, 30);
        ComparableCat jaguar = new ComparableCat("Panthera onca (Jaguar)", 200, 50);
        ComparableCat snowLeopard = new ComparableCat("Panthera uncia (Snow Leopard)", 72,35);
        ComparableCat cheetah = new ComparableCat("Acinonyx jubatus (Cheetah)", 200, 80);
        ComparableCat puma = new ComparableCat("Puma concolor (Puma)", 120, 45);

        int compare = jaguar.compareTo(snowLeopard);
        System.out.println(compare);

        boolean same = lion.equals(tiger);

        List<ComparableCat> comparableCats = new ArrayList();
        comparableCats.add(lion);
        comparableCats.add(tiger);
        comparableCats.add(jaguar);
        comparableCats.add(snowLeopard);
        comparableCats.add(cheetah);
        comparableCats.add(puma);

        Collections.sort(comparableCats);

        System.out.println("Cats after sorting by weight:");
        comparableCats.forEach(comparableCat ->System.out.println(comparableCat.getBinomialName() + " " + comparableCat.getSpeed()));
    }



}
