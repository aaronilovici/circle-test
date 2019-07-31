package com.example.circletest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class CircleTestApplication {

	private List<Integer> list = Arrays.asList(1, 2, 3, 4);
	private List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
	private List<Integer> list5 = Arrays.asList(1, 2, 3, 4);

	public static void main(String[] args) {
		try {
			something(1);
		} catch (NullPointerException e) {
		}

		SpringApplication.run(CircleTestApplication.class, args);
	}

	// Uncomment this test to fail the Circle 'sonar' build step
	public static void something(int param) throws NullPointerException {
		switch (param) {
			case 0:
				System.out.println("BLAH");
				break;
			default:
				throw new NullPointerException();
			case 1:
				System.out.println("BLAH TWICE");
				break;
		}
	}

	public static void somethingelse(int param) throws NullPointerException {
		switch (param) {
			case 0:
				System.out.println("BLAH");
				break;
			default:
				throw new NullPointerException();
			case 1:
				System.out.println("BLAH TWICE");
				break;
		}
	}

	public static void somethingalso(int param) throws NullPointerException {
		switch (param) {
			case 0:
				System.out.println("BLAH");
				break;
			default:
				throw new NullPointerException();
			case 1:
				System.out.println("BLAH TWICE");
				break;
		}
	}

	public static int lastbutnotleast(int param) throws NullPointerException {
		if (param == 1) {
			param =+ 1;
		}
 		return param;
	}

	public String badCode () {
		list.add(1);
		return "THIS IS BAD CODE";
	}

	public String alsoBadCode () {
		list.add(1);
		return "THIS IS BAD CODE";
	}
}
