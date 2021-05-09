package study03;

import java.util.*;

public class Answer03 {

	public static int[] main(String[] args) {
		int[] answer = {};
		int[] arr = {};
		
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==arr[i+1]) {
				if (i==arr.length-2) {
					temp.add(arr[i+1]);
				}
				continue;
			} else {
				temp.add(arr[i]);
				if (i==arr.length-2) {
					temp.add(arr[i+1]);
				}
			}
		}
		answer = new int[temp.size()];
		for (int i = 0; i < temp.size(); i++) {
			answer[i] = temp.get(i);
		}
		
		return answer;
	}
}
