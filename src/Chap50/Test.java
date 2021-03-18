package Chap50;

 class Test {
     static String s;
     static void go(){
         go();
     }

     public static void main(String[] args) {
////  todo  JVM-THROW EXCEPTION: 1. Exception in thread "main" java.lang.NullPointerException
////          runtime exception, unchecked exception
////    when u attempt to access an object using a reference variable with a current value of null

//         System.out.println(s.length());


//     todo  2. StackOverflowError.
//         Exception in thread "main" java.lang.StackOverflowError
         go();
     }
}
