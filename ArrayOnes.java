import java.util.Arrays; 

public class ArrayOnes {

	public static int[] array (int[] array) {
	int[] outcome = new int[array.length];
	for(int i = 0; i < array.length; i++) {
		if (outcome[i] % 2 == 0) {
			outcome[i] = 0;
		} else {
			outcome[i] = 1;
		}
	       }
		return outcome;
     	}
  

	public static void main(String[] args) {
		int[] newArray ={4, 5, 8, 8, 2, 9};
		int[] newAray = array(newArray);
    System.out.print(Arrays.toString(newAray));
	}
  }
