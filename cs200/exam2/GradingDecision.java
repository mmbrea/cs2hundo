import java.util.Scanner;

public class GradingDecision {
  /**
   * Program entry.
   */
  public static void main(String[] args) {
    /* Print command-line arguments. */
    Scanner scnr = new Scanner(System.in);

    double u1 = scnr.nextDouble();
    double d1 = scnr.nextDouble();
    double u2 = scnr.nextDouble();
    double d2 = scnr.nextDouble();
    double s1 = scnr.nextDouble();
    double s2 = scnr.nextDouble();

    char theoryGrade = calculateGrade(u1, d1, s1);
    char practicalGrade = calculateGrade(u2, d2, s2);
    char finalGrade;

    int numA = 0;
    int numP = 0;
    int numF = 0;

    if (theoryGrade == 'A') {
      numA++;
    } else if (theoryGrade == 'P') {
      numP++;
    } else {
      numF++;
    }

    if (practicalGrade == 'A') {
      numA++;
    } else if (practicalGrade == 'P') {
      numP++;
    } else {
      numF++;
    }

    // if 'F' and 'F'
    //     final = 'F' (& print statements)
    // if 'A'or'P' and 'A'or'P'
    //     final = highestOf('A' or 'P') (& print statements)
    // if 'A'or'P' and 'F' (if 'A'or'P' in one and 'F' in the other)
    //     if 'F' > mean score: final = 'P' (& print statements)
    //         else final = F; (& print statements)
    //
    // (is this needed or can format both with previous?)
    // if 'F' and 'A'or'P' (if 'A'or'P' in one and 'F' in the other)
    //     if 'F' > mean score: final = 'P' (& print statements)
    //         else final = F; (& print statements)

    if (numF == 2) {
      finalGrade = 'F';
    } else if (numA + numP == 2 && numA > 0) {
      finalGrade = 'A';
    } else if (numP == 2) {
      finalGrade = 'P';
    } else {
      double studentScore = (theoryGrade == 'P') ? s1 : s2;
      double classMean = (theoryGrade == 'P') ? u1 : u2;

      finalGrade = (studentScore > classMean) ? 'P' : 'F';
    }

    System.out.println("Theory Grade: " + theoryGrade);
    System.out.println("Practical Grade: " + practicalGrade);
    System.out.println("Final Grade: " + finalGrade);
  }

  private static char calculateGrade(double mean, double deviation,
                                     double score) {
    if (score > (mean + 2 * deviation)) {
      return 'A';
    } else if (score < (mean - 2 * deviation)) {
      return 'F';
    } else {
      return 'P';
    }
  }
}
