import java.util.Scanner;

class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    // System.out.print("Enter an integer: ");
    int n = in.nextInt();
    
    for(int i = n; i >= 1; i--)  //5,4,3,2,1 
    {
        for(int j = 1; j <= i; j++)  //1,2,3,4,5 
        {
            System.out.print("*");
        }
        System.out.println();
    }
  }
}
