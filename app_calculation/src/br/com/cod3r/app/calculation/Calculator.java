package br.com.cod3r.app.calculation;

import br.com.cod3r.app.calculation.internal.ArithmericOperations;

public class Calculator {
	
	private ArithmericOperations aritOperations = new ArithmericOperations();

	public double sum(double... nums) {
		return aritOperations.sum(nums);
	}

}
