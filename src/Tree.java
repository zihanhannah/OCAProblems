interface Vessel{ }
interface Toy{}
class Boat implements Vessel{}
class Speedboat extends Boat implements Toy{}
public class Tree {
    public static void main(String[] args) {
//        pay attention to b2
        String s = "0";
        Boat b = new Boat();
        Boat b2 = new Speedboat();
        Speedboat s2 = new Speedboat();
        if((b instanceof Vessel) && (b2 instanceof Toy)){
            s+= "1";
        }
        if((s2 instanceof Vessel) && (s2 instanceof Toy)){
            s+= "2";
        }
        System.out.println(s);
        System.out.println(b instanceof Toy);
    }
}
