package algorithm.codingtest.ex01_greedy;

import java.util.Arrays;

public class Ex_1_3 {
	
	public static void main(String[] args) {
		
		int n = 3;
		int m = 3;
		int[][] arr = {
						{3,1,2},
						{4,1,4},
						{2,2,2}
					  };
		Ex_1_3 sol = new Ex_1_3();
		System.out.println(sol.solution(n,m,arr));
	}
	
    public int solution(int n, int m, int arr[][]) {
    	int answer = 0;

    	int max = -9999999;
    	for(int i =0; i < m; i++) {
    		Arrays.sort(arr[i]);
    		if(arr[i][0] > max)
    			max = arr[i][0];
    	}

    	/*
    	for(int i = 0; i < m; i ++) {
    		for(int j =0; j < n; j++) {
    			System.out.print(arr[i][j] + " ");
    		}
    		System.out.println();
    	}
    	*/
    	
    	answer = max;
    	
    	return answer;
    }
}
