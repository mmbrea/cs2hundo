///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           H12CustomApp test suite.
// Course:          CS 200, Spring 2024
//
// Author:          Amber Dahlberg
// Email:           aadahlberg@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// No help given or received.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the test bench that contains testing methods for the H12CustomApp
 * class. The createTestDataFile and readTestDataFile are private testing
 * methods intended to be used within the test cases.
 *
 * All the test cases within the testH12CustomApp method should be changed to
 * test the methods in your H12CustomApp class.
 *
 * @author Jim Williams
 * @author Amber Dahlberg
 */
public class TestH12CustomApp {

    /**
     * This method runs the selected tests.
     *
     * @param args unused
     */
    public static void main(String[] args) { testH12CustomApp(); }

    /**
     * This is a testing method to create a file with the specified name and
     * fileContents to be used by other testing methods. On a
     * FileNotFoundException a stack trace is printed and then returns.
     *
     * @param testDataFilename The filename of the testing file to create.
     * @param fileContents The data to put into the file.
     */
    private static void createTestDataFile(String testDataFilename,
                                           String fileContents) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(testDataFilename);
            writer.print(fileContents);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (writer != null)
                writer.close();
        }
    }

    /**
     * This is a testing method to read and return the entire contents of the
     * specified file to be used soley by other testing methods. On a
     * FileNotFoundException a stack trace is printed and then "" returned.
     *
     * @param dataFilename The name of the file to read.
     * @return The contents of the file or "" on error.
     */
    private static String readTestDataFile(String dataFilename) {
        File file = new File(dataFilename);
        Scanner input = null;
        String contents = "";
        try {
            input = new Scanner(file);
            while (input.hasNextLine()) {
                contents += input.nextLine() +
                            "\n"; // assuming all lines end with newline
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (input != null)
                input.close();
        }
        return contents;
    }

    /**
     * Tests that the H12CustomApp read input and write output methods handle
     * the cases described in their method header comments.
     *
     * @return true for passing all testcases, false otherwise
     */
    public static boolean testH12CustomApp() {
        boolean error = false;

        { // test that a file with a few lines of text can be read

            // create a data file to be read by the read method.
            String fileToRead = "testRead.txt";
            createTestDataFile(fileToRead, "the the a a hello, world!");

            // now read the file using the H12CustomApp read method that we are
            // testing
            ArrayList<String> words = new ArrayList<>();
            ArrayList<Integer> counts = new ArrayList<>();
            error = !H12CustomApp.countWordsFile(fileToRead, words, counts);

            // Check results correctness.
            if (!words.get(0).equals("the")) {
                System.out.println(words.get(0) + " != the");
                error = true;
            }
            if (!words.get(1).equals("a")) {
                System.out.println(words.get(1) + " != a");
                error = true;
            }
            if (!words.get(2).equals("hello")) {
                System.out.println(words.get(1) + " != hello");
                error = true;
            }
            if (!words.get(3).equals("world")) {
                System.out.println(words.get(1) + " != hello");
                error = true;
            }

            if (!error) {
                System.out.println("countWordsFile 1) success");
                File file = new File(fileToRead);
                file.delete();
            } else {
                System.out.println("countWordsFile 1) failed!");
            }
        }

        { // test that an invalid file returns "" for content.

            // make sure the file doesn't exist by deleting it if it does.
            String fileToRead = "fileThatShouldNotExist";
            File file = new File(fileToRead);
            if (file.exists()) {
                file.delete();
            }

            ArrayList<String> words = new ArrayList<>();
            ArrayList<Integer> counts = new ArrayList<>();

            // Should not succeed.
            error = H12CustomApp.countWordsFile(fileToRead, words, counts);
            if (!error) {
                System.out.println("countWordsFile 2) success");
            } else {
                System.out.println("countWordsFile 2) failed!");
            }
        }

        { // test that contents are correctly written to the specified file.
          //
            ArrayList<String> words = new ArrayList<>();
            ArrayList<Integer> counts = new ArrayList<>();

            // Populate test data.
            words.add("a");
            counts.add(1);
            words.add("b");
            counts.add(2);
            words.add("c");
            counts.add(3);

            // use our write file method to write some data to a file
            String fileNameToWrite = "testWrite.txt";
            H12CustomApp.writeSummaryFile(fileNameToWrite, words, counts);

            String actualContents = readTestDataFile(fileNameToWrite);
            String expectedContents = "a,1\nb,2\nc,3\n";

            // check if the contents are the same
            if (!actualContents.equals(expectedContents)) {
                error = true;
                System.out.println(
                    "writeSummaryFile 3) expected:" + expectedContents +
                    " actual: " + actualContents);
            } else {
                System.out.println("writeSummaryFile 3) success");
                // since the test succeeded, remove the temporary testing file.
                File file = new File(fileNameToWrite);
                file.delete();
            }
        }

        { // test that an invalid file returns "" for content.
            String fileNameToWrite = "missingDirectory/fileThatShouldNotExist";
            boolean expectedResult = false;

            // check that the directory doesn't exist, since we want writeFile
            // to handle the
            //  exception when it tries to write the file to that non-existing
            //  directory.
            File file = new File(fileNameToWrite);
            if (file.getParentFile().exists()) {
                error = true;
                System.out.println(
                    "writeFile 4) The directory: " +
                    file.getParentFile().getName() +
                    " should not exist for this test to run correctly.");
            } else {
                System.out.println("writeFile 4) success");
            }

            // now try to write some actual data to the file
            ArrayList<String> words = new ArrayList<>();
            ArrayList<Integer> counts = new ArrayList<>();
            boolean actualResult =
                H12CustomApp.writeSummaryFile(fileNameToWrite, words, counts);

            if (actualResult != expectedResult) {
                error = true;
                System.out.println("writeFile 5) expected:" + expectedResult +
                                   " actual: " + actualResult);
            } else {
                System.out.println("writeFile 5) success");
            }
        }

        if (error) {
            System.out.println("\nTestH12CustomApp failed");
            return false;
        } else {
            System.out.println("\nTestH12CustomApp passed");
            System.out.println(
                "There may be output from the methods being tested.");
            return true;
        }
    }
}
