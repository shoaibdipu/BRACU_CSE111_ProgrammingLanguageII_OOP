/*
Task 3: Write a java program that reads 10 numbers from the user, 
and then prints them in the reverse order. */

import java.util.*;

public class lab0201task03{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int [] a = new int [10];
        
        for(int i=0; i<a.length; i++){
            System.out.println("Enter A Number: ");
            a[i]=sc.nextInt();
        }
        
        for(int c=a.length-1; c>=0; c--){
            System.out.println(a[c]);
        }
    }
}

        
        