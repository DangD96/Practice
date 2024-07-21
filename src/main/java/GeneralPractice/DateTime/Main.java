package GeneralPractice.DateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Main {
    public static void main(String[] args) {
        LocalDateTime myObj = LocalDateTime.now();
        Instant inst1 = myObj.toInstant(ZoneOffset.ofHours(0));
        System.out.println(inst1);

        LocalDateTime futureDateTime = LocalDateTime.parse("2024-07-20T20:30:55");
        Instant inst2 = futureDateTime.toInstant(ZoneOffset.ofHours(0));
        System.out.println(inst2);

        Duration duration = Duration.between(inst1, inst2);
        System.out.println(duration);
        System.out.println("Duration: " + duration.toMinutesPart() + " - " + duration.toSecondsPart() + " - " + duration.toNanosPart());
    }
}
