public class Main {
    public static void main(String[] args) {
        int costOfPreviousPenny = 150001_00;
        int costOfThisPenny = 2500_00;
        int bonus;
        if (costOfPreviousPenny > 150000_00) {
            bonus = 100 * (costOfThisPenny / 1000_00);
        } else if (costOfPreviousPenny > 15000_00) {
            bonus = 70 * (costOfThisPenny / 1000_00);
        } else if (costOfPreviousPenny > 0) {
            bonus = 50 * (costOfThisPenny / 1000_00);
        } else bonus = 0;
        System.out.println(bonus);
    }
}
