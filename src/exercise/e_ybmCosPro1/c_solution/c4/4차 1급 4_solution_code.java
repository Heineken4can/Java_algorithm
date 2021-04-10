import java.util.*;
import javafx.util.*;

class Solution {
    public static final int n = 4;    
    public ArrayList<Integer> find_not_exist_nums(int[][] matrix) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        boolean [] exist = new boolean[n * n + 1];
        Arrays.fill(exist, false);
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0) {
                    exist[matrix[i][j]] = true;
                }
            }
        }
        for (int i = 1; i <= n * n; i++) {
            if (!exist[i]) {
                nums.add(i);
            }
        }
        return nums;
    }
    public ArrayList<Pair<Integer, Integer> > find_blank_coords(int[][] matrix) {
        ArrayList<Pair<Integer, Integer> > coords = new ArrayList<Pair<Integer, Integer> >();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    coords.add( new Pair<Integer, Integer>(i, j) );
                }
            }
        }
        return coords;
    }
    public boolean is_magic_square(int[][] matrix) {
        int i, j;
        int sum = 0;
        for (i = 1; i <= n * n; i++) {
            sum += i;
        }
        sum = sum / n;
        for (i = 0; i < n; i++) {
            int row_sum = 0;
            int col_sum = 0;
            for (j = 0; j < n; j++) {
                row_sum += matrix[i][j];
                col_sum += matrix[j][i];
            }
            if (row_sum != sum) {
                return false;
            }
            if (col_sum != sum) {
                return false;
            }
        }
        int main_diagonal_sum = 0;
        int skew_diagonal_sum = 0;
        for (i = 0; i < n; i++) {
            main_diagonal_sum += matrix[i][i];
            skew_diagonal_sum += matrix[i][n-1-i];
        }
        if (main_diagonal_sum != sum) {
            return false;
        }
        if (skew_diagonal_sum != sum) {
            return false;
        }
        return true;
    }
    public int[] solution(int[][] matrix) {
        int[] answer = new int[6];
        int ans_idx = 0;
        ArrayList<Pair<Integer, Integer> > coords = find_blank_coords(matrix);
        ArrayList<Integer> nums = find_not_exist_nums(matrix);
        
        matrix[coords.get(0).getKey()][coords.get(0).getValue()] = nums.get(0);
        matrix[coords.get(1).getKey()][coords.get(1).getValue()] = nums.get(1);
        if (is_magic_square(matrix)) {
            for (int i = 0; i <= 1; i++) {
                answer[ans_idx++] = coords.get(i).getKey() + 1;
                answer[ans_idx++] = coords.get(i).getValue() + 1;
                answer[ans_idx++] = nums.get(i);
            }
        }
        else {
            matrix[coords.get(0).getKey()][coords.get(0).getValue()] = nums.get(1);
            matrix[coords.get(1).getKey()][coords.get(1).getValue()] = nums.get(0);
            for (int i = 0; i <= 1; i++) {
                answer[ans_idx++] = coords.get(1-i).getKey() + 1;
                answer[ans_idx++] = coords.get(1-i).getValue() + 1;
                answer[ans_idx++] = nums.get(i);
            }
        }
        return answer;
    }
}