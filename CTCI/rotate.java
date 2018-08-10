public class rotate{


	public static void main(String[] args) {

		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.deepToString(arr));
		rotate(arr);
		System.out.println(Arrays.deepToString(arr));
	}

	public static void rotate(int[][] matrix) {
		int partition = matrix.length;
		for(int i = 0; i < (partition+1)/2; i++) {
			int temp = matrix[i][0];
			matrix[i][0] = matrix[0][partition-1-i];
			matrix[0][partition-1-i] = matrix[partition-1-i][partition-1];
			matrix[partition-1-i][partition-1] = matrix[partition-1][i];
			matrix[partition-1][i] = temp;
		}
	}

}
