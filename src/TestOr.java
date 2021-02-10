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

        int z = 5;
//        shot-circuit once get true, will stop the rest for  || &&
        if(++z > 5 || ++z > 6) z++;
        System.out.println(z);
        z = 5;
//        non-short-circuit will run both side, no matter what the result is(true, or false) ,for | &
        if(++z > 5 | ++z > 6) z++;
        System.out.println(z);
//      ^ exclusive-OR(XOR) ,non-short0circuit operators, only one true will return true
//        both true => false
        System.out.println("XOR " + ((2<3)^ (4>3)));
//        one true one false => true
        System.out.println("XOR " + ((2<3)^ (4<3)));
//        == beats & |
        System.out.println((true & false == false | true) + " " + ((true & false) == (false | true)));
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
