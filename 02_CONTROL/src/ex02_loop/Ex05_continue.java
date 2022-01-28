package ex02_loop;

public class Ex05_continue {

	public static void main(String[] args) {

		// continue
		// 1. 반복문에서 실행에서 제외할 코드가 있는 경우에 사용한다.
		// 2. 반복문의 시작 지점으로 흐름이 이동된다.
		
		// 1~100 사이 정수 중 3의배수를 제외하고 출력하기
		for(int n = 1; n <= 100; n++) {
			if(n % 3 == 0) // 3으로 나눴을때 남는게 0
				continue; // 3의배수 출력 제외
			System.out.println(n);
		}
		
		// continue는 없어도 된다.
		for(int n = 1; n <= 100; n++) {
			if(n % 3 != 0) // != 를 넣어서 부정문으로 바꿈
			System.out.println(n);
		
		}
	}
}
