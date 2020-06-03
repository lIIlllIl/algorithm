package programmers.level02;

public class Q60057 {
	// https://programmers.co.kr/learn/courses/30/lessons/60057
	public int solution(String s) {
        // String s의 길이는 최대 1000이므로 비교를 위해 1000 + 1값 설정
        int answer = 1001;
        
        // String s의 길이는 최소 1이므로 길이가 1일 경우 바로 1 반환
        if(s.length() == 1) {
            return 1;
        }

        // String s의 길이의 반보다 큰 문자열로 압축할 수 없음
        // i = 문자열 압축 시의 길이  
        for(int i = 1; i <= s.length() / 2; i++) {
            // 첫 압축 문자열 
            String target = s.substring(0, i);

            // 압축 결과물로 쓰일 StringBuilder
            StringBuilder sb = new StringBuilder();
            
            // 문자열이 압축된 횟수 
            int count = 1;

            // s에서 target 문자열 이후부터 확인해야하므로 i부터 시작 
            // 다음 비교 문자열으로 넘어갈 시 i만큼의 길이를 추가해야하므로 j = j + i
            for(int j = i; j < s.length(); j = j + i) {
                // 비교 문자열 substring 시작 
                int start = j;

                // 비교 문자열 substring 마지막
                // i가 s의 길이의 약수가 아닐 수 있으므로 j + i일 시 s의 길이를 초과할 수 있음 
                // 예외를 방지하기위해 j + i가 s의 길이를 초과할 시 s.length()로 초기화 
                int end = (j + i) > s.length() ? s.length() : (j + i) ;

                // 비교 문자열 
                String divide = s.substring(start, end);

                // 같을 경우 문자열 압축, count++;
                if(target.equals(divide)) {
                    count++;
                }
                // 다를 경우 
                else {
                	// 문자열이 압축된 횟수는 2부터 의미를 가지므로 1일 경우는 제외  
                    if(count != 1) {
                       // 압축 횟수 append
                    	sb.append(count);
                    }
                    // 압축된 문자열 append 
                    sb.append(target);      

                    // 압축 횟수 1로 초기화 
                    count = 1;
                    // 비교 문자열이 압축 문자열과 다른 경우이므로 
                    // 다음 압축 문자열을 지금 비교 문자열로 초기화 
                    target = divide;
                }
                
                // end가 s의 길이와 동일한 경우 문자열 압축을 마무리한 경우
                // 압축 문자열 초기화 제외 동일한 로직 
                if(end == s.length()) {
                    if(count != 1) {
                        sb.append(count);
                    }
                    
                    sb.append(target);      
                }
            }

            // 압축 문자열과 answer를 비교해 낮은 길이로 answer 초기화  
            if(sb.toString().length() < answer) {
                answer = sb.toString().length();
            }
        }
        
        return answer;
    }

}


