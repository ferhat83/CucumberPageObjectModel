package com.walmart.stepDef;

import com.walmart.utils.Generic;

import cucumber.api.java.Before;

public class SetUp {
	Generic generic;
	@Before  // must be in same glue code  package (step def)
	public void init() {
		generic.browserInit();
	
	}

}
