package a_shibata_study_exercise.chap04;

import java.util.Scanner;
// int형 스택의 사용 예

class IntStackTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while (true) {
			System.out.println("현재 데이터 수 : " + s.size());
			System.out.println("1:push, 2:pop, 3:peak, 4:dump, 0:exit");
			
			int menu = stdIn.nextInt();
			if (menu == 0) break;
			
			int x; 
			switch(menu) {
			case 1: 
				System.out.println("data : ");
				x = stdIn.nextInt();
				try {
					x = s.push(x);
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("stack full");
				}
				break;	
			
			case 2: 
				try {
					x = s.pop();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("stack empty");
				}
				break;
				
			case 3: 
				try {
					x = s.peek();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("stack empty");
				}
			case 4: 
				s.dump();
				break;
			
			
			}
			
			
			
			
			
		}
				
		
		
		
	}
}