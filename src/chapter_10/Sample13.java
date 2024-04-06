package chapter_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sample13 {
    List<Object> readings = new ArrayList<>();
    public Reading lastReading() {
        return (Reading) readings.getLast();
    }

    static class Reading {

    }
}
