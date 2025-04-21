# ⚖️ BMI Calculator (Java Console App)

This is a simple Java console application that calculates your **Body Mass Index (BMI)** based on your weight and height inputs.

## 📚 What is BMI?

**BMI (Body Mass Index)** is a number calculated from a person’s weight and height. It's a useful screening tool to classify underweight, healthy weight, overweight, and obesity in adults.

## 🧮 Formula Used

```text
1. Convert weight from pounds to kilograms:
   weightInKg = weightInPounds × 0.453592

2. Calculate BMI:
   BMI = weightInKg / (heightInMeters × heightInMeters)
📊 BMI Classification

BMI Value	Category
Less than 18.5	Underweight
18.5 – 24.9	Healthy weight
25.0 – 29.9	Overweight
30.0 and above	Obese
🚀 How to Run (In Eclipse)
Open Eclipse

Create a Java project or use an existing one

Inside src/day4/, add the file BMICalculator.java

Right-click the file and select: Run As > Java Application

Follow the prompts in the console to enter your weight and height

🧪 Example Output
Please enter your weight in pounds: 
150
Please enter your height in meters: 
1.7
Your BMI is: 23.43711052816063
You are Healthy weight
📂 Project Structure
src/
└── day4/
    └── BMICalculator.java
📌 Requirements
Java 8 or higher

An IDE like Eclipse or IntelliJ

JDK properly configured in project build path

🛠️ Features
Converts weight from pounds to kilograms

Calculates BMI using standard formula

Prints health status based on BMI range

Validates results using if-else logic

💡 Future Improvements
Input validation (prevent negative or zero values)

Add support for height in feet/inches

Improve output formatting (round BMI to 2 decimal places)

👤 Author
This project was created as a Java beginner exercise to practice:

User input with Scanner

Conditional statements

Basic arithmetic and unit conversion
