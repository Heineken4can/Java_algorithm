package basic.concept.util.Collection.c_Queue.Queue;
//https://gamjatwigim.tistory.com/72

import java.util.LinkedList;
import java.util.Queue;

public class Examples {

    public static void main(String[] args) {
    	
        Queue<Integer> queue = new LinkedList<>();//큐 생성
        queue.offer(5);//데이터를 집어 넣음
        queue.offer(1);//데이터를 집어 넣음
        queue.offer(2);//데이터를 집어 넣음
        queue.offer(3);//데이터를 집어 넣음
        queue.offer(4);//데이터를 집어 넣음
        print(queue);//큐를 출력
        System.out.println(String.format("poll: %d", queue.poll()));//poll
        System.out.println(String.format("poll: %d", queue.poll()));//poll
        System.out.println(String.format("poll: %d", queue.poll()));//poll
        System.out.println(String.format("peek: %d", queue.peek()));//peek
        System.out.println(String.format("peek: %d", queue.peek()));//peek
        System.out.println(String.format("peek: %d", queue.remove()));//peek
        System.out.println(queue.remove(2));
        System.out.println(queue.remove(1));
    }
    
    public static void print(Queue<Integer> queue) {
        System.out.print("data: ");
        queue.forEach((value)->{
            System.out.print(value);
        });
        System.out.println(String.format(" size: %d", queue.size())); 
    }
}
