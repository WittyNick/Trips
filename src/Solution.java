// Kryvasheyeu Pavel

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        // 1. Define and initialize
        Trip[] trips = {
                new DirectTrip(15.0, 60),
                new DirectTrip(20.0, 40),
                new DirectTrip(40.5, 60, 10),
                new ArcTrip(30.0, 70.0, 35),
                new ArcTrip(20.0, 15.5, 60, 5),
                new ArcTrip(12.3, 45.0, 10),
                new TransitTrip(10.3, 20.4, 40, 5),
                new TransitTrip(14.7, 7.7, 110, 10),
                new TransitTrip(6.1, 6.0, 90),
                new TransitTrip(7.5, 7.5, 75),
        };

        // 2. Print to console
        System.out.println("Source array:");
        printToConsole(trips);

        // 3. Copy
        Trip[] tripsCopy = Arrays.copyOf(trips, trips.length);

        // 4. Sort
        for (int i = 0; i < tripsCopy.length - 1; i++) {
            for (int j = i + 1; j < tripsCopy.length; j++) {
                if (tripsCopy[i].getTripTime() < tripsCopy[j].getTripTime()) {
                    Trip tmp = tripsCopy[i];
                    tripsCopy[i] = tripsCopy[j];
                    tripsCopy[j] = tmp;
                }
            }
        }

        // 5. Print result to console
        System.out.println("\nSorted array:");
        printToConsole(tripsCopy);

        // 6. Print fastest trip
        System.out.println("\nFastest trip:");
        System.out.println(tripsCopy[tripsCopy.length - 1]);

        // 7. Check a trip from 25 to 30 minutes duration
        boolean wasFound = false;
        for (Trip trip : trips) {
            int tripTime = trip.getTripTime();
            if (25 <= tripTime && tripTime <= 30) {
                wasFound = true;
                break;
            }
        }
        System.out.println("\nTrip form 25 to 30 min duration was found: " + wasFound);
    }

    public static void printToConsole(Trip[] array) {
        System.out.printf("%2s%8s%9s%9s%6s%9s\n",
                "Nr", "Type", "Duration", "Distance", "Speed", "Stopover");
        for (Trip trip : array) {
            System.out.println(trip);
        }
    }
}

