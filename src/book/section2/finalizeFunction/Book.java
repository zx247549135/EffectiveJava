package book.section2.finalizeFunction;

/**
 * Created by zx on 15-11-16.
 */
public class Book {

    boolean checkOut = false;

    public Book(boolean val) {
        checkOut =  val;
    }

    public void checkIn() {
        checkOut = false;
    }

    public void finalize() {
        if(checkOut){
            System.out.println("Error: Check out");
        }
    }

}
