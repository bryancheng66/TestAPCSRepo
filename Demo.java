public class Demo {
	public static void main(String[] Args){
		if (Args.length == 0){
			printLoop(5);
		} else {
			printLoop(Integer.parseInt(Args[0]));
		}
	}

	public static void printLoop(int n){
		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= n + 1 - i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
