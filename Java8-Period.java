import java.time.*;
import java.time.temporal.*;
public class Main {

    public static void main(String args[]){
        Period period = Period.ofDays(24);
        Temporal temp = period.addTo(LocalDate.now());
        System.out.println(temp);

        Period period1 = Period.of(2017,02,16);
        System.out.println(period1.toString());

        LocalDate birthday = LocalDate.of(1999,9,25);
        LocalDate today = LocalDate.now();
        Period period2 = Period.between(birthday,today);
        System.out.println(period2);

        System.out.println(period2.getYears() + " years " + period2.getMonths() +" months " + period2.getDays()+ " days.");
    }
}
