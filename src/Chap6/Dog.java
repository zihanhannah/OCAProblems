package Chap6;

class Dog {
    String name;
    public Dog() {
    }
    public Dog(String name){
       this.name = name;
    }
    public static void main(String[] args) {
////      initialize elements in a loop
//        Dog[] dogs = new Dog[6];
////        length variable tells us how many elements the array holds, but it doesnot tell us whether those elements have been initialized
//        for(int i = 0; i < dogs.length; i++){
//            dogs[i] = new Dog();
//    }

//      todo declaring,constructing, and initializing the array on One line
        Dog puppy = new Dog("Frodo");
        Dog[] dogs = { puppy, new Dog("Clover"), new Dog("Aiko")};
        for(Dog d: dogs){
            System.out.println(d.name);
        }
    }
}
