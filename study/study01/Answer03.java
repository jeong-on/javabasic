package study01;

public class Answer03 {

   public static void main(String[] args) {
      int sum = 0; // 합계
      float avg = 0f; // 평균
      
      int[] num = {3, 12, 45, 32, 54, 22}; // 요소 저장
      
      for (int i = 0; i < num.length; i++) {
         sum += num[i]; // sum에 num배열의 요소를 하나씩 가져와서 더함.
      }
      avg = sum/(float)num.length; // 배열의 개수만큼 나눈다.
      
      System.out.println("합계 : " + sum);
      System.out.println("평균 : " + avg);

      int max = num[0];
      int min = num[0];
      
      for (int i = 1; i < num.length; i++) {
         if(num[i]>max) {
            max = num[i];
            System.out.println(max);
         } else if (num[i]<min) {
            min = num[i]; 
            System.out.println(min);
         }
      // num[0]=3(max값), num[1]=12, 12가 max값이 됨.
      // num[0]=3, num[2]=45, max는 45가 됨.
      // num[0]=3(min값), num[1]=12, min값이 유지
      // 배열의 길이만큼 반복
      }
      System.out.println("최대값 : " + max);
      System.out.println("최소값 : " + min);
      
   }

}