class A{}
public class B extends A {
    public static void main(String[] args) {
        A myA = new B();
        m2(myA);
    }
    public static void m2(A a){
        if(a instanceof B){
//            downcasting an A reference to a B reference
            ((B)a).doBstuff();
        }
    }
    public static void doBstuff(){
        System.out.println("'a' refers to a 'B'");
    }
}
