package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int q = (first>second ? first : second);
        int e = (q>third ? q : third);
        System.out.println(e);
    }
}
