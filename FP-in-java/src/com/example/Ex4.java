package com.example;

import java.util.function.IntPredicate;

public class Ex4 {

	public static IntPredicate and(IntPredicate f1, IntPredicate f2) {
		return n -> f1.test(n) && f2.test(n);
	}

	public static void main(String[] args) {

		IntPredicate isMin = n -> n >= 100;
		IntPredicate isMax = n -> n <= 1000;

		IntPredicate isMinAndIsMax = and(isMin, isMax);
		
		System.out.println(
				isMinAndIsMax.test(100)
		);

	}

}
