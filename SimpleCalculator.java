import java.util.*;
public class SimpleCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no a = ");
        int a= sc.nextInt();
        System.out.print("Enter no b = ");
        int b= sc.nextInt();
        double c=a+b,d=Math.abs(a-b),e=a*b,f=a/b,g=a%b;
        System.out.print("Sum="+c+"DIFF="+d+"MUL="+e+"DIV="+f+"MOD="+g);

    }
}