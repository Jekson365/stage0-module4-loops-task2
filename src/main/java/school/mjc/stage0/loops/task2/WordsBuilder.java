package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String res = "";
        int i = 0;
        while (i < chars.length) {
            res += chars[i];
            i++;
        }

        System.out.println(res);
    }
}
