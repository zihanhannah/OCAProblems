package Chap2;
//inheritance means reuse the code, and do the polymorphism
//polymorphism : many forms
interface Animatable{
//    the method in interface set as public implicit
    void animate();
}
class GameShape{
    public void displayShape(){
        System.out.println("displaying shape");
    }
}
class PlayerPiece extends GameShape implements Animatable{
    public void movePiece(){
        System.out.println("Moving game piece");
    }
   public void animate(){
        System.out.println("animating...");
    }
}
class TilePiece extends GameShape{
    public void getAdjacent(){
        System.out.println("getting adjacent tiles");
    }
}
class TestShape {
    public static void main(String[] args) {
//@todo  all cases about PlayerPiece with polymorphism(left is the reference variables, right is the object)
//  compile time will check the reference variable(left of the =)IS-A relationship, JVM runtime will check the object
//  type(ont he right
//  of the =)and will invoke the object's actual class
        PlayerPiece shape = new PlayerPiece();
        Object o = shape;
        GameShape shape2 = shape;
        Animatable mover = shape;


        shape.movePiece();
        shape.displayShape();
        PlayerPiece player = new PlayerPiece();
        TilePiece tile = new TilePiece();

        doShapes(player);
        doShapes(tile);
    }
    public static void doShapes(GameShape shape){
        shape.displayShape();
    }
}
