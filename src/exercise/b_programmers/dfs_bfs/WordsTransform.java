package exercise.b_programmers.dfs_bfs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Pattern;

public class WordsTransform {

	public static void main(String[] args) {
		
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
		wSolution1 s = new wSolution1();
		//System.out.println(solution(begin, target, words));
	}

}


//https://gngsn.tistory.com/60
class wSolution1 {

    int dfs(String begin, String target, int index, boolean visited[], String[] words, int cnt) {
        if (begin.equals(target))
            return cnt;

        if (visited[index])
            return cnt;

        visited[index] = true;

        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            if (index != i && isOneDiffer(begin, words[i]) && !visited[i]) {
                ans = dfs(words[i], target, i, visited, words, cnt + 1);
            }
        }
        return ans;
    }

    boolean isOneDiffer(String base, String com) {
        for (int i = 0; i < base.length(); i++) {
            StringBuilder beginRegex = new StringBuilder(base);
            beginRegex.setCharAt(i, '.');
            if (Pattern.matches(beginRegex.toString(), com))
                return true;
        }
        return false;
    }
    
    public int solution(String begin, String target, String[] words) {
		int v = words.length + 1;
        int answer = v;

        for (int i = 0; i < words.length; i++) {
            boolean[] visited = new boolean[v];
            if (isOneDiffer(begin, words[i]))
                answer = Math.min(answer, dfs(words[i], target, i, visited, words, 1));
        }
        return answer;
    }
}


//https://yujieun.github.io/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-DFSBFS-%EB%8B%A8%EC%96%B4%EB%B3%80%ED%99%98-JAVA/
class wSolution2 {
	   
    static class Node {
        String next;
        int edge;
   
        public Node(String next, int edge) {
            this.next = next;
            this.edge = edge;
        }
    }
   
    public int solution(String begin, String target, String[] words) {
        int n = words.length, ans = 0;
   
        // for (int i=0; i<n; i++)
        //  if (words[i] != target && i == n-1) return 0;
   
        Queue<Node> q = new LinkedList<>();
   
   
        boolean[] visit = new boolean[n];
        q.add(new Node(begin, 0));
   
        while(!q.isEmpty()) {
            Node cur = q.poll();
            if (cur.next.equals(target)) {
                ans = cur.edge;
                break;
            }
   
            for (int i=0; i<n; i++) {
                if (!visit[i] && isNext(cur.next, words[i])) {
                    visit[i] = true;
                    q.add(new Node(words[i], cur.edge + 1));
                }
            }
        }
   
        return ans;
    }
   
    static boolean isNext(String cur, String n) {
        int cnt = 0;
        for (int i=0; i<n.length(); i++) {
            if (cur.charAt(i) != n.charAt(i)) {
                if (++ cnt > 1) return false;
            }
        }
   
        return true;
    }    
}



//https://youngest-programming.tistory.com/312
class wSolution3 {

    // 현재단어에서 단어 변경 하나만 할 수 있는 경우만 변환 가능
    public static boolean isConvert(String word, String convertWord) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != convertWord.charAt(i)) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] isVisited = new boolean[words.length];
        List<String> wordList = Arrays.asList(words);
        if (!wordList.contains(target)) { // target 단어 안가지고 있는 경우
            return 0;
        }

        //bfs
        Queue<Word> queue = new LinkedList<>();
        queue.offer(new Word(begin, 0));
        while (!queue.isEmpty()) {
            Word currentWord = queue.poll();
            if (currentWord.word.equals(target)) {
                answer = currentWord.cnt;
                break;
            }
            for (int i = 0; i < words.length; i++) {
                if (!isVisited[i] && isConvert(currentWord.word, words[i])) {
                    isVisited[i] = true;
                    queue.offer(new Word(words[i], currentWord.cnt + 1));
                }
            }
        }
        return answer;
    }

    static class Word {
        String word; // 단어
        int cnt; // 변경한 횟수

        Word(String word, int cnt) {
            this.word = word;
            this.cnt = cnt;
        }
    }
}


//https://minhamina.tistory.com/44
//https://github.com/KwonMinha 참고용 깃허브
class wSolution4 {
	static int answer = 0;



	public static int solution(String begin, String target, String[] words) {
		if(Arrays.asList(words).contains(target)) {
			LinkedList<Integer>[] adjList = new LinkedList[words.length+1];
			int targetNum = 0;
			targetNum = makeAdjGraph(begin, target, words, adjList, targetNum);

			int[] count = new int[words.length+1];
			Arrays.fill(count, -1);
			bfs(adjList, targetNum, count);
		}
		
		return answer;
	}

	public static int makeAdjGraph(String begin, String target, String[] words, LinkedList<Integer>[] adjList, int targetNum) {
		String temp = begin;

		for(int i = 0; i < words.length+1; i++) {
			adjList[i] = new LinkedList<Integer>();

			for(int j = 0; j < words.length; j++) {
				int cnt = 0;

				for(int k = 0; k < words[j].length(); k++) {
					if(temp.charAt(k) != words[j].charAt(k))
						cnt++;
				}
				if(cnt == 1) 
					adjList[i].add(j+1);
			}
			if(i < words.length) {
				temp = words[i];
				if(target.equals(words[i])) 
					targetNum = i+1;
			}
			
		} 
 
		return targetNum;
	}

	public static void bfs(LinkedList<Integer>[] list, int targetNum, int[] count) {
		Queue<Integer> q = new LinkedList<Integer>();
		int v = 0;
		count[v] = 0;
		q.add(v);

		while(!q.isEmpty()) { 
			v = q.poll(); 

			Iterator<Integer> iter = list[v].listIterator();
			while(iter.hasNext()) { 
				int next = iter.next(); 
				if(count[next] == -1) { 
					count[next] = count[v] + 1;
					q.add(next);
				} 
				if(next == targetNum) {
					answer = count[next];
					break;
				}
			}
		}
	}
}
