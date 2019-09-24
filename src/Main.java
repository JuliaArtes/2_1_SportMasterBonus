public class Main {
    public static void main(String[] args) {
        int costOfPreviousPenny = 150001_00;
        int costOfThisPenny = 2500_00;
        int Bonus;
        if (costOfPreviousPenny > 150000_00) {
            Bonus = 100 * (costOfThisPenny / 1000_00);
        } else if (costOfPreviousPenny > 15000_00) {
            Bonus = 70 * (costOfThisPenny / 1000_00);
        } else if (costOfPreviousPenny > 0) {
            Bonus = 50 * (costOfThisPenny / 1000_00);
        } else Bonus = 0;
        System.out.println(Bonus);
    }
}
