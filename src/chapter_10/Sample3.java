package chapter_10;

public class Sample3 {
    public String getContact() {
        return "Contact Me";
    }

    static class Customer {
        String contact;

        public String getContact() {
            return contact;
        }
    }
}
