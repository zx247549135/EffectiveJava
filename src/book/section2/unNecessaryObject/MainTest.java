package book.section2.unNecessaryObject;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by zx on 15-11-14.
 */
public class MainTest {

    public static void main(String[] args) {
        double starTime = System.currentTimeMillis();
        Calendar birthCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        int babyBoomers1 = 0;
        for ( int i = 1; i < 30 ; i ++) {
            birthCalendar1.set(1949 + i, Calendar.FEBRUARY, i, 0, 0);
            Date birthDate1 = birthCalendar1.getTime();
            Person person1 = new Person(birthDate1);
            boolean isBabyBoomer = person1.isBabyBoomer();
            if(isBabyBoomer)
                babyBoomers1 ++;
        }
        double endTime = System.currentTimeMillis();
        System.out.println("How many babies in boomer? " + babyBoomers1);
        System.out.println("This selection cost: " + (endTime-starTime)/1000 + "s");

        double starTime2 = System.currentTimeMillis();
        Calendar birthCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        int babyBoomers2 = 0;
        for ( int i = 1; i < 30 ; i ++) {
            birthCalendar2.set(1949 + i, Calendar.FEBRUARY, i, 0, 0);
            Date birthDate2 = birthCalendar2.getTime();
            Person person2 = new Person(birthDate2);
            boolean isBabyBoomer = person2.isBabyBoomer2();
            if(isBabyBoomer)
                babyBoomers2 ++;
        }
        double endTime2 = System.currentTimeMillis();
        System.out.println("How many babies in boomer? " + babyBoomers2);
        System.out.println("This selection cost: " + (endTime2-starTime2)/1000 + "s");
    }

}
