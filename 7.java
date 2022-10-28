// TreeMap()
// To assist Event organizers, you need to develop a console application that shows the number of tickets sold in a particular price category. Thus
// enabling them to increase or decrease seats allocated for different price levels and thereby boosting ticket sales. The list of booking details that
// contains customer and price details are given.
// Use TreeMap with price as key and number of seats booked as value.
// Create a driver class named Main. In the main method, obtain details and display the price along with the number of tickets in increasing order
// of price.
// Input Format:
// The first line of the input corresponds to the number of events 'n'.
// The next 'n' line of inputs corresponds to the event details in CSV format (Customer Name, Ticket Price, No of Seats Booked).
// Refer to Sample Input and Output for formatting specifications.
// Output Format:
// The output consists of the number of tickets booked for a particular ticket price in increasing order of price.
// Use ("%-15s %s\n","Ticket Price","Tickets Booked") for the format.
// Refer to Sample Input and Output for formatting specifications.

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> n = new TreeMap<Integer, Integer>();

        n.put(100, 5);
        if (n.containsKey(100)) {
            n.replace(100, n.get(100), n.get(100) + 3);
        }
        n.put(200, 10);
        for(Map.Entry v:n.entrySet())
        {
            System.out.println(v.getKey()+" "+v.getValue());
        }
    }

}
