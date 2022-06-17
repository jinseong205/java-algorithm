package algorithm.codingtest.ex01_greedy;

import java.util.Arrays;

public class Ex_1_2 {
	
	public static void main(String[] args) {
		int n = 5;
		int m = 8;
		int k = 3;
		int[] numList = {2,4,5,2,6};
		
		Ex_1_2 sol = new Ex_1_2();
		System.out.println(sol.solution(n, m, k, numList));
	}
	
    public int solution(int n, int m, int k, int[] numList) {
    	int answer = 0;
    	
    	Arrays.sort(numList);
    	
    	int first = 0;
    	
    	for(int i = 0; i < m; i++) {
    		
    		if(first < k) {
    			answer += numList[n - 1];
    			first += 1;
    		}
    		else{
    			answer += numList[n - 2];
    			first = 0;
    		}
    	}
    	
    	return answer;
    }
}
