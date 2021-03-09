package Chap2;
class Animal {
     void eat() throws Exception{
        System.out.println("generic animal eating generically");
    }

}

 class Horse extends Animal{
//     @todo method override,depends on the object type, not the reference. runtime, unchecked exception
//         the overriding method CANNOT have a more RESTRICTIVE access modifier than the method being overriden

//     void eat(){
//         System.out.println("Horse eating hay, oats, and horse treats");
//     }

     public void eat(){
         System.out.println("Horse eating hay, oats, and horse treats");
     }
    public void doStuff(Animal a){
        System.out.println("in animal version");
    }
    public void doStuff(Horse h){
        System.out.println("in horse version");
    }
     public void buck(){}

     public static void main(String[] args) throws Exception {
         Animal animal = new Animal();
//         Animal ref, but a Horse object
         Animal horse = new Horse();
         Horse us = new Horse();
         animal.eat();

         horse.eat();
////      @todo reference type = instance type
////class Animal doesn't have buck();
////         compile error: cannot find symbol
//         horse.buck();
//         @todo method overload depends on the reference type, not the object type, checked ,compiled exception
         us.doStuff(animal);
         us.doStuff(horse);
         us.doStuff(us);

//         Animal us1 = new Animal();
////java: cannot find symbol
////  symbol:   method doStuff(Chap2.Animal)
//         us1.doStuff(horse);

     }
}
