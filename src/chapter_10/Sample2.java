package chapter_10;

public class Sample2 {
    public String getContact(Customer customer) {
        return customer.getContact();
    }

    static class Customer {
        String contact;

        public String getContact() {
            return contact;
        }
    }
}
