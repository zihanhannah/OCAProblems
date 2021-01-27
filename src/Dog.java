public class Dog {
    String name;
    Dog(String s){
        name = s;
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Boi");
        Dog d2 = new Dog("Tyri");
        System.out.println((d1 == d2) + " 1");
        Dog d3 = new Dog("Boi");
        d2 = d1;
        System.out.println( (d1 == d2) + " 2");
        System.out.println((d1 == d3) + " 3");
    }
}
