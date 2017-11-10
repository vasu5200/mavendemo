package com.mindtree.mavendemo;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestAdd {

	@Test
	public void test() {
		App obj = new App();
		assertEquals(10, obj.add(5, 5));
	}

}
