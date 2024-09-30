package task01;

import lombok.Getter;

@Getter
public class WordImpl implements Word {

    public final String contents;

    public WordImpl(final String contents) {
        this.contents = contents;
    }


    public final char position(final int k) {
        final int index = k - 1;
        if (index < 0 || index > this.contents.length()) {
            throw new IndexOutOfBoundsException("Index" + index + " out of bounds");
        }
        return this.contents.charAt(index);
    }

    public final int length() {
        return this.contents.length();
    }

    public final Word concat(Word word) {
        final String newContents = this.contents.concat(word.getContents());
        return new WordImpl(newContents);
    }

    public final int count(char c) {
        return (int) this.contents.chars().filter(character -> character == c).count();
    }

    public final Word replaceChar(char char1, char char2) {
        final String newContents = this.contents.replace(char1, char2);
        return new WordImpl(newContents);
    }

    public final int isSubstringOf(Word word) {
        final int index = this.contents.indexOf(word.getContents());
        return index == -1 ? 0 : index + 1;
    }

    public final Word substring(int start, int length) {
        final int startIndex = start - 1;
        final int endIndex = start + length - 1;
        return new WordImpl(this.contents.substring(startIndex, endIndex));
    }

    public final Word replace(Word word1, Word word2) {
        final String contentToReplace = word1.getContents();
        final String replacementContent = word2.getContents();
        final String newContents = this.contents.replace(contentToReplace, replacementContent);
        return new WordImpl(newContents);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WordImpl word)) {
            return false;
        }
        return this.contents.equals(word.contents);
    }
}
