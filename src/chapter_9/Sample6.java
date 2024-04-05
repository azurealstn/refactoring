package chapter_9;

public class Sample6 {
    Customer customer;
    public void methodA() {
        if (customer == null) plan = BillingPlan.basic();
        else plan = customer.getPlan();
    }
}
