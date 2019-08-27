import java.util.Scanner; // Scanner클래스를 사용하기 위해 추가

class Ex4_3 {
	public static void main(String[] args) {  
		System.out.print("숫자를 하나 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 input에 저장

		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");	
		} else { // input!=0인 경우
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
	} // main의 끝
}