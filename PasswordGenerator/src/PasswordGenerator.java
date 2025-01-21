import java.util.Random;
import java.util.Scanner;
import java.util.HashSet;
public class PasswordGenerator {

    static int length;
    static Random random;
    static boolean upperCase;
    static boolean lowerCase;
    static boolean number;
    static boolean specialChar;
    static Scanner scanner;
    static HashSet<String> affrimativeSet;
    static HashSet<String> negativeSet;

    public static String generatePassword() {
        intializeMemebers();
        length = getLength();
        upperCase=getContainUppercase();
        lowerCase=getContainLowercase();
        number=getContainNumber();
        specialChar=getContainSpecialCharacter();
        String alphabets="abcdefghijklmnopqrstuvwxyz";
        String numbers="0123456789";
        String specialCharacters="!@#$%^&*()";
        if(!upperCase && !lowerCase && !number && !specialChar){
            System.out.println("Please enter altease two or more conditions to proceed ! ");
            return "";
        }
        String desiredCombination="";
        if(upperCase){
            desiredCombination+=alphabets.toUpperCase();
        }
        if(lowerCase){
            desiredCombination+=alphabets;
        }
        if(number){
            desiredCombination+=numbers;
        }
        if(specialChar){
            desiredCombination+=specialCharacters;
        }
        String generatedPassword="";
        for(int i = 0 ; i < length ; i++){
            generatedPassword+=desiredCombination.charAt(random.nextInt(desiredCombination.length()));
        }
        if(generatedPassword.length()<length){
            for(int i=generatedPassword.length() ; i<length ; i++){
                generatedPassword+=desiredCombination.charAt(random.nextInt(desiredCombination.length()));
            }
        }
        return generatedPassword;
    }
    public static void intializeMemebers(){
        scanner=new Scanner(System.in);
        random=new Random();
        affrimativeSet =new HashSet<String>();
        negativeSet=new HashSet<String>();
        initializeHashset();
    }
    public static void initializeHashset(){
        affrimativeSet.add("True");
        affrimativeSet.add("true");
        affrimativeSet.add("yes");
        affrimativeSet.add("Y");
        affrimativeSet.add("y");
        affrimativeSet.add("ok");

        negativeSet.add("False");
        negativeSet.add("false");
        negativeSet.add("no");
        negativeSet.add("N");
        negativeSet.add("n");
        negativeSet.add(" not ok");
    }
    public static boolean getContainUppercase(){
        System.out.println("Do you want to contain uppercase characters ? ");
        String response=scanner.nextLine().trim();
        System.out.println("Response: "+response);
        return affrimativeSet.contains(response);
    }
    public static boolean getContainLowercase(){
        System.out.println("Do you want to contain lowercase characters ? ");
        String response=scanner.nextLine().trim();
        return affrimativeSet.contains(response);
    }
    public static boolean getContainNumber(){
        System.out.println("Do you want to contain numbers ? ");
        String response=scanner.nextLine().trim();
        return affrimativeSet.contains(response);
    }
    public static boolean getContainSpecialCharacter(){
        System.out.println("Do you want to contain special characters ? ");
        String response=scanner.nextLine().trim();
        return affrimativeSet.contains(response);
    }
    public static int getLength(){
        System.out.println("Enter the length of the password : ");
        int recievedLength=scanner.nextInt();
        scanner.nextLine();
        return recievedLength;
    }
    public static void main(String[] args){
        System.out.println("The generated password is : "+PasswordGenerator.generatePassword());
    }
}