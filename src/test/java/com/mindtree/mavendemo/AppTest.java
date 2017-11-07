package com.mindtree.mavendemo;

import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void testGreetings() {
		App appObj=new App();
		Assert.assertNotNull(appObj.getGreetings());	
	}
}