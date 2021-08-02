import java.time.*;
import java.time.temporal.*;
public class Main {

    public static void main(String args[]){
        Duration d = Duration.between(LocalTime.NOON,LocalTime.MAX);
        System.out.println(d.get(ChronoUnit.SECONDS));

        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.NOON);
    }
}

