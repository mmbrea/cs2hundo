///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           H12CustomApp implementation.
// Course:          CS 200, Spring 2024
//
// Author:          Amber Dahlberg
// Email:           aadahlberg@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// https://stackoverflow.com/questions/1805518/
// replacing-all-non-alphanumeric-characters-with-empty-strings
//
// Wanted to remove punctuation from word counting.
//
///////////////////////////////// REFLECTION ///////////////////////////////////
//
// 1. Describe the problem you wrote the program to solve:
//
// I implemented a program that counts unique words found in an input file
// and summarizes the word counts for each word.
//
// 2. Why did you choose the method header for the read file method (e.g.,
// return type, parameters, throws clause)?
//
// The Scanner interface allows reading String data from an arbitrary source,
// allowing de-coupling of the data processing from the I/O.
//
// 3. Why did you choose the method header for the write file method (e.g.,
// return type, parameters, throws clause)?
//
// The PrintWriter interface allows writing String data agnostic of underlying
// I/O, which makes that method easier to test.
//
// 4. What are the biggest challenges you encountered:
//
// Designing interfaces that are easy to test. This is why I chose to have
// the main method deal with files and read/write methods use I/O agnostic
// stream utilities.
//
// 3. What did you learn from this assignment:
//
// How to implement a basic "file in, file out" Java program, and how to test
// the business logic.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class hosting a program for counting unique words and individual word
 * counts from an input file and writing a parsable result to an output file.
 *
 * @author Amber Dahlberg
 */
public class H12CustomApp {
    /**
     * Count unique words observed from scanner input.
     *
     * Note that case is ignored (all input converted to lowercase).
     *
     * @param input Scanner to read input from.
     * @param words A list of unique words encountered.
     * @param counts A list of individual word counts (maps 1:1 with 'words').
     */
    public static void countWords(Scanner input, ArrayList<String> words,
                                  ArrayList<Integer> counts) {
        while (input.hasNext()) {
            /* Improve data by removing punctuation and capitalization. */
            String curr = input.next().toLowerCase().strip();
            curr = curr.replaceAll("[^A-Za-z0-9]", "");

            /* Not all tokens will have any characters remaining. */
            if (curr.length() == 0) {
                continue;
            }

            int index = words.indexOf(curr);

            /* Track this new word if it's new. */
            if (index == -1) {
                words.add(curr);
                counts.add(1);
            } else {
                counts.set(index, counts.get(index) + 1);
            }
        }
    }

    /**
     * Summarize word counts using a print writer interface.
     *
     * @param writer Writer to use to write summary dtaa.
     * @param words Words with associated counts.
     * @param counts Counts for associated words.
     */
    public static void writeSummary(PrintWriter writer, ArrayList<String> words,
                                    ArrayList<Integer> counts) {

        int iterations = Math.min(words.size(), counts.size());
        for (int i = 0; i < iterations; i++) {
            writer.println(words.get(i) + "," + counts.get(i));
        }
    }

    /**
     * Attempt to count words from an input file.
     *
     * @param fileName Name of file to open and read.
     * @param words Words with associated counts.
     * @param counts Counts for associated words.
     *
     * @return true if a file was successfully opened and processed.
     */
    public static boolean countWordsFile(String fileName,
                                         ArrayList<String> words,
                                         ArrayList<Integer> counts) {
        boolean result = false;

        try {
            Scanner fileInput = new Scanner(new FileInputStream(fileName));
            countWords(fileInput, words, counts);
            fileInput.close();
            result = true;
        } catch (IOException exc) {
            System.out.println("Couldn't open file: " + exc);
        }

        return result;
    }

    /**
     * Attempt to summarize word counts to an output file.
     *
     * @param fileName Name of file to open and write.
     * @param words Words with associated counts.
     * @param counts Counts for associated words.
     *
     * @return true if a file was successfully written.
     */
    public static boolean writeSummaryFile(String fileName,
                                           ArrayList<String> words,
                                           ArrayList<Integer> counts) {
        boolean result = false;

        try {
            PrintWriter writer = new PrintWriter(fileName);
            writeSummary(writer, words, counts);
            writer.close();
            result = true;
        } catch (IOException exc) {
            System.out.println("Couldn't open file: " + exc);
        }

        return result;
    }

    /**
     * A program entry for counting unique words and individual word
     * counts from an input file and writing a parsable result to an output
     * file.
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println(
            "Greetings. This program will count words in text files.");

        /* Process input file. */
        boolean result = false;
        while (!result && input.hasNextLine()) {
            System.out.print("Input file name: ");
            result = countWordsFile(input.nextLine(), words, counts);
        }

        /* Prompt for output file name. */
        if (result && input.hasNextLine()) {
            result = false;
            while (!result) {
                System.out.print("Output file name: ");
                result = writeSummaryFile(input.nextLine(), words, counts);
            }
        }
    }
}
