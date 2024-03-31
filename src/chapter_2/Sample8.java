package chapter_2;

import java.util.Arrays;
import java.util.List;

public class Sample8 {
    public String foundPerson(String[] people) {
        List<String> candidates = Arrays.asList(new String[]{"Don", "John", "Kent"});
        for (String candidate : candidates) {
            if (candidates.contains(candidate)) {
                return candidate;
            }
        }
        return "";
    }
}
