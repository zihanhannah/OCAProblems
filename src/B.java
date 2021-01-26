interface Foo{}
class A implements  Foo{}
public class B extends A {
    public static void main(String[] args) {
        A myA = new B();
        m2(myA);
        A a = new A();
        B b = new B();
        if(b instanceof A){
            System.out.println("b is instanceof object A");
        }
        if(b instanceof  Foo){
            System.out.println("b is instanceof interface object Foo, implemented indirectly");
        }
        if(a instanceof Foo){
            System.out.println("a is instanceof interface object Foo");
        }
//        not true. check is-a
        if(a instanceof B ){
            System.out.println("a is instanceof B");
        }
//        null is not the instance of any object. always return false
        if(!(null instanceof B)){
            System.out.println("null is not instanceof any object, always return false");
        }
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
