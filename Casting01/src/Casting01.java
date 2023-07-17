import java.util.Scanner;

/*
  퀴즈 2번) 국어, 영어, 수학 점수를 입력하여, 총점과 평균울 구하시오.
  변수명: kor, eng, mat, sum(정수), ave(실수)
 */

public class Casting01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력 화면
		System.out.print("국어 점수 입력: ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력: ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력: ");
		int mat = sc.nextInt();
		
		// 총점, 평균 계산
		// 문제점: 소수점 이하가 나오지 않음
		// 캐스팅(Casting): 강제로  데이터타입을 변환하는 것.
		// 이항 수치 승격
		int sum = kor + eng + mat;
		double ave = (double)sum / 3; // 277 / 3 -> 277.0 / 3.0 -> 92.3333...
		//double ave = sum / 3.0;
		
		// 출력 화면
		System.out.println("총점: " + sum);
		System.out.println("평균: " + ave);
		
		sc.close();
	}
}
