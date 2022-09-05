package Work;

import java.util.ArrayList;

/**
 * Class to find the number of even or odd factors in a range of numbers
 */
public class FactorFinder {


    public static void main(String[] args) {

        // Create a list to store the oddly factoring numbers
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 1; i < 101; i++) if ((numOfFactors(i) % 2) != 0) oddNumbers.add(i);

        System.out.println("There are " + oddNumbers.size() + " numbers from 1-100 with an odd number of factors:\n" + oddNumbers);
        System.out.println("Sure enough, they're all squares!");
    }

    /**
     * gets # of factors for a given #
     *
     * @param num to be factored
     * @return number of factors of num
     */
    private static int numOfFactors(int num) {

        // store factors
        int factors = 0;

        // Loop from 1 to num inclusive, finding where % yields 0
        for (int i = num; i > 0; i--) {
            if (num % i == 0) {
                factors++;
            }
        }

        // Uncomment this line to see all factors:
        // System.out.println("There are " + factors + " factors of " + num);

        return factors;
    }

}
