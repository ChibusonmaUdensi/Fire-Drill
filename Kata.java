import java.util.Scanner;
import java.lang.Math;


public class Kata {
 	  public static boolean isEven(int number) {
          if (number % 2 == 0) {
}
	return true;
}

   public static int factorCount(int number) {
	int factorCount = 0;
      
      for(int i = 1; i <= number; i++) {
         if (number % i == 0) {
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
      int sum=0,remainder;
	while(number!=0) {
	  remainder=number%10;
	    sum=(sum*10)+remainder;
	    number/=10;	
}
	return true;
	}
   


   public static long factorial(int number) {
      long factorial = 1;

      for(int i = 1; i <= number; ++i) {
         factorial *= i;
      }
      return factorial;
      }

   public static int absoluteDiff(int number, int num2) {
      int result = Math.abs(number - num2);
      return result;
   }

   public static double quotient(int number, int num2) {
      double quotient = number / num2;
      return quotient;
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int num = input.nextInt();

      if (isEven(num)) {
         System.out.println(num + " is even.");
      } else {
         System.out.println(num + " is odd.");
      }

      System.out.printf("Factorial is %d%n", factorial(num));

      System.out.println("Number of factors " + factorCount(num));
 
     if (isPalindrome(num)) {
         System.out.println(num + "is a Palindrome");
      } else {
         System.out.println(num + "is not a Palindrome");
      }

      if (isPrime(num)) {
         System.out.println(num + "is prime.");
      } else {
         System.out.println(num + "is not prime. ");
      }

      System.out.print("Enter an integer:");
      int num2 = input.nextInt();
    

      System.out.print("Absolute diff: " + Math.abs(num -num2));


      System.out.printf("quotient is : %.2f%n",  quotient(num,num2)); 
  }

}
    