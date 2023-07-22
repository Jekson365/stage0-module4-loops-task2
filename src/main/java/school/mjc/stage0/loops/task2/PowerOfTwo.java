package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 1;
        int k = 2;
        while (i < power) {
            k *= i;
            i++;
            System.out.println(k);
        }
    }
}
