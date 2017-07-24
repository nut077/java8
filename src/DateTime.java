import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current Date time : " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("Date1 : " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int hour = currentTime.getHour();
        int minite = currentTime.getMinute();
        int seconds = currentTime.getSecond();
        int year = currentTime.getYear();

        System.out.println(day + " " + month + " " + year + " / " + hour + ":" + minite + ":" + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);

        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);

        ZonedDateTime dateTime1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        System.out.println("date time1: " + dateTime1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);

        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        LocalDate nextDay = today.plus(500, ChronoUnit.DAYS);

        // add 1 week to the current date
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week: " + nextWeek);

        // add 1 month to the current date
        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + nextMonth);

        // add 2 year to the current date
        LocalDate nextTwoYear = today.plus(2, ChronoUnit.YEARS);
        System.out.println("Next two year: " + nextTwoYear);

        // date between day
        Period period = Period.between(today, nextDay);
        System.out.println("Period: " + period.getDays());

        // next Tuesday
        LocalDate nextTuesday = today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next Tuesday: " + nextTuesday);

        // get the second saturday of next month
        LocalDate firstInYear = LocalDate.of(today.getYear(), nextMonth.getMonth(), 1);
        LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second Saturday on: " + secondSaturday);

        // get the current date
        Date currentDate = new Date();
        System.out.println("Current date: " + currentDate);

        // get the instant of current date in terms of milliseconds
        Instant now = currentDate.toInstant();
        ZoneId currentZone1 = ZoneId.systemDefault();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone1);
        System.out.println("Local date: " + localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone1);
        System.out.println("Zoned date: " + zonedDateTime);

    }
}
