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
    }
}
