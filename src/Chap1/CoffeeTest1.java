package Chap1;

import java.util.Arrays;

//@todo enums:
//outside the class: declare as their own class ; can only be marked as public or default
//inside the class
//never in the method
//it's not the Strings or ints
//every value in enums is an instance of that, they are static and final(constant)
enum CoffeeSize{BIG, HUGE, OVERWHELMING}
class Coffee{
    CoffeeSize size;
}
public class CoffeeTest1 {
    public static void main(String[] args) {
// illegal : cannot declare in a method
// enum coffeeSize {BIG, HUGE, OVERWHELMING}
        Coffee drink = new Coffee();
        drink.size = CoffeeSize.BIG;
        System.out.println(drink.size);
        System.out.println(Arrays.toString(CoffeeSize.values()));
    }
}
