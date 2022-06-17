package algorithm.codingtest.ex01_greedy;

public class Ex_1_1 {
	
	public static void main(String[] args) {
		
		int n = 1260;
		
		Ex_1_1 sol = new Ex_1_1();
		System.out.println(sol.solution(n));
	}
	
	
    public int solution(int total) {
    	int answer = 0;
    	int[] coin = {500, 100, 50, 10};
    	
    	for(int i = 0; i < coin.length; i++) {
    		answer += total / coin[i];
    		total %= coin[i];
    		//System.out.println("금액 " + total + " 지불 동전 " + answer);
    	}
    	
    	return answer;
    }
}
