package comm.demo;


import java.util.TreeMap;

public class LetterSequence {
    private String sentence;

    public TreeMap<Character, Integer> computeFrequency(String sentence) {
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            Integer val = map.get(new Character(c));
            if (val != null) {
                map.put(c, new Integer(val + 1));
            } else {
                map.put(c, 1);
            }

        }

        map.forEach((key, value) -> {
            int count = value;
            System.out.printf("%c : ", key);
            for (int i = 0; i < count; i++)
                System.out.printf("*");

            System.out.printf("\n");
        });

        return null;
    }
}
