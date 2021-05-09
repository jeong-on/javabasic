package study01;

public class Answer04 {

   public static void main(String[] args) {
      for (int i = 1; i < 101; i++) { // 1부터 101미만의 숫자 중에서
         if ((i%3 == 0) && (i%5 == 0)) { // 3과 5로 나누었을때 나머지가 0이면
            System.out.println("짱킹"); // 짱으로 출력
         } else if (i%5 == 0) { // 5로 나누었을때 나머지가 0이면
            System.out.println("킹"); // 킹으로 출력
         } else if (i%3 ==0) { // 3으로 나누었을때 둘다 나머지가 0일경우
            System.out.println("짱"); // 짱킹으로 출력
         } else { // 그 이외의 것들은 
            System.out.println(i); // 그냥 출력
         }
      }

   }

}