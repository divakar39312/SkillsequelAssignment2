package com.skillsequel;

import java.util.Scanner;

public class SimpleInterest {

	public static void main (String args[])  
    {   float  si; 
    Scanner sc=new Scanner(System.in);
    float p=sc.nextFloat();
    float r=sc.nextFloat();
    float t=sc.nextFloat();
    // principal amount, rate, time and simple interest respectively  
              p = 13000;  r = 12; t = 2;  
               si  = (p*r*t)/100;   
              System.out.println("Simple Interest is: " +si); 
}
}