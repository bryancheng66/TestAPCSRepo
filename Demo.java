public class Demo {
	public static void main(String[] Args){
		if (Args.length == 0){
			printLoop(5);
		} else {
			printLoop(Integer.parseInt(Args[0]));
		}

		/*Test
		int[][] testArray = {{1,2,3},{3,4,2},{3,2},{4,2,7,8}};
		System.out.println(arrayDeepToString(testArray));	
		System.out.println(arrayDeepToString(create2DArray(4,5,4)));
		System.out.println(arrayDeepToString(create2DArrayRandomized(6,4,4)));
		*/
	}

	public static void printLoop(int n){
		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= n + 1 - i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static String arrToString(int[] arr){
                String result = "{";
                for (int i = 0; i<arr.length; i++){
                        result += arr[i];
                        result += i != arr.length -1 ? ", " : "";
                }
                result += "}";
                return result;
        }
	
	public static String arrayDeepToString(int[][] arr){
		String result = "{";
		for (int i = 0; i<arr.length; i++){
			result += arrToString(arr[i]);
			result += i != arr.length-1 ? ", " : "";	
		}
		result += "}";
		return result;
	}

	public static int[][] create2DArray(int rows, int cols, int maxValue){
		int[][] result = new int[rows][cols];
		for (int i = 0; i < rows; i++){
			for (int j = 0; j < cols; j++){
				result[i][j] = (int)(Math.random() * (maxValue + 1));
			}
		}
		return result;
	}
	
	public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
		int[][] result = new int[rows][];
		for (int i = 0; i < rows; i++){
			result[i] = new int[(int)(Math.random() * (maxValue + 1))];
			for (int j = 0; j < result[i].length; j++){
				result[i][j] = (int)(Math.random() * (maxValue + 1));
			}
		}
		return result;
	}
}
