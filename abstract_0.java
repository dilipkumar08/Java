abstract class Abs {
    abstract void prnt();
}

public class Main extends Abs {
    void prnt() {
        System.out.println("Abstract Class");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.prnt(); // No issue with parentheses
    }
}
