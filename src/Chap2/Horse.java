package Chap2;
class Animal {
    public void eat(){
        System.out.println("generic animal eating generically");
    }

}

 class Horse extends Animal{
//     @todo method override
//         the overriding method CANNOT have a more RESTRICTIVE access modifier than the method being overriden

//     void eat(){
//         System.out.println("Horse eating hay, oats, and horse treats");
//     }

     public void eat(){
         System.out.println("Horse eating hay, oats, and horse treats");
     }


     public void buck(){}

     public static void main(String[] args) {
         Animal animal = new Animal();
//         Animal ref, but a Horse object
         Animal horse = new Horse();
         animal.eat();

         horse.eat();
////      @todo reference type = instance type
////class Animal doesn't have buck();
////         compile error: cannot find symbol
//         horse.buck();

     }
}
