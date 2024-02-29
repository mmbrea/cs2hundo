import java.util.Scanner;

public class GradingDecision {
  /**
   * Comment.
   */
  public static void main(String[] args) {

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

    if (theoryGrade == 'F' && practicalGrade == 'F') {
      finalGrade = 'F';
      printMe(theoryGrade, practicalGrade, finalGrade);
    } else if (((theoryGrade || practicalGrade) == 'F') &&
               ((thoeryGrade || practicalGrade) == ('A' || 'P'))) {
      fAndAorP(theoryGrade, practicalGrade, finalGrade);
    } else if ((theoryGrade == 'A' || theoryGrade == 'P') &&
               (practicalGrade == 'P' || practicalGrade == 'A')) {
      biggestAorP(theoryGrade, practicalGrade, finalGrade);
    }
  }

  public static void fAndAorP(char theoryGrade, char practicalGrade,
                              char finalGrade) {
     if (((theoryGrade || practicalGrade) == 'F') && ('F' >= (mean score for exam))) {
       finalGrade = 'P';
       printMe(theoryGrade, practicalGrade, finalGrade);
     } else {
       finalGrade = 'F';
       printMe(theoryGrade, practicalGrade, finalGrade);
     }
  }

  public static void biggestAorP(char theoryGrade, char practicalGrade,
                                 char finalGrade) {
    if (theoryGrade == 'A' || practicalGrade == 'A') {
      finalGrade = 'A';
      printMe(theoryGrade, practicalGrade, finalGrade);
    } else {
      finalGrade = 'P';
      printMe(theoryGrade, practicalGrade, finalGrade);
    }
  }

  public static void printMe(char theoryGrade, char practicalGrade,
                             char finalGrade) {
    System.out.println("Theory Grade: " + theoryGrade);
    System.out.println("Practical Grade: " + practicalGrade);
    System.out.println("Final Grade: " + finalGrade);
  }

  // calc indiv grades based on mean and std deviation.

  private static char calculateGrade(double mean, double deviation,
                                     double score) {
    if (score > (mean + (2 * deviation))) {
      return 'A';
    } else if (score < (mean - (2 * deviation))) {
      return 'F';
    } else {
      return 'P';
    }
  }
}
