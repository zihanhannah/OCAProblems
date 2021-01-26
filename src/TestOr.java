public class TestOr {
    public static void main(String[] args) {
//        || once has true, will return true, and stop run the rest of the conditional check in the or
        if((isItSmall(3)) || isItSmall(7)){
            System.out.println(true);
        }
        if(isItSmall(9) || isItSmall(3)){
            System.out.println(true);
        }
        if( isItSmall(9) || isItSmall(7)) {
            System.out.println(true);
        }
//        compile error, && , || only work with boolean operands
//        if( 5 && 6){
//            System.out.println("this won't work");
//        }
    }
    public static boolean isItSmall(int i){
        if(i < 5){
            System.out.println( " i < 5");
            return true;
        } else {
            System.out.println(" i >= 5");
            return false;
        }
    }
}
