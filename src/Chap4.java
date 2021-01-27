public class Chap4 {
    public static void main(String[] args) {
//problem 1
//        int i = 42;
//        String s = (i < 40) ? "life" : ( i > 50) ? "universe" : "everything";
//        System.out.println(s);


//problem 3
//        an exception was thrown when run java  /Users/hannah/IdeaProjects/COAProblems/src/Chap4.java live2
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1 at
//        Chap4.main(Chap4.java:10)
//    if(args.length == 1 | args[1].equals("test")){
//    System.out.println("test case");
//    } else {
//        System.out.println("production " + args[0]);
//    }


//problem 4
//        long x = 42L;
//        long y = 44L;
//        System.out.println("" + 7 + 2 + "");
//        System.out.println(foo() + x + 5 + "");
//        System.out.println(x + y + foo());


//problem 6
//        int x = 12;
//        int a = 5;
//        int b = 7;
//        System.out.println(x/a + " " + x/b);


//problem 7
//        in enum, if the value is the same, they are equal
//        Days d1 = Days.TH;
//        Days d2 = Days.M;
//        for(Days d: Days.values()){
//            if(d.equals(Days.F)) break;
//            d2 = d;
//        }
//        System.out.println((d1 == d2) ? "same old" : "newly new") ;


//problem 8
//        String s = "";
//        boolean b1 = true;
//        boolean b2 = false;
//        int b3 = 1;
//        if((b2 = false) | (21 % 5) > 2)  s+= "x";
//        if( b1 || (b2 = true)) s+= "y";
//        if(b2 == true) s+= "z";
////        the things in parentheses of if() must be a boolean value. if(b2 = true) works makes b2 = true, and
// then return true
// , if(b3=
// 5) won't
// work=>java: incompatible types: int cannot be converted to boolean
////        if(b3= 5) s ="n";
//        System.out.println(s);
//        System.out.println(b2);


//problem 9
//        int mask = 0;
//        int count = 0;
////        || will only run the first one if it gets true at the first check. | will check both side no matter what
////        they get =>  mask = 2
//        if( ((5 < 7) || (++count < 10)) | mask++ < 10 ) mask = mask + 1;
////        ^ if only one true, will return true : (6 > 8) ^ false => false
//        if( (6 > 8) ^ false) mask = mask + 10;
////        !(mask > 1)=> false, won't check the second condition => count = 0
//        if( !(mask > 1) && ++count > 1){
//            System.out.println( mask + " " + count);
//        }
//        System.out.println( "mask: " + mask + " count: " + count);


//problem 10
        boolean b1 = false;
        boolean b2;
        int x = 2, y = 5;
        b1 = 2 - 12/4 > 5 + -7 && b1 != y++>5 == 7%4 > ++x | b1 == true;
//        1.unary operator: ++ -- ! + -
//        1=> 2 - 12/4 > 5 + (-7) && false != 5 > 5(then y++ => y=6) == 7%4 > 3(x+1 first=> x = 3) | false == true;
//        2.* / %
//        2=> 2 - 3 > 5 + (-7) && false != 5 > 5 == 3 > 3 | false == true;
//        3. + - (plus minus)
//        3=> -1 > -3 && false != 5 > 5 == 3 > 3 | false == true;
//        4. < > <= >=
//        4=> true && false != false == false | false == true;
//        5. == !=
//        5=> true && false == false  | false ;
//        5=> true && true | false;
//        6. & |
//        6=> true && true;
//        7. && ||
//        7: true;
//        8. = += -=
        b2= (2 - 12/4 > 5+ -7) && (b1 != y++ > 5) == (7%4 > ++x) | (b1 == true);
//        1. unary operator: + - ++ --
//        1=> (2 - 12/4 > 5 + (-7)) && (true != 6 > 5) == ( 7%4 > 4) | (true == true);
//        y = 7, x = 4
//        2. * % /
//        2=> (2- 3 > 5 + (-7)) && (true != 6 > 5 ) == ( 3 > 4 ) | (true == true);
//        3. + -
//        3=> (-1 > -3) && (true != 6 > 5 ) == (3 > 4) | (true == true);
//        4. > < <= >=
//        4=> true && (true != true ) == false | (true == true);
//        5: == !=
//        5=> true && false == false | true;
//         => true && true | true;
//        6. & |
//        6=> true && true;
//        7. && ||
//        7=> true
//        8. = += -+
//        b2 = true;

        System.out.println(b1);
        System.out.println(b2);

        
    }
    static String foo() {
        return "foo";
    }
    enum Days{ M, T, W, TH, F, SA, SU};
}
