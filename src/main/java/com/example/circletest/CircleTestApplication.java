package com.example.circletest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CircleTestApplication {

	public static void main(String[] args) {
		try {
			something(1);
		} catch (Exception e) {
		}

		SpringApplication.run(CircleTestApplication.class, args);
	}

	// Uncomment this test to fail the Circle 'sonar' build step
	public static void something(int param) throws Exception {
		switch (param) {
			case 0:
				System.out.println("BLAH");
				break;
			default:
				throw new Exception();
			case 1:
				System.out.println("BLAH TWICE");
				break;
		}
	}
}
