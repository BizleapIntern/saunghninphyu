package com.bizleap.training.assignment.eight;

public class Month {
    int numberOfDays;
    String name;
    int year;
    public Month(int numberOfDays,String name,int year) {
        this.setName(name);
        this.setNumberOfDays(numberOfDays);
        this.setYear(year);


    }

    public int getNumberOfDays() {

        return numberOfDays;
    }
    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return this.name+"/"+this.year;

    }
}

