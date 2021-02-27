package exercise.b_programmers.stack_queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BridgeTruck_sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numbers = "011";
		// int numbers = 11112;
		bSolution1 s = new bSolution1();
		//System.out.println(s.solution(numbers));
	}
	
}


//https://yubh1017.tistory.com/10
class bSolution1 {
    
    class Truck{
        public int weight; // 해당 트럭 무게
        public int enterTime; // 다리에 진입한 시간
        
        Truck(int weight, int enterTime){
            this.weight = weight;
            this.enterTime = enterTime;
        }
    }
    
    // bridge_length: 다리 길이, weight: 다리가 버틸 수 있는 무게
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        
        // 대기 트럭
        Queue<Truck> waitingQ = new LinkedList<>();
        // 다리를 건너는 트럭
        Queue<Truck> crossingQ = new LinkedList<>();
        
        // 대기 트럭에 트럭 넣어주기
        Truck truck;
        for(int i=0; i<truck_weights.length; i++){
            truck = new Truck(truck_weights[i], -1);
            waitingQ.offer(truck);
        }
        
        // 다리를 지난 트럭은 대기 트럭과 다리를 건너는 트럭의 Queue가 다 empty인 경우임(while의 조건)
        int totalWeight = 0; // 다리에 올라와있는 트럭들의 무게
        int truck_weight;
        int truck_enterTime;
        Truck waitingTruck;
        Truck crossingTruck;
        while(!waitingQ.isEmpty() || !crossingQ.isEmpty()){
            // 시간 증가에 따른 트럭 움직임
            time ++;
            
            // 다리를 건너는 트럭 enterTime 확인해서 다리를 다 지났는지 확인
            // 꼭 먼저 확인해줘야 함 (다리를 건너던 트럭이 지나가서 대기 트럭이 올라올 수 있으므로)
            if(!crossingQ.isEmpty()){
                crossingTruck = crossingQ.peek();
                truck_enterTime = crossingTruck.enterTime;
                truck_weight = crossingTruck.weight;
                
                if(time - truck_enterTime >= bridge_length){
                    crossingQ.poll();
                    totalWeight -= truck_weight;
                }
            }
            
            // 대기 트럭이 다리에 올라올 수 있는지 무게 확인해서 견딜 수 있는 무게이면 다리에 올리기
            if(!waitingQ.isEmpty()){
                waitingTruck = waitingQ.peek();
                truck_weight = waitingTruck.weight;
                truck_enterTime = time;
                
                if(truck_weight + totalWeight <= weight){
                    crossingTruck = new Truck(truck_weight, truck_enterTime);
                    crossingQ.offer(crossingTruck);
                    
                    waitingQ.poll();
                    totalWeight += truck_weight;
                }
            }
            
        }
        
        // while 조건을 다 빠져나오면 모든 트럭이 다리를 지나간거임
        return time;
    }
}



//https://codevang.tistory.com/308
class bSolution2 {

	public int solution(int bridge_length, int weight, int[] truck_weights) {

		// int[] : 트럭 무게, 다리를 지나간 시간
		List<int[]> queue = new LinkedList<int[]>();
		int answer = 0;

		int i = 0;
		int totalWeight = 0;
		while (true) {

			// 다리위에 올라가 있는 트럭이 있다면 시간 1씩 감소 (0 이하면 삭제)
			for (int j = 0; j < queue.size();) {

				if (--queue.get(j)[1] == 0) {
					totalWeight -= queue.get(j)[0];
					queue.remove(j);
				} else {
					j++;
				}
			}

			// "현재 차례의 트럭 무게 + 다리위에 놓인 총 트럭 무게"가 weight 보다 작다면 다리에 올라감
			if (i < truck_weights.length && truck_weights[i] + totalWeight <= weight) {
				totalWeight += truck_weights[i];
				queue.add(new int[] { truck_weights[i++], bridge_length });
			}

			// 1초 증가
			answer += 1;

			// 다리에 트럭이 더이상 없으면 종료
			if (queue.size() == 0) {
				break;
			}

		}

		return answer;
	}
}


//https://2ssue.github.io/algorithm/programmers_42583/
class bSolution3 {
    //main 코드 생략
    public int solution(int bridgeLength, int weight, int[] truckWeights, int truckNumber) {
        int time = 0;
        Queue<Truck> bridge = new LinkedList<>();
        int lastEnterTruckIndex = 0;
        int currentBridgeWeight = 0;

        while (lastEnterTruckIndex < truckNumber) {
            time++;

            if (!bridge.isEmpty()) {
                Truck frontTruck = bridge.peek();
                if (time - frontTruck.enterTime == bridgeLength) {
                    currentBridgeWeight -= bridge.poll().weight;
                }
            }

            int compareTruck = truckWeights[lastEnterTruckIndex];
            if (currentBridgeWeight + compareTruck <= weight) {
                bridge.offer(new Truck(compareTruck, time));
                lastEnterTruckIndex++;
                currentBridgeWeight += compareTruck;
            }
        }

        time += bridgeLength;

        return time;
    }
    class Truck {
        public int weight;
        public int enterTime;

        public Truck(int weight, int enterTime) {
            this.weight = weight;
            this.enterTime = enterTime;
        }
    }
}



