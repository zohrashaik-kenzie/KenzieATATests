package com.kenzie.examples.week6;

import java.util.Date;

public class Employee {

     String name;
     Address employeeAddress;

     String employeeID;
     String designation;
     String department;

     Date startDate;
     int vacationDaysAccrued;
    private float salary;

    public Employee() {
        vacationDaysAccrued = 0;
        department = "HR";

    }

    public Employee(String name, String designation, String department) {
        this.name = name;
        this.designation = designation;
        this.department = department;
    }

    public Employee(String name, String designation, String department, int days) {
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.vacationDaysAccrued = days;
    }

    public Employee(String name, Address employeeAddress, String employeeID, String designation, String department, Date startDate, int vacationDaysAccrued, float salary) {
        this.name = name;
        this.employeeAddress = employeeAddress;
        this.employeeID = employeeID;
        this.designation = designation;
        this.department = department;
        this.startDate = startDate;
        this.vacationDaysAccrued = vacationDaysAccrued;
        this.salary = salary;
    }

    public Employee(String name, String employeeID, String designation, String department) {
        this(name,designation,department);
        this.employeeID = employeeID;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    protected float getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeAddress(Address employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setVacationDaysAccrued(int vacationDaysAccrued) {

        this.vacationDaysAccrued = vacationDaysAccrued;
    }

    public String getName() {
        return name;
    }

    public Address getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    private float calculateSalary(){
        return 0f;
    }

    public static void main(String[] args){


         String string = new String();
         String string2 = new String("This is the initial string");
         Employee employee0 = new Employee();
        Employee employee1 = new Employee("Zohra Shaik","SME","Instruction");

        Employee employee2 = new Employee("Kyle Thomas","101", "Facilitator","Instruction");

         return;
     }

}
