package book.section2.finalizeFunction;

/**
 * Created by zx on 15-11-16.
 */
public class MainTest {

    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();

        new Book(true);
        System.gc();
    }

}
