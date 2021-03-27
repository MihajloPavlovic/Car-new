
package com.mycompany.car;


public class Car {
    
    public String brand;
    public String model;
    public String color;
    private int buildyear;
    private int mileAge = 0;
    private int fuel;
    private int consumption;
    private int maxFuel;
    
    public Car() {
        this.brand = "";
        this.model = "";
        this.color = "";
        this.buildyear = 0;
    }
    
    public Car(int buildYear) {
        this.buildyear = buildYear;
    }
    
    public Car(String brand, String model, String color, int buildYear, int mileAge, int fuel, int consumption, int maxFuel){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.buildyear = buildYear;
        this.mileAge = mileAge;
        this.fuel = fuel;
        this.consumption = consumption;
        this.maxFuel = maxFuel;
    }
    
    public int getBuildYear() {
        return this.buildyear;
    }
    
    private int getMileAge() {
        return this.mileAge;
    }
    
    private void setMileAge(int newMileAge) {
        this.mileAge = newMileAge;
    }
    
    private int getFuel() {
        return this.fuel;
    }
    private void setFuel(int fuel) {
         this.fuel = fuel;
     }
    
    public int getMaxFuel() {
        return this.maxFuel;
    } 
     
    public void setMaxFuel(int newMaxFuel) {
        this.maxFuel = newMaxFuel;
    }
    
    private int getConsumption() {
        return this.consumption;
    }
    
    public void fuelUp(int fuelUp) {
        if (this.getFuel() + (fuelUp) > this.getMaxFuel()) {
            System.out.println("Ne mozete sipati toliko goriva u rezervoar.");
        } else {
            this.setFuel( this.getFuel() + fuelUp);
            System.out.println("Mozete sipati toliko" + this.getFuel() + "litara goriva u rezervoar");
        }
    }
          
    public void printAttributtes() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Build year: " + this.getBuildYear());
        System.out.println("Mile age: " + this.getMileAge());
        System.out.println("Current fuel: " + this.getFuel());
        System.out.println("");
    }
          
    public void travel(int distance) {
        int fuelNeededForTrip = this.getConsumption() * distance / 100;
        if (this.getFuel() > fuelNeededForTrip) {
            this.setMileAge(this.getMileAge() + distance);
            this.setFuel(this.getFuel() - fuelNeededForTrip);
            System.out.println("Uspesno predjen put od " + distance + " kilometara");
         } else  {
             System.out.println("Nemate dovoljno goriva za takav put");
         }
            
       } 
//        int spentFuel = this.getConsumption() * distance / 100;
//        int newFuel = this.getFuel() - spentFuel;
//        this.setFuel(newFuel);
        
        
    
            
}
