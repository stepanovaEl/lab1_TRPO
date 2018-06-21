package lab1_1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.Scanner;

/**
 * Created by Елизавета on 07.05.2018.
 */
public class Main

{
    public static void main(String[] args) throws ParseException {
        DateFormat date = new SimpleDateFormat("YYYY-MM-DD'T'HH:mm:ss'Z'");
        System.out.println("Enter ISO date");
        //Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();
        String s = "2018-01-12T12:12:43Z";
        Date result = date.parse(s);
        System.out.println(result);
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(result);
        cal1.add(Calendar.DATE, 1);
        Null.OBNULENIE(cal1);
        System.out.println("Next day ");
        System.out.println(cal1.getTime());
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(result);
        cal2.add(Calendar.MONTH, 1);
        Null.OBNULENIE(cal2);
        System.out.println("Next month ");
        System.out.println(cal2.getTime());
        Calendar cal3 = Calendar.getInstance();
        cal3.setTime(result);
        Null.OBNULENIE(cal3);
        while (cal3.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY)
        {
            cal3.add(Calendar.DATE, -1);
        }
        System.out.println("Beginning of the week");
        System.out.println(cal3.getTime());
        while (cal3.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY)
        {
            cal3.add(Calendar.DATE, 1);
        }
        System.out.println("End of the week");
        System.out.println(cal3.getTime());

    }
}