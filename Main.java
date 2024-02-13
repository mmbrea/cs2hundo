import java.util.Scanner;

public class MthdStubsStatistics {
  /*
   * my textbox starts here
   */
  public static int getUserNum() {
    System.out.println("FIXME: Finish getUserNum()");
    return 1;
  }

  public static int computeAvg(int userNum1, int userNum2) {
    int avgResult = -1;
    System.out.println("FIXME: Finish computeAvg()") return avgResult;
  }
  /*
   * my textbox ends here
   */
  public static void main(String[] args) {
    int userNum1;
    int userNum2;
    int avgResult;

    userNum1 = getUserNum();
    userNum2 = getUserNum();

    avgResult = computeAvg(userNum1, userNum2);

    System.out.println("Avg: " + avgResult);
  }
}
