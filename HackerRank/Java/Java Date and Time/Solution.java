
import java.time.LocalDate;


class Result {

    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }

}

//https://www.hackerrank.com/challenges/java-date-and-time/problem