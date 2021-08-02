import java.time.*;
public class Main {

    public static void main(String args[]){

        LocalDate date = LocalDate.now();
        System.out.println("Today :"+date);
        LocalDate yesterday = date.minusDays(1);
        System.out.println("Yesterday :"+yesterday);
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("Tomorrow :"+tomorrow);

        //Leap year
        LocalDate date1 = LocalDate.of(2019,Month.FEBRUARY,12);
        LocalDate date2 = LocalDate.of(2012,8,21);

        if(date1.isLeapYear()) System.out.println(date1+" is a Leap year");
        else System.out.println(date1+" is not a Leap year");

        if(date2.isLeapYear()) System.out.println(date2+" is a Leap year");
        else System.out.println(date2+" is not a Leap year");

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime time1 = LocalTime.of(12,45);
        System.out.println(time1);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        int dd = dateTime.getDayOfMonth();
        int mm = dateTime.getMonthValue();
        int yyyy = dateTime.getYear();

        int h = dateTime.getHour();
        int m = dateTime.getMinute();
        int s = dateTime.getSecond();
        int n = dateTime.getNano();

        System.out.printf("%d-%d-%d %d:%d:%d.%d",dd,mm,yyyy,h,m,s,n);
        System.out.println();

        LocalDateTime dateTime1 = LocalDateTime.of(date,time);
        System.out.println(dateTime1);

    }
}
