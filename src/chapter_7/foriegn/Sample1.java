package chapter_7.foriegn;

import java.time.LocalDate;
import java.util.Date;

public class Sample1 {
    private Previous previous;

    public LocalDate methodA() {
        return nextDay(previous);
    }

    private LocalDate nextDay(Previous previous) {
        return LocalDate.of(previous.getYear(), previous.getMonth(), previous.getDays());
    }
}
