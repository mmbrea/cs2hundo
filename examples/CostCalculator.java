public class CostCalculator {
    public static int calculateCost(int age, int units) {
        int cost;
        if (age > 16 && age < 27) {
            if (units > 14) {
                cost = (units - 14) * 300;
            } else {
                cost = 0;
            }
        } else {
            if (units < 20) {
                cost = units * 300;
            } else {
                cost = (units - 19) * 400 + 500;
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        int costReturned = calculateCost(22, 6);
        System.out.println(costReturned);
    }
}
