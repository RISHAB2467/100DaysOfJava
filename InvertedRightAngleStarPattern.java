/*
Question: Inverted Right Angle Star Pattern

Logic:
- Outer loop decides the row. decreasing (i)
- Inner loop prints stars.increaisng (j)
- Every new row has one less star than the previous row.
*/
import java.util.*;
public class InvertedRightAngleStarPattern{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n= ");
        int n=sc.nextInt();
        for (int i= n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}