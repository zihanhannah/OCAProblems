package Chap6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

class Test {
    public static void main(String[] args) {
//        String s = "abcde";
//        String s2 = s;
//        s = s.concat("more stuff");
//        System.out.println(s);
//        System.out.println(s2);
//
//        String x = "Java";
////        x won't change: creating a String without assigning a reference to it
//        x.concat("Rules!");
//        System.out.println("x=" + x);
//        x.toUpperCase();
//        System.out.println("x=" + x);
//        x.replace("a","x");
//        System.out.println("x=" + x);
////        todo will replace all the "a" to "x"
//        x = x.replace("a","x");
//        System.out.println("x=" + x);

//        String s1 = "spring ";
//        String s2 = s1 + "summer ";
//        s1.concat("fall");
//        s2.concat("s1");
//        s1 += "winter ";
//        System.out.println((s1 + " " + s2));

////        todo s and s1 are two objects, s and s2 point to the same object
//        String s = "abcd";
//        String s1 = new String("abcd");
//        String s2 = "abcd";
//
//        if(s == s1){
//            System.out.println("==");
//        } else if( s.equals(s1)){
//            System.out.println("equal");
//        }
//
//        if(s == s2){
//            System.out.println("==");
//        }
//
////        todo s.charAt(int index) => printout the element at certain index
//        System.out.println(s.charAt(1));
//        System.out.println(s.length());
//        System.out.println(s.substring(0,1));

////          todo StringBuilder: mutable
//        StringBuilder sb = new StringBuilder("abc");
//        sb.append("def");
//        System.out.println("sb = " +sb);
////       todo:  sb= "abcdefgh" =>reverse =>"hgfedcba" => insert => hgf---edcba
//        sb.append("gh").reverse().insert(3,"---");
//        System.out.println(sb);

////        todo create the StringBuiler
//        StringBuilder s = new StringBuilder();
//        StringBuilder s1 = new StringBuilder("abc");
//        StringBuilder s2 = new StringBuilder(3);

//        StringBuilder sb = new StringBuilder("set= ");
//        sb.append(3.1);
//        System.out.println(sb);
//
////        todo delete(int start, int end)
//        sb.delete(0,3);
//        System.out.println(sb);
////        todo insert
//        sb.insert(2,"--");
//        System.out.println(sb);
////        todo reverse
//        sb.reverse();
//        System.out.println(sb);
//        System.out.println(sb.toString());

////        todo LocalDate, Period..... are immutable.
////        todo factory class: not using "new" keyword to create the new instance, but using public static method to create new instances of the class
//        LocalDate date1 = LocalDate.of(2017,1,31);
//        Period period1 = Period.ofMonths(1);
//        date1.plus(period1);
//        System.out.println(date1);
//        LocalDate date2 = date1.plus(period1);
//        System.out.println(date2);

////   todo     Error:(91, 28) java: constructor LocalDateTime in class java.time.LocalDateTime cannot be applied to given types;
////  required: java.time.LocalDate,java.time.LocalTime
////  found: no arguments
////  reason: actual and formal argument lists differ in length
//        LocalDateTime d1 = new LocalDateTime();



    }
}
