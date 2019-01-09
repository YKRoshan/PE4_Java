import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString transposeString;
    @Before
    public void setUp() {
        transposeString = new TransposeString();
    }

    @After
    public void tearDown() {
        transposeString =null;
    }

    @Test
    public void transposeString() {
        String []expected = {"a","kciuq","nworb","xof","spmuj","revo","eht","yzal","god" };
        String []actual = transposeString.transposeString("a quick brown fox jumps over the lazy dog");
        assertArrayEquals(expected,actual);
    }
}