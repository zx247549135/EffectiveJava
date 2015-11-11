package book.examples.singleton;

/**
 * Created by zx on 15-11-11.
 */
public class MainTest {

    public static void main(String[] args) {
        Elvis1 elvis1 = Elvis1.INSTANCE;
        System.out.println("elvis1: " + elvis1.state);

        elvis1.setState(2);
        Elvis1 elvis11 = Elvis1.INSTANCE;
        Elvis2 elvis2 = Elvis2.getInstance();
        Elvis3 elvis3 = Elvis3.INSTANCE;

        System.out.println("elvis11: " + elvis11.state);
        System.out.println("elvis2: " + elvis2.state);
        System.out.println("elvis3: " + elvis3.state);
    }

}
