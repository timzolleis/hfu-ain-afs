package task01;

public interface Word {
    char position(final int k);

    int length();

    Word concat(final Word w);

    int count(final char c);

    Word replaceChar(final char char1, final char char2);

    int isSubstringOf(Word word);

    Word substring(final int start, final int length);

    Word replace(final Word word1, final Word word2);

}