package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 1;
        int mulitiplied = 1;
        while (i < multiplyByAndToInclusive) {
            mulitiplied *= i;
            System.out.println(mulitiplied);
            i++;
        }
    }
}
