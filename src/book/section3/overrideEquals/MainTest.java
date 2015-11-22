package book.section3.overrideEquals;

import java.awt.*;

/**
 * Created by zx on 15-11-22.
 */
public class MainTest {

    public static void main(String[] args) {
        CaseInsensitiveString testString = new CaseInsensitiveString("Flint");
        String s = "flint";
        System.out.println("CaseInsensitiveString.equals(String) : " + testString.equals(s));
        System.out.println("String.equals(CaseInsensitiveString) : " + s.equals(testString));

        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);

        ColorPoint cp1 = new ColorPoint(1, 2, Color.RED);
        ColorPoint cp2 = new ColorPoint(1, 2, Color.BLUE);

        System.out.println("ColorPoint.equals(Point) : " + cp.equals(p));
        System.out.println("Point.equals(ColorPoint) : " + p.equals(cp));

        System.out.println("ColorPoint.equals(ColorPoint) : " + cp1.equals(p));
        System.out.println("ColorPoint.equals(ColorPoint) : " + p.equals(cp2));
        System.out.println("ColorPoint.equals(ColorPoint) : " + cp1.equals(cp2));

        ColorPoint2 cp21 = new ColorPoint2(1, 2, Color.RED);
        ColorPoint2 cp22 = new ColorPoint2(1, 2, Color.BLUE);
        System.out.println("ColorPoint2.equals(Point) : " + cp21.equals(p));
        System.out.println("Point.equals(ColorPoint2) : " + p.equals(cp22));
        System.out.println("ColorPoint2.equals(ColorPoint2) : " + cp21.equals(cp22));

    }
}
