package book.section2.singleton;

/**
 * Created by zx on 15-11-11.
 */
public class Elvis1 {

    public static final Elvis1 INSTANCE = new Elvis1();
    public int state = 1;

    private Elvis1() { }

    public void setState(int val) {
        state = val;
    }

}
