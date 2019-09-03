package com.example.circletest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.Thread.sleep;

@SpringBootApplication
public class CircleTestApplication {
	public static void main(String[] args) {
		try {
			sleep(1);
		} catch (InterruptedException ignore) {
		}
		SpringApplication.run(CircleTestApplication.class, args);
	}
}
