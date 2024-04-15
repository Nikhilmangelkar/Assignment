import java.util.*;
public class Program1 { 

 static int findGCD(int a, int b) { 
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
int gcd = findGCD(number1, number2); 
System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd); 
} 
} 

output:

PS D:\CDAC\ADS Module\HW> javac Program1.java
PS D:\CDAC\ADS Module\HW> java Program1
Enter the first number  :  10
Enter the second number  :  24
The GCD of 10 and 24 is: 2