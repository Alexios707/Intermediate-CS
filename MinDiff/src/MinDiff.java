import java.util.Array;

/* 
This problem is in the PClassic 2019f Problem Set (https://pclassic.org/problems)

During lunch time, your friend tells you that there will
be a broomflying pop quiz this afternoon. In the
Magical Learning Gym, there are n consecutives stones
in a row and each with a different height. To pass the
quiz, you need to successfully (and gracefully) fly from
a stone to the consecutive one. Since the smaller the
height difference is, the higher chance of you passing
the quiz is, thus, as a newbie, you want to find the
minimum difference between two consecutive stones. 

Extra Challenge: 
Return the INDEX of the stone that you should 
stand by in a new function, minDiffStone(). 
*/
public class MinDiff {
    public static void main(String[] args) {

        int arr[] = new int[] { 1, 34, 4, 6, 14, 2 };
        // Function call
        System.out.println("Minimum difference is " + findMinDiff(arr, arr.length));
    }
     // Returns minimum difference between any pair
     static int findMinDiff(int[] arr, int n) {
         // Sort array in non-decreasing order
         Arrays.sort(arr);
  
         // Initialize difference as infinite
         int diff = Integer.MAX_VALUE;
  
         // Find the min diff by comparing neighboring pairs in sorted array
         for (int i = 0; i < n - 1; i++)
             if (arr[i + 1] - arr[i] < diff)
                 diff = arr[i + 1] - arr[i];
  
         // Return min diff
         return diff;
    }
}