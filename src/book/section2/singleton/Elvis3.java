package book.section2.singleton;

import java.io.Serializable;

/**
 * Created by zx on 15-11-11.
 */
public class Elvis3 implements Serializable {

    public static final Elvis3 INSTANCE = new Elvis3();
    public int state = 3;

    private Elvis3() { }

    private Object readResolve() {
        return INSTANCE;
    }

}
