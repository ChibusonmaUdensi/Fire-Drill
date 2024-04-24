import java.util.ArrayList;
import java.util.List;

public class SumArray {
	public static List<Integer> arrayDouble (int[] array) {
		List<Integer> newArr = new ArrayList<>();
	for(int num: array) {
		newArr.add(num);
		newArr.add(num * 2);
	}
	return newArr;
  }


	public static void main(String[] args) {
		int[] inputArray = {4, 5, 8};
		List<Integer> outputArray = arrayDouble(inputArray);

     System.out.println(outputArray);

   }
}