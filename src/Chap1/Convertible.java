package Chap1;

class Convertible extends SportsCar{
    void doThings(){
//        using a reference of the class
        SportsCar sc = new SportsCar();
        sc.goFast();
    }
//    invoking an inherited method
    void doMore(){
//        if a method invoked without the dot operator(.) that means the method or variable is from the same class
        goFast();
//        goFast() also can be write as this.goFast();

    }
}
