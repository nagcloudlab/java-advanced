package com.example;

import java.util.function.Consumer;

public class Ex6 {

	public static void main(String[] args) {

		//
		Consumer<String> consoleLogger = log -> System.out.println(log);

		Consumer<String> fileLogger = log -> System.out.println("file: " + log);

		String logMessage = "day-1 session ends here";
		
//		
//		consoleLogger.accept(logMessage);
//		fileLogger.accept(logMessage);

		Consumer<String> combinedLogger=consoleLogger.andThen(fileLogger);
		combinedLogger.accept(logMessage);
		
	}

}
