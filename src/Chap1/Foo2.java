package Chap1;
//@todo constructors:
//no return type
//must have the same name as class name
// cannot be static, final or static (because it is used to do the object instantiation, and it can be overriden)
public class Foo2 {
//    legal constructors
    Foo2(){ }
    protected Foo2(int x){}
    Foo2(int x, int... y){}
    private Foo2(byte b){}

////    illegal constructors
////    this is a method instead of constructor
//    void Foo2(){ }
//    static Foo2(float f){}
//    final Foo2(long x){}
//    abstract Foo2(char c);
//    Foo2(int... x, int t){}
}

