package com.example.circletest;

import static java.lang.Thread.sleep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
