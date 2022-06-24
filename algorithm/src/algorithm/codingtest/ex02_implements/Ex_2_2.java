package algorithm.codingtest.ex02_implements;

//상하좌우
public class Ex_2_2 {
	
	public static void main(String[] args) {
		int n = 5;
		Ex_2_2 sol = new Ex_2_2();
		System.out.println(sol.solution(n));
	}
	
    public int solution(int n) {
    	int answer = 0;
    	
    	for (int i = 0; i < n + 1; i++) {
    		if(i % 10 == 3) {
    			answer += 3600;
    			//System.out.println(i + " answer : "+ answer);
    			continue;
    		}
    		for (int j = 0; j < 60; j ++) {
    			if(j % 10 == 3 || j/10 == 3) {
    				answer += 60;
    				//System.out.println(i + ":" + j + " answer : "+ answer);
    				continue;
        		}
    			for(int k = 0; k < 60; k++) {
    				if(k % 10 == 3 || k/10 == 3) {
    					answer += 1;
    					//System.out.println(i + ":" + j + ":" + k + " answer : "+ answer);
    				}
    			}
    			
    		}
    	}
    	
    	return answer;
    }
}
