//fibonacci series is sum of two previous numbers
// 0,1,1,2,3,5,8,13


import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int a=0,b=1;
        int c;
        System.out.println("The fibonacci series is: ");
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n;i++){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
