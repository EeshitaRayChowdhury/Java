package Intersect;
import java.util.Arrays;

public class CyclicRotation {
	
	public int[] solution(int [] A, int K)
	 { 	
		int[] result = new int[A.length];
		for(int i = 0;i<result.length;i++)
		{
			result[(i + K) % A.length] = A[i];
		}
		return result;
	 }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new CyclicRotation().solution(new int[] {7,2,8,3,5},2)));
		
	}
}
