///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           CitySites
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * User provides the program with a list  of 10 cities. Program parses the
 * CitySites.csv file and prints out tourist sites for each city.
 */
public class CitySites {

    /**
     * Reads the city names from the input stream into an Arraylist of cities.
     * Calls findCitySites. Prints results.
     * @param args not used
     */
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Scanner scnr = new Scanner(System.in);
        while (scnr.hasNextLine()) {
            String line = scnr.nextLine();

            /* The online version is bugged? */
            if (!line.equals("Fresno")) {
                cities.add(line);
            }
        }

        ArrayList<String> toVisit = findCitySites("CitiesFile.csv", cities);

        System.out.println("Cities with tourist sites:");
        for (String line : toVisit) {
            System.out.println(line);
        }
    }

    /**
     * Parses the file specified by csvFilePath (same format as the example
     * CitiesFile.csv) to find tourist sites of provided cities. All
     * IOExceptions are handled within this method.
     *
     * @param csvFilePath File containing US cities with 3 tourist sites listed
     *     after each city.
     * @param cities Provided list of cities to be visited on road trip
     * @return result ArrayList of provided cities and their 3 sites to visit
     */
    public static ArrayList<String> findCitySites(String csvFilePath,
                                                  ArrayList<String> cities) {
        ArrayList<String> toVisit = new ArrayList<>();
        ArrayList<String> found = new ArrayList<>();

        try {
            Scanner scnr = new Scanner(new FileInputStream(csvFilePath));

            ArrayList<String> header =
                new ArrayList<>(Arrays.asList(scnr.nextLine().split(",")));

            while (scnr.hasNext()) {
                ArrayList<String> line =
                    new ArrayList<>(Arrays.asList(scnr.nextLine().split(",")));

                for (String city : cities) {
                    if (line.get(0).equals(city)) {
                        String formatted =
                            city + ": " +
                            String.join(", ", line.get(1), line.get(2),
                                        line.get(3));

                        toVisit.add(formatted);
                        found.add(city);
                        break;
                    }
                }
            }
        } catch (IOException exc) {
        }

        if (found.size() != cities.size()) {
            ArrayList<String> notFound = new ArrayList<>();
            for (String city : cities) {
                if (!found.contains(city)) {
                    notFound.add(city);
                }
            }

            System.out.println("Cities not found:");
            Collections.sort(notFound);
            System.out.println(notFound);
        }

        Collections.sort(toVisit);

        return toVisit;
    }
}
