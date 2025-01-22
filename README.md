
```markdown
# TemperatureConverter

An exclusive repository to Convert Temperature.

## Description

This Java application converts temperatures between Celsius and Fahrenheit. The user can enter a temperature in Celsius to convert it to Fahrenheit, or enter a temperature in Fahrenheit to convert it to Celsius.

## Features

- Convert Celsius to Fahrenheit
- Convert Fahrenheit to Celsius

## Usage

1. Run the application.
2. Follow the on-screen prompts to choose a conversion type.
3. Enter the temperature you wish to convert.
4. The converted temperature will be displayed.

## Code

The main functionality is implemented in the `TemperatureConverter.java` file.

### Example Code

```java
import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureConverter {
    static Scanner scanner;
    static float celcius;
    static float fahrenheit;

    public static void initialize() throws InterruptedException {
        scanner = new Scanner(System.in);
        while(true) {
            System.out.print("\n");
            System.out.print("*".repeat(10) + "TEMPERATURE CONVERTER" + "*".repeat(10));
            System.out.print("\n");
            System.out.print("\n");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    celciusToFahrenheit();
                    break;
                case 2:
                    fahrenheitToCelsius();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    Thread.sleep(1000);
                    return;
                default:
                    System.out.println("Invalid choice, try again ");
            }
        }
    }

    private static void celciusToFahrenheit() throws InterruptedException {
        System.out.println();
        System.out.println("-".repeat(7) + "Celsius to Fahrenheit" + "-".repeat(7));
        System.out.println();
        System.out.println("Enter the temperature in Celsius: ");
        celcius = scanner.nextFloat();
        System.out.println("Converting from " + celcius + " ℃ to Fahrenheit...");
        Thread.sleep(1000);
        float result = (9.0f / 5.0f * celcius) + 32;
        System.out.println("The temperature in Fahrenheit is: " + new DecimalFormat("#.##").format(result) + "℉");
        Thread.sleep(3000);
    }

    private static void fahrenheitToCelsius() throws InterruptedException {
        System.out.println();
        System.out.println("-".repeat(7) + "Fahrenheit to Celsius" + "-".repeat(7));
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = scanner.nextFloat();
        System.out.println("Converting from " + fahrenheit + " ℉ to Celsius...");
        Thread.sleep(1000);
        float result = (fahrenheit - 32) * (5.0f / 9.0f);
        System.out.println("The temperature in Celsius is: " + new DecimalFormat("#.##").format(result) + " ℃");
        Thread.sleep(3000);
    }

    public static void main(String[] args) throws InterruptedException {
        TemperatureConverter.initialize();
    }
}
```

## How to Run

Compile and run the `TemperatureConverter.java` file using your preferred Java IDE or command line.

```sh
javac TemperatureConverter.java
java TemperatureConverter
```

## License

This project is licensed under the MIT License.
```
