package collectorsproblems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "apple orange apple banana orange apple mango";
        Map<String, Long> wordCount = Arrays.stream(paragraph.split(" "))
            .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(wordCount);
    }
}