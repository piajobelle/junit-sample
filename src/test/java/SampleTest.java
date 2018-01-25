

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {
	
	@Test
	public void simpleTestPassed() {
		MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);
 		
 		}
 	}
