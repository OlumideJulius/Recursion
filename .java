import java.io. *;
import java .utill. *;

public class  PrintDeacreasing {

    public static void main(string[] args) throws Exception
    // Create a Scanner object to read input from the user
    Scanner scn = new Scanner(System.in);

    // Prompt the user to enter a number (n)
    System.out.print("Enter a number: ");
    int n = scn.nextInt();

    //Call the method to print numbers decreasing from n to 1
    printDecreasing(n);
    }

    // Method to print decreasing numbers from n to 1
    public static void printDecreasing(int n) {
