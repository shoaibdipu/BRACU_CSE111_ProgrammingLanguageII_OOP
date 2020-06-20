/*
1. Write a Java program that would input ten numbers from 
the user and print the ten numbers in reverse order.
*/

import java.util.*;

public class lab0202task01{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int [] a = new int [10];
        
        for(int i=0; i<a.length; i++){
            System.out.println("Enter A Number: ");
            a[i]=sc.nextInt();
        }
        
        for(int j=a.length-1; j>=0; j--){
            System.out.print(a[j]+" ");
        }
    }
}

                