package com.example.circletest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static java.lang.Thread.sleep;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CircleTestApplicationTests {

	@Test
	public void contextLoads() {

	}

	@Test
    public void takeALongTimeTest() throws InterruptedException {
	    sleep(5000);
    }

	// Uncomment this test to fail the Circle 'test' build step
	/*
	@Test
	public void failTestStep() {
		assert(false);
	}
	*/
}
