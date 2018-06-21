package lab1_1;

import java.util.Calendar;

/**
 * Created by Елизавета on 07.05.2018.
 */
public class Null
{
   public static void OBNULENIE (Calendar cal) {
       while (cal.get(Calendar.MINUTE) != 00) {
           cal.add(Calendar.MINUTE, -1);
       }
       while (cal.get(Calendar.HOUR_OF_DAY) != 00) {
           cal.add(Calendar.HOUR_OF_DAY, -1);
       }
       while (cal.get(Calendar.SECOND) != 00) {
           cal.add(Calendar.SECOND, -1);
       }
   }
}
