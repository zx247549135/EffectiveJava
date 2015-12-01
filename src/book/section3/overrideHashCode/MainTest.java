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

        // test 3
        PhoneNumber pn2 = new PhoneNumber(708, 868, 3287);
        double startTime = System.currentTimeMillis();
        int compareResult = 0;
        for(int i = 0; i < 90000; i ++)
            compareResult += pn.compareTo(pn2);
        double endTime = System.currentTimeMillis();
        System.out.println("pn compare to pn2: " + compareResult + "; cost: " + (endTime - startTime));
    }

}
