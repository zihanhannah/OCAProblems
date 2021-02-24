package Chap1;
//@todo enum constructor : is invoked automatically, with the arguments you define after the constant value.
enum CoffeeSize1 {

    BIG(8), HUGE(10), OVERWHELMING(16);

    CoffeeSize1(int ounces) {
        this.ounces = ounces;
    }

    private int ounces;

    public int getOunces() {
        return ounces;
    }
}
 public class Coffee3{
        CoffeeSize1 size;

     public static void main(String[] args) {
         Coffee3 drink1 = new Coffee3();
         drink1.size = CoffeeSize1.BIG;
         System.out.println(drink1.size.getOunces());
         for(CoffeeSize1 cs: CoffeeSize1.values()){
             System.out.println(cs);
             System.out.println(cs.getOunces());
         }
     }
 }


