package task01;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


public class WordImplTest {

    @Test
    void testKonstruktor() {
        String s = "Automaten und Formale Sprachen";
        Word w1 = new WordImpl(s);
        for (int i = 1; i <= w1.length(); i++) {
            assertEquals(w1.position(i), s.charAt(i - 1));
        }
        Word w2 = new WordImpl("");
        Word w3 = new WordImpl("");
        assertEquals(w2, w3);
    }

    @Test
    void testLaenge() {
        assertEquals(30, new WordImpl("Automaten und Formale Sprachen").length());
        assertEquals(1, new WordImpl("A").length());
        assertEquals(3, new WordImpl("   ").length());
        assertEquals(0, new WordImpl("").length());
    }

    @Test
    void testPosition() {
        assertEquals('a', new WordImpl("a").position(1));
        assertEquals('a', new WordImpl("ba").position(2));
        assertEquals('c', new WordImpl("abc").position(3));
        assertEquals(' ', new WordImpl("          ").position(6));
        assertNotEquals('x', new WordImpl("          ").position(6));
        assertNotEquals('c', new WordImpl("abc").position(1));
        assertNotEquals('c', new WordImpl("abc").position(2));
    }

    @Test
    void testEquals() {
        assertEquals(new WordImpl("Automaten"), new WordImpl("Automaten"));
        assertEquals(new WordImpl(""), new WordImpl(""));
        assertEquals(new WordImpl(" "), new WordImpl(" "));
        assertNotEquals(new WordImpl(""), new WordImpl(" "));
        assertNotEquals(new WordImpl(" "), new WordImpl(""));
    }

    @Test
    void testKonkateniere() {
        assertEquals(new WordImpl(""), new WordImpl("").concat(new WordImpl("").concat(new WordImpl(""))));
        assertEquals(new WordImpl("xyz"), new WordImpl("xyz").concat(new WordImpl("")));
        assertEquals(new WordImpl("xyz"), new WordImpl("").concat(new WordImpl("xyz")));
        assertEquals(new WordImpl("xyz123"), new WordImpl("xyz").concat(new WordImpl("123")));
        assertEquals(new WordImpl("abc"), new WordImpl("a").concat(new WordImpl("b").concat(new WordImpl("c"))));
        assertNotEquals(new WordImpl("ba"), new WordImpl("a").concat(new WordImpl("b")));
        assertNotEquals(new WordImpl("b"), new WordImpl(" ").concat(new WordImpl("b")));
        assertNotEquals(new WordImpl("b"), new WordImpl(" ").concat(new WordImpl("b")));
        assertEquals(new WordImpl("b"), new WordImpl("").concat(new WordImpl("b")));
        assertEquals(new WordImpl("b"), new WordImpl("b").concat(new WordImpl("")));
    }

    @Test
    void testAnzahl() {
        Word w1 = new WordImpl("___ aaabbbcccaaa");
        assertEquals(6, w1.count('a'));
        assertEquals(0, w1.count('d'));
        assertEquals(1, w1.count(' '));
        assertEquals(3, w1.count('_'));
        assertEquals(0, new WordImpl("").count('d'));
    }

    @Test
    void testTausche() {
        Word w1 = new WordImpl("hoch");
        Word w2 = new WordImpl("aaabbbccc");

        assertEquals(new WordImpl("_oc_"), w1.change('h', '_'));
        assertEquals(new WordImpl("aaabbbccc"), w2.change('d', 'c'));
        assertEquals(new WordImpl("aaabbbccc"), w2.change('c', 'c'));
        assertEquals(w2, w2.change('a', 'd').change('d', 'a'));
    }

    @Test
    void testIstTeilWord() {
        Word w1 = new WordImpl("abcdef");
        Word w2 = new WordImpl("aaaabbbbb");

        assertEquals(1, w1.isSubstringOf(w1));
        assertEquals(0, w1.isSubstringOf(new WordImpl("aaabbbcccd")));
        assertEquals(3, w1.isSubstringOf(new WordImpl("cde")));
        assertEquals(3, w2.isSubstringOf(new WordImpl("aabb")));
        assertEquals(0, w2.isSubstringOf(new WordImpl("aaaaa")));
        assertEquals(0, w2.isSubstringOf(new WordImpl("bbbbbb")));
        assertEquals(5, w2.isSubstringOf(new WordImpl("bbbbb")));
        assertEquals(3, new WordImpl("ababba").isSubstringOf(new WordImpl("abb")));
    }

    @Test
    void testErsetze() {
        Word w = new WordImpl("abcdefg");
        Word w1 = new WordImpl("abcdefg");
        Word w2 = new WordImpl("abcdefgh");

        assertEquals(w, w.replace(w1, w1));
        assertEquals(w, w.replace(w, w1));
        assertEquals(w2, w.replace(w1, w2));
        assertEquals(new WordImpl("abdcefg"), w.replace(new WordImpl("cd"), new WordImpl("dc")));

        Word v1 = new WordImpl("Winter");
        Word v2 = v1.replace(new WordImpl("te"), new WordImpl("ne"));
        assertEquals(new WordImpl("Winner"), v2);
        assertEquals(new WordImpl("Sommer"), v1.replace(v1, new WordImpl("Sommer")));
        assertEquals(new WordImpl("Winter"),
                v1.replace(v1, new WordImpl("Sommer")).replace(new WordImpl("Sommer"), new WordImpl("Winter")));
    }

    @Test
    void testsubstring() {
        Word w1 = new WordImpl("Guten Morgen");
        Word w2 = w1.substring(7, 6);
        assertEquals(new WordImpl("Morgen"), w2);

        Word w3 = w2.substring(2, 2);
        assertEquals(new WordImpl("or"), w3);
        assertEquals(new WordImpl(""), w1.substring(7, 6).substring(2, 0));

        assertEquals(new WordImpl("Guten Morgen"), w1.substring(1, 12));
        assertNotEquals(new WordImpl("Guten Morgen"), w1.substring(1, 11));
    }
}
