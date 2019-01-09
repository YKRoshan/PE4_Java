import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindNameHarryTest {
    FindNameHarry findNameHarry;
    @Before
    public void setUp() {
        findNameHarry = new FindNameHarry();
    }

    @After
    public void tearDown() {
        findNameHarry = null;
    }

    @Test
    public void findNameHarrySuccess() {
        String input = "This is Harry.";
        boolean actual = findNameHarry.findNameHarry(input,"Harry");
        boolean expected = true;
        assertEquals(expected,actual);
    }
    @Test
    public void findNameHarryFail() {
        String input = "This is Henry.";
        boolean actual = findNameHarry.findNameHarry(input,"Harry");
        boolean expected = true;
        assertNotEquals(expected,actual);
    }
}