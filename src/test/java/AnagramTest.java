import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void ifIsAnagramTrue(){
        assertTrue(Anagram.isAnagram("ana", "naa"));
    }

    @Test
    void ifIsNotAnagramFalse(){
        assertFalse(Anagram.isAnagram("hello", "hlona"));
    }

}