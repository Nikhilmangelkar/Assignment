import java.util.*;
public class Program5 { 
public static boolean isPrime(int n) { 
if (n < 2) { 
return false; 
} 
for (int i = 2; i <= Math.sqrt(n); i++) { 
if (n % i == 0) { 
return false; 
} 
} 
return true; 
} 

public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter the  number  :  "); 
int number = sc.nextInt(); 
if (isPrime(number)) { 
System.out.println(number + " is a prime number."); 
} else { 
System.out.println(number + " is not a prime number."); 
} 
} 
}

output:


PS D:\CDAC\ADS Module\HW> javac Program5.java
PS D:\CDAC\ADS Module\HW> java Program5
Enter the  number  :  21
21 is not a prime number.
PS D:\CDAC\ADS Module\HW> javac Program5.java
PS D:\CDAC\ADS Module\HW> java Program5
Enter the  number  :  23
23 is a prime number.