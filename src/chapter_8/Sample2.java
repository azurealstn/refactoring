package chapter_8;

public class Sample2 {
    public void methodA() {
        Performance row = new Performance();
        row.setName("Liverpool");
        row.setWins("15");
    }

    static class Performance {
        private String name;
        private String wins;

        public void setName(String name) {
            this.name = name;
        }

        public void setWins(String wins) {
            this.wins = wins;
        }
    }
}
