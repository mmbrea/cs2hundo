import java.util.Scanner;

public class ArraySearch {
    /* 8.3.3 */
    public static int findAnnualMembership(int visits, int age) {
        int[][] by_visits = {{75, 80, 70}, {50, 55, 45}, {30, 35, 25}};

        int visitIdx = 0;
        if (visits >= 4 && visits <= 11) {
            visitIdx = 1;
        } else if (visits > 11) {
            visitIdx = 2;
        }

        int ageIdx = 0;
        if (age >= 11 && age <= 71) {
            ageIdx = 1;
        } else if (age > 71) {
            ageIdx = 2;
        }

        return by_visits[visitIdx][ageIdx];
    }

    public static void main(String[] args) {
        /* placeholder */
        System.out.println(findAnnualMembership(5, 20));
        /* placeholder */
    }
}
