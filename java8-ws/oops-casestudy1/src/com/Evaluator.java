package com;

public class Evaluator {
	
	private static Evaluator evaluator;
	
	private Evaluator() {}
	
	public static Evaluator getEvaluator() {
		if(evaluator== null) {
			return new Evaluator();
		}
		return evaluator;
	}
	
	public String evaluate(Paper paper) {
		// check paper answer sheet and send results
		return "Pass";
	}
	
	
	
}
