package com.mydbpattern.db.mysql;

import org.junit.Assert;
import org.junit.Test;

public class ProfileTest {
	@Test
	public void testLoadDBConfig() {
		var prop = Profile.getProperties("db");
		Assert.assertNotNull("can not load db properties", prop);
		
	
		
	}
}
