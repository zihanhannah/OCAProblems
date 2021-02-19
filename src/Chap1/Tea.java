package Chap1;
////the final class Beverage cannot be extended,that means none of the methods in Beverage can be overriden
//public class Tea extends Beverage{
//}
public class Tea{
// @todo synchronized and  modifier can be applied only to method, not variable not class
//          synchronized modifier can pair with any four access control levels
    public synchronized void retrieveUserInfo(int id){}
//@todo strictfp can be used for method and class not variable
//@todo native can only be used for method, not variable and class;the body must be semicolon;(like abstract method)
}