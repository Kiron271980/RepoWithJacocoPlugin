package com.TestJacocoplugin.controller;

import static org.mockito.Mockito.mock;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class TestController {

	@Mock
	TestController MockTestController= mock(TestController.class);
	
	@Test
	public void testctrl() {
	assertNotNull(MockTestController.hashCode());
	}

	private void assertNotNull(int hashCode) {
		// TODO Auto-generated method stub
		
	}
}
