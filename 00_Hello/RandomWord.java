/* *****************************************************************************
 *  Name:              Rachit Garg
 *  Coursera User ID:  123456
 *  Last modified:     April 09, 2025
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {

        // Read the first string and let it be the champion initially
        String input = StdIn.readString();
        String champion = input;

        // Use a counter to count the i for the current input
        int i = 1;

        while (!StdIn.isEmpty()) {
            input = StdIn.readString();
            ++i;
            // Choose the current champion with the probability of 1/i
            // Need to take care of using atleast one double (1.0 in this case),
            // otherwise it is an integer division
            // resulting a 0 and being false all the time
            champion = StdRandom.bernoulli(1.0/i) ? input : champion;
        }

        // Print the champion
        StdOut.println(champion);
    }
}
