public class MathTest {
    static int players = 0;

    public static void main(String[] args) {
        System.out.println("players online: " + players++);
        System.out.println("the value of players is " + players);
        System.out.println(" the value of players is " + ++players);

        int x = 2;
        int y = 3;
//        if(3 == 2 | 3 < 4)
//        | operator will check all the condition
//        if((y == x++) | (x < ++y)){
//            System.out.println("x = " + x + " y = " + y);
//        }
//        if || operator get one true, it won't run the rest of the logical check.
        if(y == ++x || x < ++ y){
            System.out.println("x = " + x + " y = " + y);
        }
//        the final variable's value cannot be changed, so can't use increment or decrement for the final variable.
//        final int z = 5;
//        will throw an error , the code won't compile.
//        int k = z++;

    }
}
