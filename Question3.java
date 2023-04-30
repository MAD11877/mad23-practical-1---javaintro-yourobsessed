import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = scanner.nextInt();
    
    int result = num*num; 
    
    System.out.println("Result: " + result);  //printf: for formatted printing of data; println: for printing plain text
    
  }
}
