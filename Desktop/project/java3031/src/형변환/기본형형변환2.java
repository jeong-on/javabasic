package 형변환;

public class 기본형형변환2 {

	public static void main(String[] args) {
		int sum = 333;
		int count = 5;
		// 평균을 내는 경우, 하나라도 double이면
		// 결과가 double
		double avg = (double)sum/count;
		// 333을 333.0으로 형변환, double과 int의 계산은 무조건 double
		// 333.0/5 => 66.6
		double avg2 = (double)(sum/count); // 정수끼리의 계산은 무조건 int!, int/int 계산이기 때문에 계산한 정수값에 .0이 붙어 나옴
		// 정수끼리의 계산을 먼저해서 double로 형변환
		// (double)66이기 때문에 66.0으로 출력
		
		System.out.println(avg);
		System.out.println(avg2);
	}
}
