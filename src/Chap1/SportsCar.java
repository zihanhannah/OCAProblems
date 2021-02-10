package Chap1;
//compares a class inheriting a member of another class and accessing a member of another class using a reference of
// an instance of that class.
// class SportsCar, Convertible and Driver
class SportsCar {
    void goFast(){}
//    invoking a method in the same class
    void doStuff(){
        goFast();
    }

}
