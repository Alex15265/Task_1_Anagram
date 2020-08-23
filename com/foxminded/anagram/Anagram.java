package com.foxminded.anagram;

public class Anagram {
    public String reverseWordsExceptNonLetterSymbols(String text) {
        if (text == null) throw new IllegalArgumentException();

        String[] words = text.split(" ", -1);

        for (int i = 0; i < words.length; i++) {
            char[] symbols = words[i].toCharArray();
            int begin = 0;
            int end = symbols.length - 1;

            while (begin < end) {
                if (!Character.isAlphabetic(symbols[begin]))
                    begin++;
                else if (!Character.isAlphabetic(symbols[end]))
                    end--;
                else {
                    char tmp = symbols[begin];
                    symbols[begin] = symbols[end];
                    symbols[end] = tmp;
                    begin++;
                    end--;
                }
            }
            words[i] = new String(symbols);
        }

        return String.join(" ", words);
    }
}
