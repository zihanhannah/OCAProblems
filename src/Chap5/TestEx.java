package Chap5;

 class TestEx {
//    todo  Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Chap5.TestEx.doMoreStuff(TestEx.java:11)
//	at Chap5.TestEx.doStuff(TestEx.java:8)
//	at Chap5.TestEx.main(TestEx.java:5)
     public static void main(String[] args) {
         doStuff();
     }
     static void doStuff(){
         doMoreStuff();
     }
     static void doMoreStuff(){
         int x = 5/ 0;
     }
}
