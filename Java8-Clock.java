import java.time.*;
public class Main {

    public static void main(String args[]){
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);

        Clock clockUTC = Clock.systemUTC();
        System.out.println(clockUTC);

        System.out.println(clockUTC.instant());

        Instant instant = clock.instant();
        System.out.println(instant);

        System.out.println(clock.getZone());

    }
}
