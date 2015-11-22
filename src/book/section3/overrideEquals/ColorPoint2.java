package book.section3.overrideEquals;

import java.awt.*;

/**
 * Created by zx on 15-11-22.
 */
public class ColorPoint2 {

    private final Point point;
    private final Color color;

    public ColorPoint2(int x, int y, Color color) {
        if (color == null)
            throw new NullPointerException();
        point = new Point(x, y);
        this.color = color;
    }

    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint2))
            return false;
        ColorPoint2 cp = (ColorPoint2) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }

}
