package lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContArrayTest {
	private static ContArray a = new ContArray();
	
	@Test
	void testAdd() {
		a.add(1);
		a.add(2);
		a.add(3);
		String expected = a.to_string();
	    String actual = "1 2 3 ";
	    Assert.assertEquals(expected, actual);
	    a.del(0);
		a.del(1);
		a.del(2);
	}

	@Test
	void testGet() {
		a.add(1);
		a.add(2);
		a.add(3);
		int expected = a.get(1);
		int actual = 2;
		Assert.assertEquals(expected, actual);
		a.del(0);
		a.del(1);
		a.del(2);
	}

	@Test
	void testDel() {
		a.add(1);
		a.add(2);
		a.add(3);
		a.del(1);
		String expected = a.to_string();
	    String actual = "1 3 ";
	    Assert.assertEquals(expected, actual);
	    a.del(0);
		a.del(2);
	}

}
