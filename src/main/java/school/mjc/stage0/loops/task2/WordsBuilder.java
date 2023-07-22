package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public static void main(String[] args) {
        WordsBuilder w = new WordsBuilder();
        w.buildPhrase('a','b','c','d');
    }
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
