package school.mjc.stage0.conditions.task4;

import org.w3c.dom.ls.LSOutput;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result = first>second ? 10: -10;
        System.out.println(result);
    }
}
