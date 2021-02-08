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


    }
}
