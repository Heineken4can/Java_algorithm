package b_programmers.sort;

import java.util.Arrays;
import java.util.Comparator;

public class BiggestNumber_sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] numbers = { 6, 10, 2 }; //6210
		int[] numbers = { 3, 30, 34, 5, 9 }; // 9534330

		String result = solution1(numbers);
		System.out.println(result);

	}
	/*
	 * "java convert int to string" 
	 * char c = 'a'; String s = String.valueOf(c); //
	 * fastest + memory efficient String s = Character.toString(c); 
	 * String s = new String(new char[]{c}); 
	 * String s = String.valueOf(new char[]{c}); 
	 * String s =
	 * new Character(c).toString(); String s = "" + c; // slowest + memory
	 * inefficient
	 */
	
	// https://codevang.tistory.com/294
	public static String solution1(int[] numbers) {

		// 숫자를 문자열로 변환
		String[] result = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			result[i] = String.valueOf(numbers[i]);
		}

		// 정렬
		Arrays.sort(result, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

		// 0만 여러개 있는 배열의 경우 하나의 0만 리턴
		if (result[0].equals("0")) {
			return "0";
		}

		String answer = "";
		// 정렬된 문자 하나로 합치기
		for (String a : result) {
			answer += a;
		}
		return answer;
	}

	// https://lkhlkh23.tistory.com/102
	public static String solution2(int[] numbers) {
		String[] arr = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++)
			arr[i] = String.valueOf(numbers[i]);

		Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

		if (arr[0].equals("0"))
			return "0";

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++)
			sb.append(arr[i]);

		return sb.toString();
	}

	
	//https://sas-study.tistory.com/3
    public static String solution3(int[] numbers) {
        String answer = "";
        
        String[] sNumbers = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            sNumbers[i] = numbers[i] + "";
        }
        
        Arrays.sort(sNumbers, new Comparator<String>(){   
            @Override
            public int compare(String n1, String n2){
                // 더해서 큰 값 만드는 내림 차순
                return (n2+n1).compareTo(n1+n2);
            }
        });
        
        for(int i=0; i<sNumbers.length; i++){
            answer += sNumbers[i];
        }
        
        // "000" 과 같이 0이 여러번인 경우 제외
        if(answer.startsWith("0"))
            answer = "0";
        
        return answer;
    }
    
    
	// https://developerdk.tistory.com/24
	public static String solution4(int[] numbers) {
		String answer = "";

		// int 배열을 String 배열로 변환
		String[] arr = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			arr[i] = (String.valueOf(numbers[i]));
		}

		// 배열 정렬, 정렬 규칙으로는 2개를 더하여 더 큰 쪽이 우선순위가 있도록 정렬
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s2 + s1).compareTo(s1 + s2);
			}
		});

		// 0000 처럼 0으로만 구성되어있으면 0 return
		if (arr[0].equals("0"))
			return "0";

		// 그 외의 경우 순차적으로 연결하여 answer return
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		return answer;
	}


}

/*
 * 가장 큰 수 문제 설명 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
 * 
 * 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중
 * 가장 큰 수는 6210입니다.
 * 
 * 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어
 * return 하도록 solution 함수를 작성해주세요.
 * 
 * 제한 사항 numbers의 길이는 1 이상 100,000 이하입니다. numbers의 원소는 0 이상 1,000 이하입니다. 정답이 너무
 * 클 수 있으니 문자열로 바꾸어 return 합니다.
 * 
 * 
 * 입출력 예 numbers return [6, 10, 2] 6210 [3, 30, 34, 5, 9] 9534330
 * 
 * 
 */