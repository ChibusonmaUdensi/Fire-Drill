public class Math{
	public static int add(int firstNumber, int secondNumber) {
	       int sum = firstNumber + secondNumber;
		return sum;
}

public static int power(int baseNumber, int exponent) {
	int result = 1;
	for(int i = 0; i < exponent; i++){
	result = result * baseNumber;
}


	return result;
}
}