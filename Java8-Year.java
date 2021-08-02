import java.time.*;
public class Main {

    public static void main(String args[]){
        Year year = Year.now();
        System.out.println(year);

        Year year1 = Year.of(2012);
        LocalDate date = year1.atDay(200);
        System.out.println(date);

        System.out.println(year1.length());

        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth);
        
        
    }
}
