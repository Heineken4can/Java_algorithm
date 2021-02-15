package c_study_exercise.chap02;
// 2행 4열의 2차원 배열

class Int2DArray {
	public static void main(String[] args) {
		int[][] x = new int[2][4];
		
		x[0][1]	= 36;
		x[0][3] = 55;
		x[1][2] = 66;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[1].length; j++) {
				System.out.println(x[i][j]);
			}
		}
	}
}
