package com.sample;

import org.junit.Assert;
import org.junit.Test;

import com.sample.App;

/**
 * Unit test for simple Application.
 */
public class AppTest {
	
	@Test
	public void testApp() {
		App appObject = new App();
		Assert.assertEquals(appObject.reverseString("Test!"), "!tseT");
	}
}
