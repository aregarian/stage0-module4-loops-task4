package school.mjc.stage0.loops.task4;

import javax.swing.plaf.IconUIResource;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum = 0;
        int skippedNumber = 0;
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
        }else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {

            for (int i = 1; i <= lastInRow; i++) {
                if (i == numberToSkip) {
                    sum = sum + i;
                    skippedNumber = sum;
                    continue;
                }

                sum = sum + i;

            }
            sum = sum - skippedNumber;
            System.out.println("skipped sum is " + skippedNumber);
            System.out.println("counted sum is " + sum);
        }

    }
}
