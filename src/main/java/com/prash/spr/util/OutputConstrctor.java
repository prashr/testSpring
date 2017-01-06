package com.prash.spr.util;

import com.prash.spr.core.OutputHelper;

public class OutputConstrctor {
	
	private OutputHelper outputHelper = null;
	
	public OutputConstrctor(OutputHelper helper) {
		this.outputHelper =helper;
		// TODO Auto-generated constructor stub
	}
	
	public OutputHelper getBean(){
		return this.outputHelper;
	}

}
