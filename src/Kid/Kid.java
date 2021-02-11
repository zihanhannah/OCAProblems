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
    }

}
