public class CardBoard {
    Short story = 200;
    CardBoard go(CardBoard cb){
        cb = null;
        return cb;
    }

    public static void main(String[] args) {
        CardBoard c1 = new CardBoard();
        CardBoard c2 = new CardBoard();
        CardBoard c3 = c1.go(c2);
        System.out.println(c1);
        c1 = null;
        // do Stuff
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
