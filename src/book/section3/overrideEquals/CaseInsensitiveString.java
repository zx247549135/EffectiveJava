package book.section3.overrideEquals;

/**
 * Created by zx on 15-11-22.
 */
public class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s) {
        if (s == null)
            throw new NullPointerException();
        this.s = s;
    }

    /**
    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        if (o instanceof String)
            return s.equalsIgnoreCase((String) o);
        return false;
    }
     */

    @Override
    public boolean equals(Object o) {
       return o instanceof CaseInsensitiveString && (((CaseInsensitiveString) o).s.equalsIgnoreCase(s));
    }

}
