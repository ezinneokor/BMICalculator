package day4;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your weight in pounds: ");
		double weightInPounds = scanner.nextDouble();
		System.out.println("Please enter your height in meters: ");
		double heightInMeters = scanner.nextDouble();
		
		//convert pounds to kg by multiplying the given pound value and 0.45359237
		double weightInKg = weightInPounds * 0.453592;
		
		//BMI formula: weight (kg) / height² (m²).
		double bmi = weightInKg/(heightInMeters*heightInMeters);
		System.out.println("Your BMI is: " + bmi);
		
		if(bmi < 18.5){
			System.out.println("You are Underweight");	
		}
		else if(bmi >=18.5 &&bmi < 24.9){
			System.out.println("You are Healthy weight");	
		}
		else if(bmi >=25.0 && bmi < 29.9){
			System.out.println("You are Overweight");	
		}
		else{
			System.out.println("You are Obese");	
		}
		scanner.close();
	}

}
