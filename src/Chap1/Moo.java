package Chap1;
// @todo two different access issues:

class Moo extends Zoo{
    public void useMyCoolMethod(){
//  @todo 1. whether a subclass can inherit a member of its superclass
        System.out.println("Moo says, " + this.coolMethod());
//  @todo 2. whether method code in one class can access a member of another class
        Zoo z = new Zoo();
        System.out.println("Zoo says " + z.coolMethod());
    }

    public static void main(String[] args) {
        new Moo().useMyCoolMethod();
    }

}