
package com.mycompany.car;


public class Car {
    
    public String brand;
    public String model;
    public String color;
    private int buildyear;
    private int mileAge = 0;
    private int fuel;
    private int consumption;
    
    public Car() {
        this.brand = "";
        this.model = "";
        this.color = "";
        this.buildyear = 0;
    }
    
    public Car(int buildYear) {
        this.buildyear = buildYear;
    }
    
    public Car(String brand, String model, String color, int buildYear, int mileAge, int fuel, int consumption){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.buildyear = buildYear;
        this.mileAge = mileAge;
        this.fuel = fuel;
        this.consumption = consumption;
    }
    
    public int getBuildYear() {
        return this.buildyear;
    }
    
    private int getMileAge() {
        return this.mileAge;
    }
    
    private int getFuel() {
        return this.fuel;
    }
     private void setFuel(int fuel) {
         this.fuel = fuel;
     }
    
    private void setMileAge(int newMileAge) {
        this.mileAge = newMileAge;
    }
    
    private int getConsumption() {
        return this.consumption;
    }
    
    
          
    public void printAttributtes() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Build year: " + this.getBuildYear());
        System.out.println("Mile age: " + this.getMileAge());
        System.out.println("Current fuel: " + this.getFuel());
    }
          
    public void travel(int distance) {
        this.setMileAge(this.getMileAge() + distance);
        int spentFuel = this.getConsumption() * distance;
        int newFuel = this.getFuel() - spentFuel;
        this.setFuel(newFuel);
    }
            
}
