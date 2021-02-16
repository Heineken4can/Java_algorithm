package c_study_exercise.chap04;

import java.util.Scanner;
// int형 큐의 사용 예

class IntQueueTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntQueue s = new IntQueue(64);

		while (true) {
			System.out.println("data count : " + s.size() + "/" + s.capacity());
			System.out.println("1:inqueue, 2:dequeue, 3:peak, 4:dump, 0:end");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1:
				/*
					 * Exception in thread "main" java.lang.NullPointerException: Cannot store to
					 * int array because "this.que" is null at
					 * c_study_exercise.chap04.IntQueue.enque(IntQueue.java:32) at
					 * c_study_exercise.chap04.IntQueueTester.main(IntQueueTester.java:25)
					 */
				System.out.println("data : ");
				x = stdIn.nextInt();
				try {
					s.enque(x);
				} catch (IntQueue.OverflowIntQueueException e) {
					System.out.println("queue full");
				}
			case 2:
				try {
					x = s.deque();
					System.out.println("dequeue : " + x);
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("queue empty");
				}
			case 3:
				try {
					x = s.peek();
					System.out.println("peek : " + x);
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("queue empty");
				}
			case 4:
				s.dump();
				break;
			}

		} // while

	}// main
}// Class IntQueueTester