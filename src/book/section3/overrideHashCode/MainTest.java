package book.section3.overrideHashCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zx on 15-11-23.
 */
public class MainTest {

    public static void main(String[] args) {
        Map<PhoneNumber, String> m = new HashMap<PhoneNumber, String>();
        // test 1
        m.put(new PhoneNumber(707, 867, 5309), "Jenny");
        System.out.println("Get: " + m.get(new PhoneNumber(707,867,5309)));

        // test 2
        PhoneNumber pn = new PhoneNumber(708, 867, 5309);
        m.put(pn,"Lucy");
        System.out.println("Get: " + m.get(pn));
    }

}
