import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindOccurrencesOfWordTest {
    FindOccurrencesOfWord findOccurrencesOfWord;
    @Before
    public void setUp() {
        findOccurrencesOfWord = new FindOccurrencesOfWord();
    }

    @After
    public void tearDown() {
        findOccurrencesOfWord = null;
    }

    @Test
    public void findOccurrencesOfWordSuccess() {
        String input = "She sells seashells by the seashore ";
        String check = "se";
        String actual = findOccurrencesOfWord.findOccurrencesOfWord(check,input);
        String expected = " Found at: 4-6" + " Found at: 10-12" + " Found at: 27-29";
        assertEquals(expected,actual);
    }

    @Test
    public void findOccurrencesOfWordFail() {
        String input = "She sells seashells by the seashore ";
        String check = "ll";
        String actual = findOccurrencesOfWord.findOccurrencesOfWord(check,input);
        String expected = " Found at: 5-7" + " Found at: 9-11" + " Found at: 20-23";
        assertNotEquals(expected,actual);
    }
}