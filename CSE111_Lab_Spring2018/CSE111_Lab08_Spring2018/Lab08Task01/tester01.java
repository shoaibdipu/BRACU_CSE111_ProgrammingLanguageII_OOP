import java.util.*;

public class tester01{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of Circle: ");
        double inputC = sc.nextDouble();
        
        Circle c = new Circle(inputC);
        System.out.println("The area of the Circle is "+c.space());
        
        System.out.println("Enter radius of Sphere: ");
        double inputS = sc.nextDouble();
        
        Sphere s = new Sphere(inputS);
        System.out.println("The area of the Sphere is "+s.space());
    }
}

        
        