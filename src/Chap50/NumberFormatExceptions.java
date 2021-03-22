package Chap50;

class NumberFormatExceptions {
    public static boolean isInteger(String s){
       try{
           Integer.parseInt(s);
           return true;
       }
       catch(Exception e){
           return false;
       }
    }
     static int parseInt(String s) throws NumberFormatException{
        boolean parseSuccess = isInteger(s);
        int result = 0;
        if(!parseSuccess){
            throw new NumberFormatException();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(parseInt("1s"));

    }

//  todo  Exception in thread "main" java.lang.NumberFormatException
//    at Chap50.NumberFormatExceptions.parseInt(NumberFormatExceptions.java:17)
//    at Chap50.NumberFormatExceptions.main(NumberFormatExceptions.java:23)
}
