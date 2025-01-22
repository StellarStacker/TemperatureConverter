

# StudentGradeCalculator

An exclusive repository for StudentGradeCalculator in Java.

## Introduction

StudentGradeCalculator is a simple Java program designed to calculate the average of given grades. Users can input a number of grades, and the program will compute the average of valid grades between 0 and 100.

## Usage

To use the StudentGradeCalculator, follow these steps:

1. **Run the Program**: Execute the `main` method in the `StudentGradeCalculator` class.
2. **Input the Number of Grades**: The program will prompt you to enter the number of grades you want to calculate.
3. **Input Grades**: Enter each grade one by one. The program will validate that each grade is between 0 and 100.
4. **View the Average**: Once all valid grades are entered, the program will calculate and display the average of the grades.

## Code Overview

```java
import java.util.Scanner;

public class StudentGradeCalculator {
    int numberOfGrades;
    double[] gradeArray;
    Scanner scanner;
    int sumOfGrades;

    public static void main(String[] args) {
        new StudentGradeCalculator();
    }

    public StudentGradeCalculator() {
        sumOfGrades = 0;
        scanner = new Scanner(System.in);
        numberOfGrades = getNumberOfGrades();
        gradeArray = new double[numberOfGrades];
        gradeArray = getGrades();
        System.out.println("The Average of grades is " + getAverage());
    }

    public double[] getGrades() {
        double[] tempArray = new double[numberOfGrades];
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            if (grade > 0 && grade <= 100) {
                tempArray[i] = grade;
            } else {
                System.out.println("Invalid grade");
                i--;
            }
        }
        return tempArray;
    }

    public double getAverage() {
        if (gradeArray.length == 0) {
            System.out.println("Kindly enter grades first");
        } else if (gradeArray.length == 1) {
            return gradeArray[0] / sumOfGrades;
        }
        for (int i = 0; i < gradeArray.length; i++) {
            sumOfGrades += gradeArray[i];
        }
        return sumOfGrades / numberOfGrades;
    }

    public int getNumberOfGrades() {
        System.out.println("Enter a number of grades you want to calculate: ");
        return scanner.nextInt();
    }
}
```

## Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/StellarStacker/StudentGradeCalculator.git
   cd StudentGradeCalculator
   ```

2. **Compile and Run the Program**:
   ```bash
   javac StudentGradeCalculator.java
   java StudentGradeCalculator
   ```

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License.
