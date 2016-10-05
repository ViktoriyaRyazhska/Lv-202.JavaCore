package less3_2;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestMaxMin {
	MaxMin maxmin = new MaxMin();

	@Test
	public void testMax(){
		assertTrue(maxmin.Max(1, 10, 5)==10);

	}
	@Test
	public void testMin(){
		int actual = 1;
        int expected = maxmin.Min(7, 2, 1);
        assertEquals(actual, expected);

		
	}

}
