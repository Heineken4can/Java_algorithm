package exercise.b_programmers.exhauxtiveSearch;

public class Carpet_sol {
	public static void main(String[] args) {
        int brown = 10;
        int red = 2;
        int[] ans = solution1(brown, red);

        for(int i=0; i<ans.length; i++)
            System.out.println(ans[i]);;
    }

	//https://hoho325.tistory.com/204
    public static int[] solution1(int brown, int red) {
        int[] answer = {};
        int sum = brown + red;

        for(int i=3; i<=sum; i++){
            // 약수 모두 구하기
            if(sum % i == 0){
                int col = sum / i;    // 가로
                int row = sum / col;    // 세로

                int a = col - 2;    // 빨간색 격자의 가로
                int b = row - 2;    // 빨간색 격자의 세로
                if(a*b == red && col >= row){
                    return new int[]{col, row};
                }
            }
        }

        return answer;
    }
    
    //https://codevang.tistory.com/301
    public int[] solution2(int brown, int red) {

		int height = 0;
		int width = 0;
		for (height = 3; height <= (int) (brown + 4) / 2; height++) {

			width = ((brown + 4) / 2) - height;
			if (width < height) {
				break;
			}

			int redCount = (width - 2) * (height - 2);
			if (red == redCount) {
				break;
			}
		}

		int[] answer = new int[] { width, height };
		return answer;
	}
    
    
    //https://hidelookit.tistory.com/56
    public int[] solution3(int brown, int yellow) {
        int[] answer = new int[2];
        
        //가로 최대 = ?
        //세로 최대 = ?
        //가로 >= 세로
        
        //둘레 = 2*n + 2*(m-2) == brown -> m + n = (brown + 4)/2
        
        //yellow = (n-2) * (m-2)
        
        //둘레
        int size = (brown+4) / 2;
        //세로
        int m = 3;
        //가로
        int n = size - m;
        
        while (n >= 3 && n >= m) {
            if ((n-2) * (m-2) == yellow) {
                answer[0] = n;
                answer[1] = m;
                break;
            }
            n--;
            m++;
        }
        return answer;
    }
    
    
}




/*
Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.

carpet.png

Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만,
전체 카펫의 크기는 기억하지 못했습니다.

Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 
카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한사항
갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.

입출력 예
brown	yellow	return
10	2	[4, 3]
8	1	[3, 3]
24	24	[8, 6]



*/