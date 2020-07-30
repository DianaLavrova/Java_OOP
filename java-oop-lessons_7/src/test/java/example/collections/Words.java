package example.collections;

import java.util.*;

public class Words {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("mama", "dog", "word", "pop", "mama", "dog", "word", "pop", "mama", "dog", "word", "pop");

        HashSet<String> uniqueWords = new HashSet<>(words);
        for(String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
