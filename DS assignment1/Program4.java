import java.util.*;
public class Program4 { 
public static boolean isPalindrome(int number) { 
  int originalNumber = number; 
  int reverse = 0; 
 
  while (number != 0) { 
   int lastDigit = number % 10; 
   reverse = reverse * 10 + lastDigit; 
   number /= 10; 
  } 
 
  return originalNumber == reverse; 
 } 
 public static void main(String[] args) { 
  Scanner sc = new Scanner (System.in); 
  System.out.print("Enter the  number  :  "); 
  int number = sc.nextInt(); 
  if (isPalindrome(number)) { 
   System.out.println(number + " is a palindrome."); 
  } else { 
   System.out.println(number + " is not a palindrome."); 
  } 
 } 
} 
 
output:

PS D:\CDAC\ADS Module\HW> javac Program4.java
PS D:\CDAC\ADS Module\HW> java Program4
Enter the  number  :  2662
2662 is a palindrome.
PS D:\CDAC\ADS Module\HW> javac Program4.java
PS D:\CDAC\ADS Module\HW> java Program4
Enter the  number  :  85556
85556 is not a palindrome.