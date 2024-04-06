package chapter_10;

public class Sample12 {
    static class Employee {
        int type;

        private Employee(int type) {
            this.type = type;
        }

        // 팩토리 메서드
        static Employee create(int type) {
            return new Employee(type);
        }
    }
}
