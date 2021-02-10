package Chap1;
//interface can extend one or more other interfaces
// cannot extend anything but another interface
//cannot implement another interface or class
//interface class must have the keyword interface
//public must be typed out if the class is public
// public abstract interface Bounceable{} : abstract is redundant
public interface Bounceable {
//   @todo   interface methods are implicitly public and abstract, unless declared as default or static, cannot be
//    final, strictfp or native
//    what compiler sees
//    public abstract void bounce();
//    public abstract void setBounceFactor(int bf);
    void bounce();
    void setBounceFactor(int bf);
// legal : abstract public void bounce();
//    public void bounce();
//    abstract void bounce();
//illegal: private void bounce();
//    protected void bounce();
//    final void bounce();


// @todo constant in interface: must be public static final (implicit)
//  (any class implementing the interface will have
// access to the same constant) check class Zap to see more detail
    int BAR = 42;
//legal: public static final int BAR = 42;
//    int BAR = 42;
//    static int BAR = 42;
//    final int BAR = 42;
//    static public final int BAR = 42;
//    static final int BAR = 42;
//    public final int BAR = 42;
    void go();


// @todo default method in interface, is public by definition(optional)
//cannot be marked as private, protected, static, final, or abstract
//must have a concrete method body
    default int ml(){return 1;}
    public default void m2(){}
////    illegal
//    static default void m3(){}
//    default void m4();


// @todo static interface method
// public by definition(optional)
// cannot be marked as private, protected, static, final, or abstract
// must have a concrete method body
// when invoking this method, method's type(interface name) must be included in the invocation
    static int m1(){return 42;}
    public static void m22(){};
////    illegal
//    final static void m3(){ }
//    static void m5();

}
