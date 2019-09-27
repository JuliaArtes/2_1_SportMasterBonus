public class Main {
    public static void main(String[] args) {
        int standartLevel = 15000_00;
        int silverLevel = 150000_00;
        int standartBonus = 50;
        int silverBonus = 70;
        int goldBonus= 100;
        int bonusAmountPenny = 1000_00;
        int costOfPreviousPenny = 150001_00;
        int costOfThisPenny = 2500_00;
        int bonus;
        if (costOfPreviousPenny > silverLevel) {
            bonus = goldBonus * (costOfThisPenny / bonusAmountPenny);
        } else if (costOfPreviousPenny > standartLevel) {
            bonus = silverBonus * (costOfThisPenny / bonusAmountPenny);
        } else if (costOfPreviousPenny > 0) {
            bonus = standartBonus * (costOfThisPenny / bonusAmountPenny);
        } else bonus = 0;
        System.out.println(bonus);
    }
}
