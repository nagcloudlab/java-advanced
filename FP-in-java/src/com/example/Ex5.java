package com.example;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

// Higher Order Programming / Functions ( HOP/HOF )

public class Ex5 {

	public static void main(String[] args) {

		Consumer<String> hi = name -> {
			System.out.println("hi " + name);
//			System.out.println("🌹");
		};

//		hi.accept("Nag");


		Consumer<String> hello = name -> {
			System.out.println("hello " + name);
//			System.out.println("🌹");
		};

//		hello.accept("flipkart");

		
		
		/*
		 *  design issues
		 *  
		 *  => code tangling / tight-coupling
		 *  => code scattering / code duplication
		 * 
		 * 
		 *  solution:
		 *  
		 *  
		 *  	in OOP :  proxy pattern
		 *      in FP  :  HOF
		 * 
		 */
		
		
		//-----------------------------------------------------
		
		// HOF
		UnaryOperator<Consumer<String>> withFlower=f->{
			return name->{
				f.accept(name);
				System.out.println("🌹");
			};
		};
		
		//------------------------------------------------------
		
		Consumer<String> hiWithFlower=withFlower.apply(hi);
		hiWithFlower.accept("flipkart");
		
		hi.accept("flipkart");
		
		//------------------------------------------------------
	}

}
