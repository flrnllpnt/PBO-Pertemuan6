package com.pboreg.JavaInheritance2;

class Vehicle {
    protected String brand = "Ford"; // Vehicle attribute
    public void honk() {            // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang"; // car attribute
    public static void main(String[] args) {

        //Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
