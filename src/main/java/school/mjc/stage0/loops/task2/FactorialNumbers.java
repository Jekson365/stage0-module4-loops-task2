package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void main(String[] args) {
        FactorialNumbers f=  new FactorialNumbers();
        f.printFactorialRow(5);
    }
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
