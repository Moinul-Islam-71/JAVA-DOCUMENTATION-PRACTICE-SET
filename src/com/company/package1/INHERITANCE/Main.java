package com.company.package1.INHERITANCE; 

public class Main{
    public static void main(String[] args){
    
        //inheritence = the process where one class acquires
        //              attributes and methods of another classes.

       Car car = new Car(); 
        car.go(); 

        Car car2 = new Car(); 
        car2.stop();

       /*When you write car.go();, you are invoking the go() method on the car object.*/

        /*car: Refers to an instance of the Car class that you created earlier in your main method.

        go(): This is a method defined in the Vehicle class, which both the Car and Bicycle classes inherit from. By calling car.go();,
        
        you are instructing the car object to execute the go() method.

        Inside the go() method, a message "This vehicle is moving." will be printed to the console, indicating that the vehicle (in this case, the car) is moving.
        So, car.go(); essentially triggers the go() method for the car object, causing it to print a message indicating that the car is moving. */



       Bicycle bike = new Bicycle();
       bike.stop(); 
       System.out.println(car.speed); 
       System.out.println(car.door); 
       System.out.println(car.sits); 
       System.out.println(car.wheels); 
       System.out.println(bike.sits); 
       System.out.println(bike.doors); 
       System.out.println(bike.wheels);
    }
}

/*Objects:
car: An object of the Car class.
bike: An object of the Bicycle class.*/

/*Methods:

*main: The main method where the program execution begins.

*go: A method defined in the Vehicle class. It prints a message indicating that the vehicle is moving.

*stop: A method defined in the Vehicle class. It  prints a message indicating that the vehicle is stopped.*/

/*Attributes (Fields):
1.speed: An attribute of the Vehicle class, representing the speed of the vehicle.

2.wheels: An attribute of the Vehicle, Car, and Bicycle classes, representing the number of wheels each vehicle type has.

3.pedals: An attribute of the Bicycle class, representing the number of pedals on a bicycle.
doors: An attribute of the Car class, representing the number of doors on a car. 


*/

/*Additional Notes:
Attributes represent the state or properties of an object.
Methods define the behavior of an object.
Inheritance allows subclasses (Car and Bicycle) to inherit attributes and methods from the superclass (Vehicle).*/
