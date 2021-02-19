package Chap1;
//abstract class can only be extended, cannot be implemented.
//interface class can be implemented, interface can be extended by another interface
//if there is an abstract method in the class, the class must declared as abstract class and must have keyword abstract
//public must have the keyword to make it public abstract class
abstract class Car extends Vehicle{
    private double price;
    private String model;
    private String year;
//    abstract method must have the keyword "abstract" and end with ; without concrete
    public abstract void goFast();
//    abstract class extend another abstract class, there is no need to implement the abstract method to make it
//    concrete
    public abstract void goUpHill();
    public abstract void impressNeighbors();
//    abstract class CAN have non-abstract method(concrete method)
    public void nonAbstractMethod(){};

//    public static void main(String[] args) {
//// @todo       abstract class CANNOT be instantiated. only can be extended(subclassed)
////        compile error: java: Chap1.Car is abstract; cannot be instantiated
//        Car x = new Car();
//    }
    final void finalMethod(){
        System.out.println("hello");
    }
}
