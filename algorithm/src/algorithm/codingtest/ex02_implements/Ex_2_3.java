package algorithm.codingtest.ex02_implements;

//왕실의 나이트 
import java.util.ArrayList;

public class Ex_2_3 {
	
	public static void main(String[] args) {
		Ex_2_3 sol = new Ex_2_3();
		String str = "a1";
		System.out.println(sol.solution(str));
	}
	
    public int solution(String str) {
    	int answer = 0;
    	
    	
    	//a1 -> 치환
    	int column = str.charAt(0) - 'a' + 1;
    	int row = Character.getNumericValue(str.charAt(1));
    	
    	//System.out.println(column + " "+ row);
    	
    	int arr[][] = {
    					{2,1}, {2,-1}, {1,2}, {1,-2},
    					{-2,1}, {-2,1}, {-1,2}, {-1, -2}
    				  };
    	
    	//System.out.println(arr.length);
    	
    	for (int i =0 ; i < arr.length; i++) {
    		System.out.println(arr[i][0] + " " + arr[i][1]);
    		if(column + arr[i][0] > 0 && column + arr[i][0] < 9 
    		   && row + arr[i][1] > 0 && row +  arr[i][1] < 9) {
    			answer += 1;
    			System.out.println("answer: " +arr[i][0] + " " + arr[i][1]);
    		}
    	}
    	
    	return answer;
    }
}
