package com.kenzie.examples.week8.advancedshape;

public class BuildingBluePrint {
    static int number_of_buildings = 0;
    static int total_number_of_floors = 0;
    String address;
    double square_footage;
    int number_of_floors;

    public BuildingBluePrint(String address, double square_footage, int number_of_floors) {
        this.address = address;
        this.square_footage = square_footage;
        this.number_of_floors = number_of_floors;
        number_of_buildings++;
        total_number_of_floors += number_of_floors;
    }

    public static int calculateTotalNumberOfFloors(){
        return total_number_of_floors;
    }
    public static void printNumberOfBuildings(){
        System.out.println("The number of buildings = " + number_of_buildings);

    }

    public static void main(String[] args){
        BuildingBluePrint building1 = new BuildingBluePrint("123 Main Street", 1500, 2);
        BuildingBluePrint building2 = new BuildingBluePrint("124 Main Street", 2500, 3);
        printNumberOfBuildings();

        System.out.println("Total number of floors = " + BuildingBluePrint.calculateTotalNumberOfFloors());
    }
}
