package JAVA8.DateAndTime;

import java.time.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        int day = localDate.getDayOfMonth();
        int month = localDate.getMonthValue();
        int year = localDate.getYear();
        System.out.println(day+"/"+month+"/"+year);

        LocalTime localTime = LocalTime.now();
     int hour = localTime.getHour();
     int minute = localTime.getMinute();
     int second = localTime.getSecond();
     System.out.println(hour+":"+minute+":"+second);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

//        zonetime
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);


    }
}
