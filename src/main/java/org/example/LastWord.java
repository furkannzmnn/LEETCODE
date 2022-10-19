package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LastWord {
    public int lengthOfLastWord(String s) {
        final String[] arr = s.split(" ");
        final List<String> strings = Arrays.stream(arr)
                .filter(each -> each.length() > 0)
                .collect(Collectors.toList());

        return strings.get(strings.size() -1).length();
    }

    public static void main(String[] args) {
        new LastWord().lengthOfLastWord("a");
    }
}
