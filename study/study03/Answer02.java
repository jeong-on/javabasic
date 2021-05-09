package study03;

import java.util.*;
 
public class Answer02 {

	public static int main(int n) {
		
		int answer = 0;
        
		while(n>0) {
			answer += n%10;
			n = n/10;
		}
        return answer;
    }
}