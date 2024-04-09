package chapter_11;

public class JobItem {
    private int TotalPrice;
    private int unitPrice;

    public int getTotalPrice() {
        return TotalPrice;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    static class LaborItm {
        private int EmployeeCount;

        public int getEmployeeCount() {
            return EmployeeCount;
        }
    }
}
