import java.util.Scanner;
  
	  public class CollectionRate {

       	  public static int result (int number){


		int result =0;
	if (number < 50)
	 {

  	  result = (number * 160) + 5000;

	  return result;
     }


	if (number <= 59) {
	
	result = (number * 200) + 5000;
    
	 return result;
  }

	if (number <= 69) {
	
	result = (number * 250) + 5000;

	 return result;
   }
     if (number >= 70) {
	
	result = (number * 500) + 5000;
    }   
	 return result;
    }


	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

System.out.println("Number of successful delivery:");
int num = scanner.nextInt();

System.out.printf("%s%d\n", "Rider's Wage: ",   +   result(num));
	}
}