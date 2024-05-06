import java.util.Scanner;

public class PizzaWahala {
	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("-----------------------------------------------------------------");
System.out.printf("%-15s %-15s %-15s\n", "PIZZA TYPE", "NUMBER OF SLICES", "PRICE PER BOX");
System.out.println("-----------------------------------------------------------------");
System.out.println("Sapa Size" + "          " + "4               " +            " 2,000                     ");

System.out.println("-----------------------------------------------------------------");
System.out.println("Small Money" + "        " + "6                "  + "2,400                     ");

System.out.println("-----------------------------------------------------------------");
System.out.println("Big Boys" + "           " + "8                " + "3,000                     ");
System.out.println("-----------------------------------------------------------------");                                                                                                                                                                                                                  
System.out.println("Odogwu" + "            " + "12                "  + "4,200                     ");

System.out.println("-----------------------------------------------------------------");


//int[] SapaSize = {4, 2000};
//int[] SmallMoney = {6, 2400};
//int[] BigBoys = {8, 3000};
//int[] Odogwu = {12, 4200};
int price;
int sliceLeft;
int boxToBuy;


System.out.println("Number of people?");
int numberOfPeople =  scanner.nextInt();

System.out.println("What pizza type?");
String pizzaType = scanner.nextLine();


	if (pizzaType == "Sapa Size") {
		if (numberOfPeople % 4== 0) {
			boxToBuy = numberOfPeople / 4;
			System.out.println("Number of boxes to buy is:" + boxToBuy );
			sliceLeft = numberOfPeople % 4;
			System.out.println("Slice left: " + sliceLeft);

			price = (2000 * boxToBuy);
			System.out.println("Price:" + price);
		} else {
			boxToBuy = (numberOfPeople / 4) + 1;
			System.out.println("Number of boxes to buy is:" +  boxToBuy );
			sliceLeft = 4 -(numberOfPeople % 4);
			System.out.println("Slice left: " + sliceLeft);

			price = (2000 * boxToBuy);
			System.out.println("Price:" + price);

		}
	

	}
	 if (pizzaType == "Small Money") {
	       	if (numberOfPeople % 6== 0) {
			boxToBuy = numberOfPeople / 6;
			System.out.println("Number of boxes to buy is:" + boxToBuy );
			sliceLeft = numberOfPeople % 6;
			System.out.println("Slice left: " + sliceLeft);

			price = (2400 * boxToBuy);
			System.out.println("Price:" + price);

			}
		else {
			boxToBuy = (numberOfPeople / 6) + 1;
			System.out.println("Number of boxes to buy is:" +  boxToBuy );
			sliceLeft = 4 -(numberOfPeople % 6);
			System.out.println("Slice left: " + sliceLeft);

			price = (2400 * boxToBuy);
			System.out.println("Price:" + price);


		}
	}
	if (pizzaType == "Big Boys") {
		if (numberOfPeople % 8 == 0) {
			boxToBuy = numberOfPeople / 8;
			System.out.println("Number of boxes to buy is:" + boxToBuy );
			sliceLeft = numberOfPeople % 8;
			System.out.println("Slice left: " + sliceLeft);

			price = (3000 * boxToBuy);
			System.out.println("Price:" + price);

		} else {
			boxToBuy = (numberOfPeople / 8) + 1;
			System.out.println("Number of boxes to buy is:" +  boxToBuy );
			sliceLeft = 4 -(numberOfPeople % 8);
			System.out.println("Slice left: " + sliceLeft);

			price = (3000 * boxToBuy);
			System.out.println("Price:" + price);

		}
	}

		if (pizzaType == "Odogwu") {
		if (numberOfPeople % 12 == 0) {
			boxToBuy = numberOfPeople / 8;
			System.out.println("Number of boxes to buy is:" + boxToBuy );
			sliceLeft = numberOfPeople % 12;
			System.out.println("Slice left: " + sliceLeft);

			price = (4200 * boxToBuy);
			System.out.println("Price:" + price);

		} else {
			boxToBuy = (numberOfPeople / 12) + 1;
			System.out.println("Number of boxes to buy is:" +  boxToBuy );
			sliceLeft = 4 -(numberOfPeople % 12);
			System.out.println("Slice left: " + sliceLeft);

			price = (4200 * boxToBuy);
			System.out.println("Price:" + price);

		}
	}

	}
} 