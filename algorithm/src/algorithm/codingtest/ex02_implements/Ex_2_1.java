package algorithm.codingtest.ex02_implements;

public class Ex_2_1 {
	
	public static void main(String[] args) {
		int n = 5;
		char[] plans = {'R','R','R','U','D','D'};
		
		Ex_2_1 sol = new Ex_2_1();
		System.out.println(sol.solution(n,plans));
	}
	
    public String solution(int n, char[] plans) {
    	String answer = "";
    	
    	int x = 1;
    	int y = 1;
    	int nx = 0;
    	int ny = 0;
    	
    	//LRUD에 따른 이동방향
    	int[] dx = {0,0,-1,1};
    	int[] dy = {-1,1,0,0};
    	char[] moveType = {'L','R','U','D'};
    	
    	for(char plan : plans) {
    		for(int i = 0; i < moveType.length; i++) {
    			if(plan == moveType[i]) {
    				nx = x + dx[i];		
    				ny = y + dy[i];
    				//System.out.println(x + " " + y);
    			}
    			if(nx < 1 || nx > 5 || ny < 1 ||  ny > 5) {
    				continue;
    			}
    			x = nx;
    			y = ny;
    		}
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	sb.append(x);
    	sb.append(" ");
    	sb.append(y);
    	
    	answer = sb.toString();
    	
    	return answer;
    }
}
