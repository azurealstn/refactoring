package chapter_10;

public class Sample7 {
    private int low;
    private int high;
    private int withinPlan;

    public void methodA() {
        DaysTempRange daysTempRange = new DaysTempRange();
        Plan plan = new Plan();
        withinPlan = plan.withinRange(daysTempRange);
    }

    static class Plan {
        public int withinRange(DaysTempRange daysTempRange) {
            return daysTempRange.getLow() * daysTempRange.getHigh();
        }
    }

    static class DaysTempRange {
        private int low;
        private int high;

        public int getLow() {
            return low;
        }

        public int getHigh() {
            return high;
        }
    }
}
