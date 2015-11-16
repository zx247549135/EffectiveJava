package book.section2.elimateObsoleteReference;

/**
 * Created by zx on 15-11-14.
 */
public class MainTest {

    public static void main(String[] args){
        Stack myStack = new Stack();
        int i = 1;
        myStack.push(i);
        System.out.println("Pop from stack: " + myStack.pop());
    }

}
