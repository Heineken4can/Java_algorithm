package b_programmers.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class TargetNumber_sol {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numbers = "011";
		// int numbers = 11112;
		Solution1 s = new Solution1();
		// System.out.println(s.solution(numbers));
	}
}

//https://young-9.tistory.com/38
class Solution1 {
	public int solution(int[] numbers, int target) {
		return dfs(numbers, target, 0, 0);
	}

	public int dfs(int[] numbers, int target, int level, int sum) {

		// 배열 길이만큼 level이 증가하고, 각 원소들의 합이 target과 동일한 경우
		if (level == numbers.length) {
			if (target == sum)
				return 1;
			else
				return 0;
		}
		// left // right
		return dfs(numbers, target, level + 1, sum + numbers[level])
				+ dfs(numbers, target, level + 1, sum - numbers[level]);

	}
}

//출처: https://www.pymoon.com/entry/Programmers-타겟-넘버-BFSDFS-Java-풀이 [파이문]
class Solution2 {
	public int dfs(int prev, int index, int[] numbers, int target) {
		if (index >= numbers.length) {
			if (target == prev) {
				return 1;
			}
			return 0;
		}
		int cur1 = prev + numbers[index];
		int cur2 = prev - numbers[index];
		int ans = 0;
		ans += dfs(cur1, index + 1, numbers, target);
		ans += dfs(cur2, index + 1, numbers, target);
		return ans;
	}

	public int solution(int[] numbers, int target) {
		int current = numbers[0];
		int answer = 0;
		answer += dfs(current, 1, numbers, target);
		answer += dfs(-current, 1, numbers, target);
		return answer;
	}
}

//출처: https://www.pymoon.com/entry/Programmers-타겟-넘버-BFSDFS-Java-풀이 [파이문]
//BFS 풀이, dfs 를 while 문으로 풀어 쓴 것이다
class Solution3 {
	class Pair {
		int cur;
		int index;

		Pair(int cur, int index) {
			this.cur = cur;
			this.index = index;
		}
	}

	public int solution(int[] numbers, int target) {
		int answer = 0;
		Queue<Pair> queue = new LinkedList<Pair>();
		queue.offer(new Pair(numbers[0], 0));
		queue.offer(new Pair(-numbers[0], 0));
		while (!queue.isEmpty()) {
			Pair p = queue.poll();
			if (p.index == numbers.length - 1) {
				if (p.cur == target) {
					answer += 1;
				}
				continue;
			}
			int c1 = p.cur + numbers[p.index + 1];
			int c2 = p.cur - numbers[p.index + 1];
			queue.add(new Pair(c1, p.index + 1));
			queue.add(new Pair(c2, p.index + 1));
		}
		return answer;
	}
}


//https://velog.io/@jaesika/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-DFS-%ED%83%80%EA%B2%9F%EB%84%98%EB%B2%84
class Solution4 {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        answer = bfs(numbers, target, numbers[0], 1) + bfs(numbers, target, -numbers[0], 1);
        
        return answer;
    }
    
    public int bfs(int[] numbers, int target, int sum, int i) {
        
        if(i == numbers.length) {
            if(sum == target) {
                return 1;
            } else {
                return 0;
            }
        }
        
        int result = 0;
        result += bfs(numbers, target, sum+numbers[i], i+1);
        result += bfs(numbers, target, sum-numbers[i], i+1);
        return result;
    }
}


//https://hidelookit.tistory.com/99
class Solution5 {
    private static int n;
    private static int cnt = 0;

    public int solution(int[] numbers, int target) {
        int answer = 0;

        dfs(0, target, numbers);
        answer = cnt;

        return answer;
    }

    public void dfs(int index, int target, int[] numbers) {

        if (index == numbers.length) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            if (sum == target) {
                cnt++;
            }

        } else {

            numbers[index] *= 1;
            dfs(index+1, target, numbers);

            numbers[index] *= -1;
            dfs(index+1, target, numbers);
        }

    }
}
/*
 * 문제 설명 n개의 음이 아닌 정수가 있습니다. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1,
 * 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
 * 
 * -1+1+1+1+1 = 3 +1-1+1+1+1 = 3 +1+1-1+1+1 = 3 +1+1+1-1+1 = 3 +1+1+1+1-1 = 3
 * 사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를
 * 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.
 * 
 * 제한사항 주어지는 숫자의 개수는 2개 이상 20개 이하입니다. 각 숫자는 1 이상 50 이하인 자연수입니다. 타겟 넘버는 1 이상 1000
 * 이하인 자연수입니다.
 * 
 * 
 * 입출력 예 numbers target return [1, 1, 1, 1, 1] 3 5
 * 
 * 입출력 예 설명 문제에 나온 예와 같습니다.
 * 
 * 
 */
