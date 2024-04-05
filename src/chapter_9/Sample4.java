package chapter_9;

public class Sample4 {
    public String checkSecurity(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                return "Don";
            }
        }
        return "";
    }
}
