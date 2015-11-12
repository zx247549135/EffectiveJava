package book.examples.utilityClass;

/**
 * Created by zx on 15-11-12.
 */
public class UtilityClass {

    // Suppress default constructor for noninstantiability
    private UtilityClass(){
        // it is necessary to avoid invoking this constructor
        throw new AssertionError();
    }

    public UtilityClass testInstance() {
        return new UtilityClass();
    }

}
