package Chap1;

public class Zap implements Bounceable{

    @Override
    public void bounce() {

    }

    @Override
    public void setBounceFactor(int bf) {

    }

    @Override
    public void go() {
////        cannot assign BAR to other value, because BAR in the interface Bounceable is public final static int BAR
// = 42
//        BAR = 27;
//        legal for static method in interface Bounceable
        System.out.println(Bounceable.m1());
    }


    public static void main(String[] args) {
//        when invoke the static method in interface, the interface name must be included.
        System.out.println(Bounceable.m1());
        new Zap().go();
////        illegal
//        System.out.println(m1);
    }
}
