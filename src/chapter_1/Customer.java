package chapter_1;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public String statement() {
        String result = getName() + " 고객님의 대여 기록\n";
        for (int i = 0; i < rentals.size(); i++) {
            double thisAmount = 0;
            Rental rental = rentals.get(i);

            // 비디오 종류별 대여료 계산
            thisAmount = rental.getCharge();

            // 이번에 대여하는 비디오 정보와 대여료를 출력
            result += "\t" + rental.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";

        }

        // 푸터 행 추가
        result += "누적 대여료: " + String.valueOf(getTotalCharge()) + "\n";
        result += "적립 포인트: " + String.valueOf(getTotalFrequentRenterPoints());
        return result;
    }

    private double getTotalCharge() {
        double totalAmount = 0;
        for (int i = 0; i < rentals.size(); i++) {
            Rental rental = rentals.get(i);
            totalAmount += rental.getCharge();
        }
        return totalAmount;
    }

    private int getTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (int i = 0; i < rentals.size(); i++) {
            Rental rental = rentals.get(i);
            frequentRenterPoints += rental.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    // 비디오 종류별 대여료 계산 기능을 빼내어 별도의 메서드로 작성
    private double amountFor(Rental rental) {
        double thisAmount = 0;
        switch (rental.getMovie().getPriceCode()) {
            case Movie.REGULAR -> {
                thisAmount += 2;
                if (rental.getDaysRented() > 2) {
                    thisAmount += (rental.getDaysRented() - 2) * 1.5;
                }
            }
            case Movie.NEW_RELEASE -> thisAmount += (rental.getDaysRented() - 3) * 1.5;
            case Movie.CHILDRENS -> {
                thisAmount += 1.5;
                if (rental.getDaysRented() > 3) {
                    thisAmount += (rental.getDaysRented() - 3) * 1.5;
                }
            }
        }
        return thisAmount;
    }
}
