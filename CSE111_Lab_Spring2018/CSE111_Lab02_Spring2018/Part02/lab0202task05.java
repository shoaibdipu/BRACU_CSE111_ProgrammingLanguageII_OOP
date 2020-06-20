/*5. The current in an alternating current circuit that contains resistance,
capacitance, and inductance in series is given by


Where I=current (amperes), E=voltage (volts), R= resistance (ohms),
L= inductance (henrys), C= capacitance (farads) and f=frequency (hertz). 
Write a Java program that reads values for the voltage, resistance, inductance, 
capacitance and frequency, and then calculates and displays current.*/

import java.util.*;

public class lab0202task05{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Value Of Voltage(Volts): ");
        double e = sc.nextDouble();
        
        System.out.println("Enter The Value Of Resistance(Ohms): ");
        double r = sc.nextDouble();
        
        System.out.println("Enter The Value Of Inductance(Henrys): ");
        double l = sc.nextDouble();
        
        System.out.println("Enter The Value Of Capacitance(Farads): ");
        double c = sc.nextDouble();
        
        System.out.println("Enter The Value Of Frequency(Hertz): ");
        double f = sc.nextDouble();
        
        double i = e / Math.sqrt(r*r + Math.pow((2*Math.PI*f*l - (l/2*Math.PI*f*c)),2));
        System.out.println("Current, I: "+i);
        
    }
}

