package br.com.cod3r.app.calculation;

import br.com.cod3r.app.calculation.internal.ArithmericOperations;
import br.com.cod3r.app.logging.Logger;

public class Calculator {
	
	private String id = "abc";
	
	
	private ArithmericOperations aritOperations = new ArithmericOperations();

	public double sum(double... nums) {
		Logger.info("Somando");
		return aritOperations.sum(nums);
	}

	
	public String getId() {
		return id;
	}
	
}
