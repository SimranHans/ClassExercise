//calculate celcius to farenhiet.

import java.util.Scanner;
public class Farenhiet  
 {  
   public static void main (String args[])  
    { 
        float Fahrenheit, Celsius;  
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temperature in celcius : ");
          Celsius= sc.nextInt();
          Fahrenheit =((Celsius*9)/5)+32;  
          System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);
          sc.close();  
    }}  

