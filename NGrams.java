///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           NGrams
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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class with methods to read files, create n-grams, and print the result.
 *
 * @author Victor Suciu
 * @author Amber Dahlberg
 *
 */
public class NGrams {

    /**
     * Reads the space-delimited words from a file.
     * If the file does not exist, displays the message
     * "File [path] not found" and returns an empty ArrayList.
     *
     * For example, if path = /Documents/ExampleFolder/text_document.txt
     * and text_document.txt contains the following:
     *
     * one two
     * three four five
     *
     * You would return the ArrayList ["one", "two", "three", "four", "five"]
     *
     * If that file did not actually exist, it would print the following:
     * "File /Documents/ExampleFolder/text_document.txt not found"
     *
     * and return an empty ArrayList
     *
     * @param path - a file path to a text file
     * @return an ArrayList of words
     */
    public static ArrayList<String> readWords(String path) {
        ArrayList<String> result = new ArrayList<>();

        try {
            Scanner scnr = new Scanner(new FileInputStream(path));

            while (scnr.hasNext()) {
                result.add(scnr.next());
            }

            scnr.close();
        } catch (FileNotFoundException exc) {
            System.out.println("File " + path + " not found");
        }

        return result;
    }

    /**
     * Extracts all n-grams from a sequence of words
     *
     * For example, if the ArrayList of words is
     * ["one", "two" "three", "four", "five"]
     * with n=3, the ArrayList of n-grams should have the format
     * [["one", "two" "three"], ["two" "three", "four"], ["three", "four",
     * "five"]]
     *
     * @param words - a list of words
     * @param n - the n-gram size
     * @return an ArrayList of n-grams, where each n-gram is itself an ArrayList
     */
    public static ArrayList<ArrayList<String>>
    getNGrams(ArrayList<String> words, int n) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            ArrayList<String> newList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (i + j < words.size()) {
                    newList.add(words.get(i + j));
                }
            }

            if (newList.size() == n) {
                result.add(newList);
            }
        }

        return result;
    }

    /**
     * Prints an ArrayList of n-grams vertically, so each n-gram has its own
     * line.
     *
     * Use only one for-loop inside printNGrams. You should not use nested
     * for-loops. Take advantage of the fact that printing an ArrayList results
     * in human-readable output automatically.
     *
     * For example,
     * if ngrams = [["one", "two", "three"], ["two", "three", "four"], ["three",
     * "four", "five"]] You would print the contents of ngrams in the following
     * format:
     *
     * [one, two, three]
     * [two, three, four]
     * [three, four, five]
     *
     * @param ngrams - The list of n-grams
     */
    public static void printNGrams(ArrayList<ArrayList<String>> ngrams) {
        for (ArrayList<String> stringList : ngrams) {
            System.out.println(stringList);
        }
    }

    /**
     * Reads the file path and value of n from the console, then calls the
     * methods above in sequence
     *
     * Step 1. Read user input. This will be given in the form "[file path] [n]"
     * in a single line, where the two values are separated by a space
     *
     * Step 2. Get the ArrayList of words from the file using readWords()
     *
     * Step 3. Get the ArrayList of n-grams from the ArrayList of words using
     * getNGrams()
     *
     * Step 4. Print the ArrayList of n-grams using printNGrams()
     *
     * @param args unused
     */
    public static void main(String[] args) {

        // Do not edit anything in the main method.
        // only edit the methods readWords, getNGrams, and printNGrams.

        Scanner inputReader = new Scanner(System.in);

        String path = inputReader.next();
        int n = inputReader.nextInt();

        ArrayList<String> words = readWords(path);
        ArrayList<ArrayList<String>> ngrams = getNGrams(words, n);
        printNGrams(ngrams);
    }
}
