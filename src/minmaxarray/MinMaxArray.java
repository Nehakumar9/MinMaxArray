package minmaxarray;

import java.util.Scanner;

public class MinMaxArray {

	public static int maximumMinimumOfArray(int array[],int size,int max,int min) {
		for(int i=0;i<size;i++) {
			if(array[i]>max) {
				max = array[i];
			}
			if(array[i]<min) {
				min = array[i];
			}
		}
		return max+min;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		int max = array[0];
		int min = array[0];
		int results = maximumMinimumOfArray(array,n,max,min);
		System.out.println(results);
	}

}
