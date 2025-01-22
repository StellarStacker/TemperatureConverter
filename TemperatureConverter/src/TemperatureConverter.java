import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureConverter{
    static Scanner scanner;
    static float celcius;
    static float fahrenheit;

    public static void initialize() throws InterruptedException {
        scanner = new Scanner(System.in);
        while(true){
            System.out.print("\n");
            System.out.print("*".repeat(10)+"TEMPERATURE CONVERTER"+"*".repeat(10));
            System.out.print("\n");
            System.out.print("\n");
            System.out.println("1. Celcius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celcius ");
            System.out.println("3. Exit");
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    celciusToFahrenheit();
                    break;
                case 2:
                    fahrenheitToCelcius();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    Thread.sleep(1000);
                    return;
                default:
                    System.out.println("Invalid choice try again ");
            }
        }
    }
    private static void celciusToFahrenheit() throws InterruptedException{
        System.out.println();
        System.out.println("-".repeat(7)+"Celcius to Fahrenheit"+"-".repeat(7));
        System.out.println();
        //handling the logic here
        System.out.println("Enter the temperature in Celcius : ");
        celcius=scanner.nextFloat();
        System.out.println("Converting from "+celcius+" ℃"+" to Fahrenheit...");
        Thread.sleep(1000);
        float result=(9.0f/5.0f * celcius) + 32;
        System.out.println("The temperature in Fahrenheit is : "+ new DecimalFormat("#.##").format(result) +"℉");
        Thread.sleep(3000);
    }

    private static void fahrenheitToCelcius() throws InterruptedException{
        System.out.println();
        System.out.println("-".repeat(7)+"Fahrenheit to Celcius"+"-".repeat(7));
        //handling the logic here
        System.out.println("Enter the temperature in Fahrenheit : ");
        System.out.print("\n");
        fahrenheit=scanner.nextFloat();
        System.out.println("Converting from "+fahrenheit+" ℉"+" to Celcius...");
        Thread.sleep(1000);
        float result=(fahrenheit-32)*(5.0f/9.0f);
        System.out.println("The temperature in Celcius is : "+ new DecimalFormat("#.##").format(result) +" ℃" );
        Thread.sleep(3000);
    }
    public static void main(String[] args) throws InterruptedException {
        TemperatureConverter.initialize();
    }
}