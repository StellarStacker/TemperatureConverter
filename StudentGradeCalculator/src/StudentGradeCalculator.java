import java.util.Scanner;
public class StudentGradeCalculator{
    int numberOfGrades;
    double[] gradeArray;
    Scanner scanner;
    double sumOfGrades;

    public static void main(String[] args) {
        new StudentGradeCalculator();
    }
    public StudentGradeCalculator(){
        sumOfGrades = 0;
        scanner = new Scanner(System.in);
        numberOfGrades = getNumberOfGrades();
        gradeArray = new double[numberOfGrades];
        gradeArray = getGrades();
        System.out.println("The Average of grades is "+getAverage());
    }
    public double[] getGrades(){
        double[] tempArray = new double[numberOfGrades];
        for(int i = 0; i < numberOfGrades ; i++){
            System.out.print("Enter grade " + (i+1) + ": ");
            double grade=scanner.nextDouble();
            if(grade > 0 && grade <= 100){
                tempArray[i]=grade;
            }
            else {
                System.out.println("Invalid grade");
                i--;
            }
        }
        return tempArray;
    }
    public double getAverage(){
        if(gradeArray.length == 0){
            System.out.println("Kindly enter grades first");
        }else if(gradeArray.length == 1){
            return gradeArray[0]/sumOfGrades;
        }
        for(int i = 0;i < gradeArray.length; i++){
             sumOfGrades += gradeArray[i];
        }
        return sumOfGrades / numberOfGrades;
    }
    public int getNumberOfGrades(){
        System.out.println("Enter a number of grades you want to calculate : ");
        return scanner.nextInt();
    }

}