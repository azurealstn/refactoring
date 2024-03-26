package chapter_1;

public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public double getCharge() {
        double thisAmount = 0;
        switch (movie.getPriceCode()) {
            case Movie.REGULAR -> {
                thisAmount += 2;
                if (daysRented > 2) {
                    thisAmount += (daysRented - 2) * 1.5;
                }
            }
            case Movie.NEW_RELEASE -> thisAmount += (daysRented - 3) * 1.5;
            case Movie.CHILDRENS -> {
                thisAmount += 1.5;
                if (daysRented > 3) {
                    thisAmount += (daysRented - 3) * 1.5;
                }
            }
        }
        return thisAmount;
    }

    // 최신물을 이틀 이상 대여하면 2포인트 지급하고 그 외엔 1포인트 지급하는 코드를
    // 빼내 getFrequentRenterPoints 메서드로 만들고 이 Rental 클래스로 옮겼다.
    public int getFrequentRenterPoints() {
        if ((movie.getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
