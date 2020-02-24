package test;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    @Test
    public void test1(){
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String datee=df.format(date);
        System.out.println(datee);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(calendar.MONTH,2);
        date=calendar.getTime();
        String datee2=df.format(date);
        System.out.println(datee2);
    }
}
