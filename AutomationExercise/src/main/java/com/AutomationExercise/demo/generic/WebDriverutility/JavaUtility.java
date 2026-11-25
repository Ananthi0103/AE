package com.AutomationExercise.demo.generic.WebDriverutility;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Random;

public class JavaUtility {
 public int getRandomNum() {
	 Random r=new Random();
	 int randValue = r.nextInt(5000);
	 return randValue;
 }
		
}
