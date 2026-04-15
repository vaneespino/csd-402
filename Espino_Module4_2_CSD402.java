

import java.util.Arrays;

public class Espino_Module4_2_CSD402  {

	public static void main(String[] args) {
		//Different arrays
		short[] shortArray = { 25, 50, 75, 100};                     //Size 4
		int[] intArray = {100, 200, 300, 400, 500};                  //Size 5
		long[] longArray = {2000, 4000, 6000, 8000, 10000, 12000};   //Size 6
		double[] doubleArray = {5, 10, 15};                        //Size 3


		displayResult("short", shortArray, average(shortArray));
		displayResult("int", intArray, average(intArray));
		displayResult("long", longArray, average(longArray));
		displayResult("double", doubleArray, average(doubleArray));

		}

		private static void displayResult(String type, Object array, Object average) {
			System.out.println("---Array Type: " + type + "---");
			if (array instanceof short[]) System.out.println("Original Array: " + Arrays.toString((short[]) array));
			else if (array instanceof int[]) System.out.println("Original Array: " + Arrays.toString((short[]) array));
			else if (array instanceof long[]) System.out.println("Original Array: " + Arrays.toString((long[]) array));
			else if (array instanceof double[]) System.out.println("Original Array: " + Arrays.toString((double[]) array));

			System.out.println("Calculate Average: " + average + "\n");
		}


		public static short average(short[] array) {
			int sum = 0;
			for (short val : array) sum += val;
			return (short) (sum / array.length);
		}

		public static int average(int[] array) {
			long sum = 0;
			for (int val : array) sum += val;
			return (int) (sum / array.length);
		}



		public static long average(long[] array) {
			long sum = 0;
			for (long val : array) sum+= val;
			return sum / array.length;
		}


		public static double average(double[] array) {
			double sum = 0;
			for (double val : array) sum += val;
			return sum / array.length;
		}

	}