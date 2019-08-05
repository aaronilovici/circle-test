package com.example.circletest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CircleTestApplication {

	public static void main(String[] args){
		SpringApplication.run(CircleTestApplication.class, args);
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

	public static void lastbutnotleast(int param) throws NullPointerException {
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
}
