public class Chap5IfSwitch {
    public static void main(String[] args) {
//        @todo if statement
//        int y = 5;
//        int x = 2;
//        if(((x > 3) && (y < 2) )| true){
//            System.out.println(true);
//        }
////        check x++ > 3 first, if get false, it won't check the condition after &&, so y's value stays the same in
////        this case
//        if((x++ > 3) && (++y < 2) | true){
//            System.out.println(true);
//        }
//        System.out.println(y);
//        System.out.println(x);


//        boolean boo = false;
////        if() the parentheses only take boolean value!! assign boo as true, if(true) => run the code inside the if
////        statement
//        if(boo = true){
//            System.out.println(true);
//
//        }
//        System.out.println(boo);
////        if() the parentheses can't take any value which is not boolean. code won't compile
////        java: incompatible types: int cannot be converted to boolean
//        int y = 0;
//        if(y = 1){
//            System.out.println(true);
//        }


//       @todo switch statement: the case constant must be a COMPILE-TIME CONSTANT.
//        final int a = 1;
//        final int b;
//        b=2;
//        int c = 5;
//        final long d = 15;
//        int x = 0;
//        switch(x){
//            case a:
//                System.out.println(true);
//                break;
////      b is constant, but not set as compile-time constant
////      java: constant expression required
//            case b:
//                System.out.println(false);
////      c is not set as constant
////      ava: constant expression required
//            case c:
//                System.out.println(false);
////            in switch , only have the case variable set as char, byte, short, int, String, enum; long, float,
////            double won't be able to compile
////            java: incompatible types: possible lossy conversion from long to int
//            case d:
//                System.out.println(false);
//        }


//        byte g = 2;
//        switch(g){
//            case 23:
////                128 is too large for a byte
////                won't compile
////                java: incompatible types: possible lossy conversion from int to byte
//            case 128:
//        }


////        it's illegal to have more than one case label using the SAME value
////        java: duplicate case label
//        int temp = 90;
//        switch(temp){
//            case 90:
//            case 80:
//            case 80:
//            case 70:
//        }


////        it is leagal to leverage the power of boxing in switch expression
//        switch(new Integer(4)){
//            case 4:
//                System.out.println("boxing is ok");
//        }


//        switch(new String("hello")){
//            case "hello":
//                System.out.println("boxing is ok");
//                break;
//            case "Hello":
//                System.out.println("case sensitive");
//            case " hello":
//                System.out.println("string must be the same");
//            default:
//                System.out.println(false);
//        }



////           generate random number:Math.random() * (max - min + 1) + min
//        int x = (int) (Math.random() * 10 + 1);
//        switch(x){
//            case 2:
//            case 4:
//            case 6:
//            case 8:
//            case 10:
//                System.out.println(x + " is a even number");
//                break;
//            default:
//                System.out.println(x + " is a odd number");
//        }


////        in switch , default doesn't need to place at the end. it can be placed in everywhere , like the case
//        int x = 7;
//        switch(x){
//            case 2:
//                System.out.println("2");
//            default:
//                System.out.println("7");
//            case 3:
//                System.out.println("3");
//            case 4:
//                System.out.println("4");
//        }




    }
}
