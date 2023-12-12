package Classespart1;
//public class allows any code can access tis class
// no modifier on a class only allows a class to be available to a package
//protected allows package access and any subclasses
//private means no other class can access this class
//all fields should be private {encapsulation}
public class Car {

private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void describeCar {
        System.out.println(doors + "-Door " +
                color + " "+
                make + " "+
                model+ " "+
                (convertible ? "Convertible": ""));
    }
}
