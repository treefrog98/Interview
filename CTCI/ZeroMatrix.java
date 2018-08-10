public class ZeroMatrix{
	public static void main(String[] args) {

		int[][] arr = {{1,2,3},{4,0,6},{7,8,9}};
		zero(arr);
	}

	public static void zero(int[][] matrix) {
		if(matrix == null) {
			return;
		}
		boolean[] rows = new boolean[matrix.length];
		boolean[] cols = new boolean[matrix[0].length];
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					rows[i] = cols[j] = true;
				}
			}
		}
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				if(rows[i] || cols[j]) {
					matrix[i][j] = 0;
				}
			}
		}

	}
}
