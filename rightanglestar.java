/*
---------------------------------------------------------
Question: Right Angle Star Pattern

Problem Statement:
Write a Java program to print a right-angled triangle
star pattern for a given number of rows (n).

Example:

Input:
5

Output:
*
**
***
****
*****

Logic:
1. The outer loop (i) controls the number of rows. increasing
2. The inner loop (j) controls the number of stars in each row.increasing
3. In row i, print exactly i stars.
4. After printing each row, move to the next line.

Time Complexity: O(n²)
Space Complexity: O(1)
---------------------------------------------------------
*/
import java.util.*;
public class rightanglestar{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}

    
           