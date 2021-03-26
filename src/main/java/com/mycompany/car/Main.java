package com.mycompany.car;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        Car audi = new Car();
        audi.printAttributtes();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.color = "Black";
        System.out.println("Brand: " + audi.brand);
        System.out.println("Model: " + audi.model);
        System.out.println("Color: " + audi.color);
        audi.printAttributtes();
        
        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "X5";
        System.out.println("Brand: " + bmw.brand);
        System.out.println("Model: " + bmw.model);
        bmw.printAttributtes();
        
        Car fiat = new Car(2010);
        System.out.println("Godina proizvodnje: " + fiat.getBuildYear());
        
        Car lada = new Car("Lada", "Niva", "Green", 2018, 0, 50 , 10);
        lada.printAttributtes();
        lada.travel(300);
        lada.printAttributtes();
        lada.travel(200);
        lada.printAttributtes();
        lada.travel(100);
        lada.printAttributtes();
        
        
        
    }
    
}
