public class EnumEqual {
    enum Color{ RED, BLUE}
//    ; for enum is optional
//    enum is not expendable

    public static void main(String[] args) {
        Color c1 = Color.RED;
        Color c2 = Color.RED;
//        using == or equals to compare two enum reference variables to see if they are equal
        if(c1 == c2){
            System.out.println("==");
        }
        if(c1.equals(c2)){
            System.out.println("dot equals");
        }
    }
}
