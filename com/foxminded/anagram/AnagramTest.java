package com.foxminded.anagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldThrowExceptionWhenInputIsNull() {
        Anagram anagram = new Anagram();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            anagram.reverseWordsExceptNonLetterSymbols(null);
        });
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReturnEmptyStringWhenInputIsEmptyString() {
        Anagram anagram = new Anagram();
        String expected = "";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReturnOneSpaceWhenInputIsOneSpace() {
        Anagram anagram = new Anagram();
        String expected = " ";
        String actual = anagram.reverseWordsExceptNonLetterSymbols(" ");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReturnSomeSpacesWhenInputIsSomeSpaces() {
        Anagram anagram = new Anagram();
        String expected = "   ";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("   ");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReturnOneLowercaseLetterWhenInputIsOneLowercaseLetter() {
        Anagram anagram = new Anagram();
        String expected = "a";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("a");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReturnOneUppercaseLetterWhenInputIsOneUppercaseLetter() {
        Anagram anagram = new Anagram();
        String expected = "S";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("S");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldNotReverseStringWhenInputIsOneNonLetterSymbol() {
        Anagram anagram = new Anagram();
        String expected = "!";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("!");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReturnSameLowercaseLettersWhenInputIsSameLowercaseLetters() {
        Anagram anagram = new Anagram();
        String expected = "aaaaaaa";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("aaaaaaa");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReturnSameUppercaseLettersWhenInputIsSameUppercaseLetters() {
        Anagram anagram = new Anagram();
        String expected = "ZZZZZ";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("ZZZZZ");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldNotReverseStringWhenInputIsSameNonLetterSymbols() {
        Anagram anagram = new Anagram();
        String expected = "&&&&&";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("&&&&&");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReverseAllSymbolsWhenInputIsOneLowercaseLettersWord() {
        Anagram anagram = new Anagram();
        String expected = "esacrewol";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("lowercase");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReverseAllSymbolsWhenInputIsOneUppercaseLettersWord() {
        Anagram anagram = new Anagram();
        String expected = "ESACREPPU";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("UPPERCASE");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReverseAllSymbolsWhenInputIsLowerAndUppercaseLettersWord() {
        Anagram anagram = new Anagram();
        String expected = "sTseTynaMoS";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("SoManyTesTs");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldNotReverseStringWhenInputIsNonLetterSequence() {
        Anagram anagram = new Anagram();
        String expected = "#$%^&*";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("#$%^&*");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReverseOnlyLetterSymbolsWhenInputIsOneWordWithDifferentSymbols() {
        Anagram anagram = new Anagram();
        String expected = "d1cBa";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("a1Bcd");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReturnSameLowercaseLetterWordsWhenInputIsSameLowercaseLetterWords() {
        Anagram anagram = new Anagram();
        String expected = "aaaaaaa aaaaaaaaaa aa";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("aaaaaaa aaaaaaaaaa aa");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReturnSameUppercaseLetterWordsWhenInputIsSameUppercaseLetterWords() {
        Anagram anagram = new Anagram();
        String expected = "AAA AAAA A";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("AAA AAAA A");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldNotReverseWordsWhenInputIsSameNonLetterSequences() {
        Anagram anagram = new Anagram();
        String expected = "*** ** *****";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("*** ** *****");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReverseEachWordWhenInputIsSomeLowercaseLetterWords() {
        Anagram anagram = new Anagram();
        String expected = "i ekil ot etirw stset";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("i like to write tests");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReverseEachWordWhenInputIsSomeUppercaseLetterWords() {
        Anagram anagram = new Anagram();
        String expected = "I EKIL OT ETIRW STSET";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("I LIKE TO WRITE TESTS");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReverseEachWordWhenInputIsLowerAndUppercaseLetterWords() {
        Anagram anagram = new Anagram();
        String expected = "tI si yM eTirovAF KSaT";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("It is My FAvoriTe TaSK");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldNotReverseStringWhenInputIsNonLetterSequences() {
        Anagram anagram = new Anagram();
        String expected = "#$%^&* &^%$#! ,,.(^#@";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("#$%^&* &^%$#! ,,.(^#@");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReverseOnlyLetterSymbolsInEachWordWhenInputIsDifferentSymbolWords() {
        Anagram anagram = new Anagram();
        String expected = "d1cBa %ts!eT& IaU&..ll *es%!Is,";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("a1Bcd %Te!st& llU&..aI *sI%!se,");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReverseOnlyLetterSymbolsInEachWordWhenInputIsDifferentSymbolWordsSeparatedBySomeSpaces() {
        Anagram anagram = new Anagram();
        String expected = "d1cBa   %ts!eT&  IaU&..ll *es%!Is,";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("a1Bcd   %Te!st&  llU&..aI *sI%!se,");
        assertEquals(expected, actual);
    }

    @Test
    void reverseWordsExceptNonLetterSymbols_ShouldReverseOnlyLetterSymbolsInEachWordWhenInputIsDifferentStyleWordsSeparatedBySomeSpaces() {
        Anagram anagram = new Anagram();
        String expected = "epohi   SISIHT  TSaLym te$T,) !!!!!!!";
        String actual = anagram.reverseWordsExceptNonLetterSymbols("ihope   THISIS  myLaST Te$t,) !!!!!!!");
        assertEquals(expected, actual);
    }
}