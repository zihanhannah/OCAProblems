//import java.util.ArrayList;
//import java.util.TreeSet;
import java.util.*;
//can't use import java.*
//@todo must be "import static" cannot be "static import"
import static java.lang.Integer.*;
//import static java.lang.System.out;
import static java.lang.System.*;
//doesn't work for import static java.lang.*;
public class Chap1 {
//    main()method can be writen like those: @todo "public static" can be "static public"
//    public static void main(String... args){
//    static public void main(String args[]){
//    public static void main(String... anyName){
   public static void main(String[] args) {


////        two ways to do it
//        ArrayList<String> a1 = new ArrayList<String>();
//        java.util.ArrayList<String> a = new java.util.ArrayList<>();
//        TreeSet<String> t = new TreeSet<>();

////     import static java.lang.Integer.*; the way to import static for System.out.println()
////        MAX_VALUE is the short term for Integer.MAX_VALUE
        out.println(toHexString(42));
        out.println(MAX_VALUE);
////        if there is no import static java.lang.Integer.*; import static java.lang.System.out;
////        you need to type out all the information
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.toHexString(42));


    }
}
