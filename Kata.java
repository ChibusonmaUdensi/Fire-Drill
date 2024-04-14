import java.util.Scanner;
import java.lang.Math;


public class Kata {
 	  public static boolean isEven(int number); 
if (num % 2 == 0) {
	return true;
}

   public static int factorCount(int number) {
      int result = 0;

      for(int i = 1; i <= factorCount; i++) {
         if (num % i == 0) {
            ++factorCount;
         }
      }

      return factorCount;
   }

   public static boolean isPrime(int number) {
      if (number <= 1) {
         return false;

      } else {

         for(int i = 2; number * i <= number; i++) {
            if (number % 2 == 0) {
               return false;
            }
         }

         return true;
      }
   }

   public static boolean isPalindrome(int number) {
      int sum=0,r;
	while(num!=0) {
	  r=num%10;
	    ssum=(sum*10)+r;
	    num/=10;	
	    }
	return sum;
	}
   }

   public static long factorial(int var0) {
      long var1 = 1L;

      for(int var3 = 1; var3 <= var0; ++var3) {
         var1 *= (long)var3;
      }

      return var1;
   }

   public static int absoluteDiff(int var0, int var1) {
      int var2 = Math.abs(var0 - var1);
      return var2;
   }

   public static int quotient(int var0, int var1) {
      int var2 = var0 / var1;
      return var2;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int num = input.nextInt();
      if (isEven(num)) {
         System.out.println(num + " is even.");
      } else {
         System.out.println(num + " is odd.");
      }

      System.out.printf("Factorial is %d", factorial(num));
      System.out.println("Number of factors " + factorCount(num));
      if (isPalindrome(var2)) {
         System.out.print(num + "is a Palindrome");
      } else {
         System.out.print(num + "is not a Palindrome");
      }

      if (isPrime(num)) {
         System.out.println(var2 + "is prime.");
      } else {
         System.out.println(var2 + "is not prime. ");
      }

      System.out.print("Enter an integer:");
      int num2 = input.nextInt();
      PrintStream var10000 = System.out;
      int result = absoluteDiff(var2, var3);
      System.out.print("Absolute diff: " + var10001);
      System.out.printf("quotient is: " + quotient(number, num2));
   }
}
    