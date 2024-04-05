///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           9.16 Encryption Machine
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
import java.util.Scanner;

/**
 * This class has methods to encode and decode messages.
 *
 * @author Ruby Wang
 * @author Amber Dahlberg
 */
public class Encoder {

    /**
     * This method takes in a message in String and shift
     * each letter in the String to the right according to the ASCII table
     * by ENCODE_SHIFTING positions.
     * e.g. abcxyz -> fghcde.
     * Add the shifted string to the end of encodedMessages ArrayList.
     *
     * @param encodedMessages The list of encoded messages
     * @param message the input String waiting to be encoded
     */
    public static void encodeMessage(ArrayList<String> encodedMessages,
                                     String message) {
        final int ENCODE_SHIFTING = 5;
        final int CHAR_START_INDEX = 'a';
        final int CHARACTER_COUNT = 26;

        String shifted = "";
        for (int i = 0; i < message.length(); i++) {
            shifted +=
                (char)('a' + ((message.charAt(i) + 5 - 'a') % CHARACTER_COUNT));
        }

        encodedMessages.add(shifted);
    }

    /**
     * This method deletes the stored message in the index position of
     * encodedMessages ArrayList. If the index value is valid, then delete
     * the message and return True; else, return false;
     *
     * @param encodedMessages The list of encoded messages
     * @param index the index of where the message should be removed in
     *              encodedMessage ArrayList
     * @return true if successfully deleted, otherwise return false
     */
    public static boolean deleteMessage(ArrayList<String> encodedMessages,
                                        int index) {
        boolean doDelete = index >= 0 && index < encodedMessages.size();

        if (doDelete) {
            encodedMessages.remove(index);
        }

        return doDelete;
    }

    /**
     * Aggregate all messages stored in encodedMessage ArrayList into
     * one String. Separate different messages using the next line
     * character('\n').
     * @param encodedMessages The list of encoded messages
     * @return the aggregated message
     */
    public static String getEncodedMessage(ArrayList<String> encodedMessages) {
        return String.join("\n", encodedMessages);
    }

    /**
     * The main method takes in messages and indexes from users which
     * includes a unit test for each method.
     * You don't need to edit anything here!
     *
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> encodedMessages = new ArrayList<>();

        System.out.println(
            "Please enter 3 words to encrypt followed by 2 integer delete position"
            + " signals.");
        String firstMessage = scnr.next();
        String secondMessage = scnr.next();
        String thirdMessage = scnr.next();
        int firstIndex = scnr.nextInt();
        int secondIndex = scnr.nextInt();

        encodeMessage(encodedMessages, firstMessage);
        encodeMessage(encodedMessages, secondMessage);
        encodeMessage(encodedMessages, thirdMessage);
        System.out.println("current encoded message: " +
                           getEncodedMessage(encodedMessages));

        System.out.println(deleteMessage(encodedMessages, firstIndex));
        System.out.println("current encoded message: " +
                           getEncodedMessage(encodedMessages));

        System.out.println(deleteMessage(encodedMessages, secondIndex));
        System.out.println("current encoded message: " +
                           getEncodedMessage(encodedMessages));
    }
}
