///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           9.18 GradeAnalyzer
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

import java.util.ArrayList;
import java.util.Random;

/**
 * Contains methods for calculating grades.
 * @author Rui Huang
 * @author Rajesh Shashi Kumar
 * @author Bethany Schmeling
 */
public class GradeAnalyzer {

    /**
     * This method first generates a random number between 20 and 100 (both
     * inclusive), and then appends this generated number at the end of the
     * ArrayList grades. Use the method rand.nextInt and transform this value so
     * that the number is within the given bounds.  If a parameter is null, then
     * returns with no changes.
     *
     * @param grades the ArrayList of all students' grades
     * @param rand a random generator to generate grades
     */
    public static void addGrade(ArrayList<Integer> grades, Random rand) {
        if (grades != null && rand != null) {
            grades.add(rand.nextInt(81) + 20);
        }
    }

    /**
     * This method searches for the lowest score in the ArrayList.
     * Hint: Assume maximum score of 100 as initial minimum value
     *
     * @param grades the ArrayList of scores to be searched from
     * @return the minimum element in the ArrayList; -1 if it is null;
     *         or 0 if the ArrayList is empty.
     */
    public static int findMinScore(ArrayList<Integer> grades) {
        int min = -1;

        if (grades == null) {
            return min;
        }

        min = 0;

        for (Integer grade : grades) {
            if (min == 0) {
                min = grade;
            } else if (grade < min) {
                min = grade;
            }
        }

        return min;
    }

    /**
     * This method calculates an average over all the scores in the ArrayList.
     *
     * Note: The return value should include decimals.
     * Make sure to use double division instead of integer division.
     *
     * @param grades the ArrayList of all scores
     * @return the average over all the elements in the ArrayList;
     *         -1 if the ArrayList is null or empty;
     */
    public static double calcAverageScore(ArrayList<Integer> grades) {

        if (grades == null || grades.size() == 0) {
            return -1;
        }

        double totalScore = 0;

        for (Integer grade : grades) {
            totalScore += grade;
        }

        return totalScore / grades.size();
    }

    /**
     * This method calculates the percentage of students whose grades are
     * greater than or equal to a certain threshold. E.g.: if grades = [1, 2, 3,
     * 4, 5] and threshold = 2 the return value should be 80.0 (because 2, 3, 4,
     * 5 are at or above threshold; 4 / 5 = 80%)
     *
     * Note: The return value should include decimals.
     * Make sure to use double division instead of integer division.
     *
     * @param grades the ArrayList of all students' grades
     * @param threshold  a specific number to compare with
     * @return a percentage in the range of [0.0, 100.0]; or -1 if the ArrayList
     *     is null or empty.
     */
    public static double calcPercentageAbove(ArrayList<Integer> grades,
                                             int threshold) {
        double aboveCount = 0.0;

        if (grades == null || grades.size() == 0) {
            return -1;
        }

        for (Integer grade : grades) {
            if (grade >= threshold) {
                aboveCount++;
            }
        }

        return (aboveCount / grades.size()) * 100;
    }

    /**
     * This method finds out all the students in the ArrayList with a certain
     * grade, and stores their indices from the grades ArrayList into a new
     * ArrayList, which is then returned.
     *
     * @param grades the ArrayList of all students' grades
     * @param gradeToFind a specific grade to be found in the ArrayList
     * @return an ArrayList of found indices in ascending order; or null if
     *     grades is null
     */
    public static ArrayList<Integer>
    findStudentsWithGrade(ArrayList<Integer> grades, int gradeToFind) {
        if (grades == null) {
            return grades;
        }

        ArrayList<Integer> gradeIndices = new ArrayList<Integer>();

        for (int i = 0; i < grades.size(); i++) {
            Integer grade = grades.get(i);
            if (grade == gradeToFind) {
                gradeIndices.add(i);
            }
        }

        return gradeIndices;
    }

    /**
     * Main method calls implemented methods to fil an ArrayList with random
     * grades run statistical analysis on this list, and print the results.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<Integer>();
        Random rand = new Random(Config.SEED);
        for (int i = 0; i < Config.NUM_STUDENTS; i++)
            addGrade(grades, rand);

        int minScore = findMinScore(grades);
        System.out.println("The lowest score in this class is: " + minScore);

        double aveScore = calcAverageScore(grades);
        System.out.println("The average score in this class is: " + aveScore);

        double successRate = calcPercentageAbove(grades, 64);
        System.out.println(
            "The percentage of students above 64 is: " + successRate + "%");

        ArrayList<Integer> studentIndices = findStudentsWithGrade(grades, 100);
        System.out.println("Here are the IDs of students who got full marks: " +
                           studentIndices);
    }
}
