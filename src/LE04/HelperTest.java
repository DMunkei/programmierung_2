package LE04;
import static org.junit.jupiter.api.Assertions.*;

import LE02.Pizza;
import LE02.Salat;
import org.junit.jupiter.api.Test;

class HelperTest {
	Object[] feld = {2, "Hallo", "Hallo", new String("Hallo"), new Pizza(), new Salat(), new Pizza()};

	@Test
	void test() {
		for(Object o1:feld) {
			for(Object o2:feld) {
				if(o1.toString().length()>o2.toString().length())
					assertEquals(o1, Helper.stringLaenge(o1, o2), "Problem mit stringLaenge(..)");
				else
					assertEquals(o2, Helper.stringLaenge(o1, o2), "Problem mit stringLange(...)");
			}
		}
	}

}
