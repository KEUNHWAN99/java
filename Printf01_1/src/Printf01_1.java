
// printf() 메소드와 서식 문자
// %: 서식 문자
// d: decimal, 정수형
public class Printf01_1 {
	public static void main(String[] args) {
		// 정수 출력
		int a = 34567;
		
		System.out.printf("%d\n", a);
		System.out.printf("%10d\n", a);  // 오른쪽 맞춤
		System.out.printf("%-10dA\n", a);// 왼쪽 맞춤
		System.out.printf("%d %d\n", a);
		
		// 실수 출력
		double c = 3.141592;
		System.out.printf("%f\n", c);
		System.out.printf("%6.2f", c);
	}

}
