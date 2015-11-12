package book.examples.utilityClass;

/**
 * Created by zx on 15-11-12.
 */
public class MainTest {

    public static void main(String[] args){
        // UtilityClass utilityClass = UtilityClass.testInstance();
        // can't get instance from static context

        UtilityExtendClass utilityExtendClass = new UtilityExtendClass();
        utilityExtendClass.printMessage();
    }

}
