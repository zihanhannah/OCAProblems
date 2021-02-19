//import java.util.ArrayList;
//import java.util.TreeSet;
import java.util.*;
//can't use import java.*
//@todo must be "import static" cannot be "static import"
import static java.lang.Integer.*;
//import static java.lang.System.out;
import static java.lang.System.*;
//doesn't work for import static java.lang.*;

//@todo class can ONLY be public or default, （default for class only used in SAME package) the method, variables can be
// any four
// of the modifiers
//public class can be accessed by any classes, but in different package , you need to import it. in the same file,
// only one public class, and it must be the same name as the file's name
//default class can be accessed by the SAME package
public class Chap1 {
////    @todo Var-args : only one var-args, and must be the last
////    legal
//    void doStuff(int... x){}
//    void doStuff2(char c, int... x){}
//    void doStuff3(int[]... animal){ }

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

