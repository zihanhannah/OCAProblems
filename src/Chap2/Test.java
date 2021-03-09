package Chap2;

class Test {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        if(!t1.equals(t2)){
            System.out.println("t1 is not equals to t2");
        }
//        @todo every class in java is a subclass of class Object
        if(t1 instanceof Object){
            System.out.println("t1 is an Object");
        }

    }
}
