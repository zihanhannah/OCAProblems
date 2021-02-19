package Chap1;
//the first concrete class need to implements all the abstract method in all abstract class in the tree
public class Mini extends Car{
    @Override
    public void goFast() {

    }

    @Override
    public void goUpHill() {

    }

    @Override
    public void impressNeighbors() {

    }


    public static void main(String[] args) {
        Mini mini = new Mini();
//        the final method finalMethod() in superclass Car cannot be overridden
        mini.finalMethod();
    }
}
