package chapter_7.method;

public class AccountType {
    public double overdraftCharge(int daysOverdrawn) {
        if (isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }
            return result;
        } else {
            return daysOverdrawn * 1.75;
        }
    }

    public boolean isPremium() {
        // 로젝 생략
        return true;
    }

}
