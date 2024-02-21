import java.util.Scanner;

public class LabTesting {
  /**
   * Program entry.
   */
  public static String g(int testScore) {
    String dailyGrade;
    if (testScore >= 93) {
      // [t] sub for testScore
      // [d] sub for dailyGrade
      dailyGrade = "A";
    } else if (testScore >= 89) {
      dailyGrade = "AB";
    } else if (testScore >= 82) {
      dailyGrade = "B";
    } else if (testScore >= 76) {
      dailyGrade = "BC";
    } else if (testScore >= 68) {
      dailyGrade = "C";
    } else if (testScore >= 55) {
      dailyGrade = "D";
    } else {
      dailyGrade = "F";
    }
    return dailyGrade;
  }

  public static void main(String[] args) {
    Scanner z = new Scanner(System.in);
    System.out.print("Enter your score: ");
    int s = z.nextInt();
    System.out.println("Grade: " + g(s));
  }
}

// this is like 5 minutes of work at this state.
// Save for tmr.
// substitution: :%s/srch/rplc/g
