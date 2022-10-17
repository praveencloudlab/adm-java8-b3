package com;

public class Paper {

	public String submit() {
		System.out.println("student is appered for the exam..");
		Evaluator evaluator = Evaluator.getEvaluator();
		return evaluator.evaluate(this);
	}

}
