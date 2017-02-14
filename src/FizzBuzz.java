import java.util.ArrayList;

/**
 * Write a program that prints the numbers from 1 to 100. But for multiples of
 * three print "Fizz" instead of the number and for the multiples of five print
 * "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".
 * Most good programmers should be able to write out on paper a program which
 * does this in a under a couple of minutes.
 *
 * Want to know something scary?
 *
 * The majority of comp sci graduates can't.
 * I've also seen self-proclaimed senior programmers take more than 10-15
 * minutes to write a solution.
 *
 * https://blog.codinghorror.com/why-cant-programmers-program/
 */

// created 14.02.2017

class FizzBuzz {

    private boolean printNumber;

    public static void main(String[] args) {

        FizzBuzz m = new FizzBuzz();

        ArrayList<Integer> hundred = new ArrayList<>();

        for (int i = 0; i < 101; i++) {
            hundred.add(i);
        }
        hundred.remove(0);

        for (int item : hundred) {
            m.printFizzBuzz(item);
        }
    }

    private void printFizzBuzz(int item) {

        if (!printNumber) {

            if (item % 3 == 0 && item % 5 == 0) {
                System.out.println("FizzBuzz");
                printNumber = true;
                return;
            }

            if (item % 3 == 0) {
                System.out.println("Fizz");
                printNumber = true;
                return;
            }

            if (item % 5 == 0) {
                System.out.println("Buzz");
                printNumber = true;
                return;
            }

            System.out.println(item);
            printNumber = false;

        } else {

            if ((item % 3 == 0 && item % 5 == 0) || (item % 5 == 0) || (item % 3 == 0))  {
                printNumber = false;
                printFizzBuzz(item);
                return;
            }

            System.out.println(item);
            printNumber = false;
            return;
        }
    }
}
