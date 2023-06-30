import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        /**
         * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
         * Print out the mode (highest occurrence) from the set of integers. 
         *    e.g.
         *     > 5
         *     > 2
         *     > 4
         *     > 1
         *     > 3
         *     > 4
         *     4
         * 
         *    e.g.
         *     > 4
         *     > 2
         *     > 2
         *     > 3
         *     > 3
         *     2
         * Hint: Use a loop to get input. Use another 2 loops to find the mode
         */
         
        Scanner in = new Scanner(System.in);
        
        // Prompt the user for the number of integers to enter
        // System.out.print("Enter the number of integers to enter: ");
        int n = in.nextInt();
        
        // Create an array to hold the integers entered by the user
        int[] nums = new int[n];
        
        // Prompt the user to enter n integers
        for (int i = 0; i < n; i++) {
            // System.out.print("Enter integer " + (i+1) + ": ");
            nums[i] = in.nextInt();
        }
        
        // Find the mode of the set of integers entered
        int mode = nums[0];
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = nums[i];
            }
        }
        
        // Print the mode
        System.out.println(mode);
    }
}

