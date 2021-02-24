package exerciciosPOO;

import java.util.Arrays;

public class vetoresInvertidos10 {
	public static void main(String[] args) {
		
		double vec[] = {1,2,3,4,5,6,7,8,9,10};
		double temp[] = Arrays.copyOf(vec, 5);
		System.arraycopy(vec, 5, vec, 0, 5);
		System.arraycopy(temp, 0, vec, 5, 5);

		    for (int i = 0; i < vec.length; i++)
		        System.out.print(vec[i] + " ");        
		}
}
