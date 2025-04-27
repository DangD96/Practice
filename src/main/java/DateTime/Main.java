package DateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Main {
    public static void main(String[] args) {
        LocalDateTime myObj = LocalDateTime.now();
        Instant inst1 = myObj.toInstant(ZoneOffset.ofHours(0));
        System.out.println(inst1);

        LocalDateTime futureDateTime = LocalDateTime.parse("2024-07-20T21:00:55");
        Instant inst2 = futureDateTime.toInstant(ZoneOffset.ofHours(0));
        System.out.println(inst2);

        Duration duration = Duration.between(inst1, inst2);
        System.out.println(duration);
        System.out.println("Duration: " + duration.toMinutesPart() + " - " + duration.toSecondsPart() + " - " + duration.toNanosPart());

        System.out.println(Math.round(1.5));
        System.out.println(Math.round(2.3));
        System.out.println(Math.round(0.2));

        int minutes = duration.toMinutesPart();
        double minutesFraction = (double) duration.toSecondsPart() / 60;
        String runTimeStr = String.valueOf(minutes + minutesFraction);
        int runTimeDouble = (int) Math.round(Double.parseDouble(runTimeStr));
        System.out.println(runTimeDouble);


        if (runTimeDouble < 1) {
            System.out.println("1");
        }
        System.out.println(runTimeDouble);
    }
}
