import java.util.*;
public class Program2{ 
public static int findLCM(int a, int b) { 
return (a * b) / findGCD(a, b); 
} 
public static int findGCD(int a, int b) { 
if (b == 0) { 
return a; 
} else { 
return findGCD(b, a % b); 
} 
} 

public static void main(String[] args) { 
Scanner sc = new Scanner (System.in); 
System.out.print("Enter the first number  :  "); 
int number1 = sc.nextInt(); 
System.out.print("Enter the second number  :  "); 
int number2 = sc.nextInt(); 
int lcm = findLCM(number1, number2); 
System.out.println("The LCM of " + number1 + " and " + number2 
+ " is: " + lcm); 
} 
}

output:

PS D:\CDAC\ADS Module\HW> javac Program2.java
PS D:\CDAC\ADS Module\HW> java Program2
Enter the first number  :  5
Enter the second number  :  10
The LCM of 5 and 10 is: 10