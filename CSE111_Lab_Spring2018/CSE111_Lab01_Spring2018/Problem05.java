/*PROBLEM 5) Triangle - Right Justified
Draw right angled triangle of given height
Sample input:
4
Sample output
   1
  12
 123
1234*/

import java.util.Scanner;

public class Problem05{
    public static void main (String[]args){
 
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter row number");
        int row=sc.nextInt();
        
        for (int rc=1; rc<=row; rc++){
            for (int spc=1; spc<=row-rc; spc++){
                System.out.print(" ");
            }
            for (int cc=1; cc<=rc; cc++){
                System.out.print(cc);
            }
            System.out.println();
        }
    }
}