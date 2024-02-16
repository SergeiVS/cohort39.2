import org.junit.Test;

import static org.junit.Assert.*;

public class LetterCountFromTextTest {

    LetterCountFromText lc = new LetterCountFromText();

    @Test
    public void testCountLetter(){
        assertEquals(3, lc.countLetter("Hello World"));
    }

    @Test
    public void testCountLetterZero(){
        assertEquals(0, lc.countLetter("bcdfgh"));
    }

    @Test
    public void testCountEmptyText(){
        assertEquals(0, lc.countLetter(""));
    }

}