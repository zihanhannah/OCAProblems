package Kid;
//must import the class in other package you want to use
import Parent.Parent;
public class Kid extends Parent{
    public void testIt(){
//  no problem by inheritance, and in the parent's class, the variable is defined as protected
        System.out.println("x is " + x);
////@todo for a subclass outside the package, the protected member can be accessed only through inheritance
////        compile error
//        Parent p = new Parent();
//        System.out.println("x in parent is " + p.x);

////        private method in parent class cannot be seen in child class
//        System.out.println(doThings());

////  default method/variable in different package cannot be seen in the subclass
//        System.out.println("y is " + y);
////@todo NO access modifiers can be applied to local variables,only final can be applied to local variables
//private int x = 7;
    }
////   @todo compile error: final method in superclass cannot be inherited
//    public void showSample(){
//        System.out.println("Another thing");
//    }

//    argument can be final, but the value of the final variable cannot be changed
    public void getKid(int fileNumber, final int recNumber){

    }

}
