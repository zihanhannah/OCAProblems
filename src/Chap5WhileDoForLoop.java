import java.util.Arrays;
import java.util.Objects;

public class Chap5WhileDoForLoop {
    public static void main(String[] args) {
////        variables in the while loop must be declared before the expression is evaluated, the value in expression
// must be boolean.
//        while(boolean a = true){
//            System.out.println("doesn't work");
//        }
////        a must be declared before the expression
//        boolean a;
//        while(a = false){
//            System.out.println("works, because a was declared before the while expression");
//        }
//        do{
//            System.out.println("works");
//        }while(false);
////      won't compile  java: incompatible types: int cannot be converted to boolean, variables in the expression must
////      be boolean
//        int a = 1;
//        do{
//            System.out.println("won't compile");
//        } while(a = 5);


////   basic for loop: for(initialization(can be several variables) ; condition(must be boolean, only one logical
// expression ; iteration){}
////        x is located in the for as local variable,in method scope, cannot be used outside of the for loop
//        for(int x = 1; x < 2; x++){
//            System.out.println(x);
//        }
//        System.out.println(x);
//        for(int x = 0, y = 3; ((((x<10) && (y-->2)) | x == 3)); x++){
//            System.out.println(x + y );
//        }
//        for(int x = 0, y = 3; (x< 2), (y < 3); x++){
//            System.out.println("java: ';' expected : won't compile, the logical expression must be ONLY one test " +
//                    "expression");
//        }


//      of forced exits include a break, a return, a System.exit(), and an exception
//        for(;;){
//            System.out.println("legal, but endless loop");
//        }

////        act like while loop
//        int i = 0;
//        for(; i < 10; ){
//            i++;
////            do something
//        }

//        for(int i = 0, j = 0; i< 10 && j < 10 ; i++, j++){
//            System.out.println("i is " + i + " j is " + j);
//        }

////      for loop: iteration part, don't need to set up as increment or anything
//        int b = 3;
//        for(int a = 1; b != 1; System.out.println("iterate") ){
//            b = b - a;
//        }
////        b's value changed
//        System.out.println(b);


////        the enhanced for loop , for-each loop: for(declaration : expression)
//        int[] a = {1,2, 3,4};
//        for(int x = 0; x < a.length; x++){
//            System.out.println(a[x]);
//        }
//        for (int n : a){
//            System.out.println(n);
//        }



//        long[] la = {7L, 8L,9L};
//        int[][] twoDee ={{1,2,3},{4,5,6},{7,8,9}};
//        String[] sNums = {"one","two","three"};
//        for(int[] dee : twoDee){
////            must use Arrays.toString to get the int[] 's value
//            System.out.println(Arrays.toString(dee));
//        }
//        for(Object o: sNums){
//            System.out.println(o);
//        }
//        for(String s: sNums){
//            System.out.println(s);
//        }


////        break and continue: break: stop the entire innermost loop and start processing the next line of the code
////        After the block;inside loop or switch statement;
////        continue: stop the current iteration of the innermost loop and the start the next iteration of the same
////        loop; inside the loop
//        for(int i = 0; i < 10; i++){
//            System.out.println("inside loop , continue " + i);
//            continue;
//        }
//        for(int i = 0; i < 10; i++){
//            continue;
////            the next line is Unreachable
////            System.out.println("inside loop , continue " + i);
//        }
//        for(int i = 0; i < 10; i++){
//            System.out.println("inside loop, break " + i);
//            break;
//        }



    }
}
