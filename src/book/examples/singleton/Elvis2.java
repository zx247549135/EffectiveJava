package book.examples.singleton;

/**
 * Created by zx on 15-11-11.
 */
public class Elvis2 {

    private static final Elvis2 INSTANCE = new Elvis2();
    public int state = 2;

    private Elvis2() { }

    public static Elvis2 getInstance() {
        return INSTANCE;
    }

}
