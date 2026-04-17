//Vanessa Espino Module 5.2 CSD402


public class Espino_Module5_2_CSD402 {
	
	public static int[] locateLargest(double[][] arrayParam) {
		
		if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0){
			return new int[]{-1,-1};
		}


		int[] location = {0,0};
		double maxValue = arrayParam[0][0];


		for (int i = 0; i < arrayParam.length; i++) {
			for (int j = 0; j < arrayParam[i].length; j++) {
				if (arrayParam[i][j] > maxValue) {
					maxValue = arrayParam[i][j];
					location[0] = i;
					location[1] = j;
					}
				}
			}
		return location;
	}



	public static int[] locateLargest(int[][] arrayParam) {
		
		if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0){
			return new int[]{-1,-1};
		}
		

		int[] location = {0,0};
		int maxValue = arrayParam[0][0];


		for(int i = 0; i < arrayParam.length; i++) {
			for (int j = 0; j < arrayParam[i].length; j++) {
				if (arrayParam[i][j] > maxValue) {
					maxValue = arrayParam[i][j];
					location[0] = i;
					location[1] = j;
				}
			}
		}
		return location;
	}
}