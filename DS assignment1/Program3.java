import java.util.*;
public class Program3 { 
public static void printPrimeFactors(int n) { 
 
  while (n % 2 == 0) { 
   System.out.print(2 + " "); 
   n /= 2; 
  } 
 
  for (int i = 3; i <= Math.sqrt(n); i += 2) { 
 
   while (n % i == 0) { 
    System.out.print(i + " "); 
    n /= i; 
   } 
  } 
 
  if (n > 2) { 
   System.out.print(n); 
  } 
 } 
 public static void main(String[] args) { 
  Scanner sc = new Scanner (System.in); 
  System.out.print("Enter the  number  :  "); 
  int number = sc.nextInt(); 
  System.out.print("Prime factors of " + number + " are: "); 
  printPrimeFactors(number); 
 } 
} 


output:

PS D:\CDAC\ADS Module\HW> javac Program3.java
PS D:\CDAC\ADS Module\HW> java Program3
Enter the  number  :  5
Prime factors of 5 are: 5