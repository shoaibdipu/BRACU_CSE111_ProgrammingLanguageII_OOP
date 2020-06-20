/*
2. Write a Java program that will ask the user to enter 10 numbers 
   and will verify the users input after each entry. 
   For example if the user enters 2, the program will print “You have entered 2”.
   This will go on till the user enters the 10 numbers.
 */

import java.util.*;

public class lab0202task02{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        int [] a = new int [10];
        
        for(int i=0; i<a.length; i++){
            System.out.println("Enter A Number: ");
            a[i]=sc.nextInt();
            System.out.println("You Have Entered "+a[i]);
            System.out.println();
        }
    }
}
