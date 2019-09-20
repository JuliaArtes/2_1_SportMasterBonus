public class Main {
    public static void main(String[] args) {
        int CostOfPreviousPenny = 150001_00;
        int CostOfThisPenny = 2500_00;
        int Bonus;
        if (CostOfPreviousPenny > 150000_00) {
            Bonus = 100 * (CostOfThisPenny / 1000_00);
        } else if (CostOfPreviousPenny > 15000_00) {
            Bonus = 70 * (CostOfThisPenny / 1000_00);
        } else if (CostOfPreviousPenny > 0) {
            Bonus = 50 * (CostOfThisPenny / 1000_00);
        } else Bonus = 0;
        System.out.println(Bonus);
    }
}
