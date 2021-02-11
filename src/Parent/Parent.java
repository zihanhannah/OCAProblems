package Parent;
//if change class Parent to default, it cannot be inherited by the class outside the same package
public class Parent {
    protected int x = 9;
//    private method cannot be inherited by child class
    private String doThings(){
        return "fun";
    }
//    protected String doThings(){
//        return "fun";
//    }

//    default method/ variable
    int y = 9;
}
