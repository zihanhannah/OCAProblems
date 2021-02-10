package Chap1;

class Driver {
    void doDriverStuff(){
//        invoking a method using a reference of the class.
//        the reference of the class must be created inside the method which is invoking(doDriverStuff)
        SportsCar car = new SportsCar();
        car.goFast();
        Convertible con = new Convertible();
        con.goFast();
    }

}
