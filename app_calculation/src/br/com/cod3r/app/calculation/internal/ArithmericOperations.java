package br.com.cod3r.app.calculation.internal;

import java.util.Arrays;

public class ArithmericOperations {
	
	public double sum(double... nums) {
		return Arrays.stream(nums).reduce(0.0, (total, actual) -> total + actual);
	}

}
