package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 1;
        int facts = 1;
        while (i < printToInclusive + 1) {
            facts *= i;
            i++;
            System.out.println(facts);
        }

    }
}
