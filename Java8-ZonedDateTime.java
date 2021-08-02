import java.time.*;
public class Main {

    public static void main(String args[]){
        ZonedDateTime zone = ZonedDateTime.now();
        System.out.println(zone);

        System.out.println(zone.getOffset());
        System.out.println(zone.getDayOfMonth());
        System.out.println(zone.getDayOfWeek());
        System.out.println(zone.getDayOfYear());
        System.out.println(zone.minusDays(100));
        System.out.println(zone.plusDays(100));

        ZoneId zoneid = ZoneId.systemDefault();
        System.out.println(zoneid);

        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(la);
        System.out.println(zonedDateTime);
        
    }
}