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
//    @todo all the variables in the interface must be public static and final. only constants, not instance variables.
    void bounce();
    void setBounceFactor(int bf);
// legal : abstract public void bounce();
//    public void bounce();
//    abstract void bounce();
//illegal: private void bounce();
//    protected void bounce();
//    final void bounce();


//constant in interface: must be public static final (implicit) (any class implementing the interface will have
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

}
