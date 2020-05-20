package programmers.level02;

import java.util.LinkedList;

public class Q42583 {
	// https://programmers.co.kr/learn/courses/30/lessons/42583
	
	// 대기중인 트럭과 다리 위의 트럭 두 개의 queue 사용 
	// 이너클래스 적용 
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        LinkedList<Truck> truckList = new LinkedList<Truck>();
        LinkedList<Truck> bridgeList = new LinkedList<Truck>();
        
        for(int i = 0; i < truck_weights.length; i++) {
            truckList.add( new Truck(truck_weights[i], 0) ) ;
        }
        
        int nowBridgeWeight = 0;
        while(!truckList.isEmpty() || !bridgeList.isEmpty()) {
            answer++;
            
            if(!bridgeList.isEmpty()) {
                Truck target = bridgeList.peek();
                
                if(answer - target.location == bridge_length) {
                    nowBridgeWeight -= target.truckWeight;
                    bridgeList.poll();
                }
            }
            
            if(!truckList.isEmpty()) {
                if(nowBridgeWeight + truckList.peek().truckWeight <= weight) {
                    Truck target = truckList.poll();
                    nowBridgeWeight += target.truckWeight;
                    
                    bridgeList.add(new Truck(target.truckWeight, answer));
                }
            }
            
        }
        
        return answer;
    }
    
    class Truck {
        public int truckWeight; 
        public int location;
        
        public Truck(int truckWeight, int location) {
            this.truckWeight = truckWeight;
            this.location = location;
        }
    }
}
