package lab1_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Елизавета on 07.05.2018.
 */

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String string = sc.nextLine();
        check(string);
    }

    private static void check(String string) {
        String temp;
        Pattern date = Pattern.compile("[\\d]{2}.[\\d]{2}.[\\d]{4}");
        Pattern dateTime = Pattern.compile("[\\d]{2}.[\\d]{2}.[\\d]{4}T[\\d]{2}:[\\d]{2}");
        Pattern email = Pattern.compile("^([A-Za-z0-9_-]+\\.)*[A-Za-z0-9_-]+@[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*\\.[A-Za-z]{2,}$");

        Matcher dateM = date.matcher(string);

        Matcher dateTimeM = dateTime.matcher(string);

        Matcher emailM = email.matcher(string);

        if (dateTimeM.find()) {
            temp = dateTimeM.replaceFirst("");
            if (temp.length() != 0) {
                System.out.println("String: " + string + " no date and time");

            } else
                System.out.println("String: " + string + " date and time");
        }

        else if (dateM.find()) {
            temp = dateM.replaceFirst("");
            if (temp.length() != 0) {
                System.out.println("String: " + string + " no date");
            } else
                System.out.println("String: " + string + " date");
        } else if (emailM.find()) {
            temp = emailM.replaceFirst("");
            if (temp.length() != 0) {
                System.out.println("String: " + string + " no email");
            } else
                System.out.println("String: " + string + " email");
        } else
        {
            System.out.println("This string can not be matching with any RV in this task");
        }

    }

}
