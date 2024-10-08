package day07;


public class ExceptionEx01 {

	public static void main(String[] args) {
		// 리턴 받은 배열을 출력
		ExceptionEx01 ex01 = new ExceptionEx01();
		
		int start = -1, count = -1, size = -1;
		int arr[] = null;

//		try {
//			ex01.randArr1(10, 20);
//			ex01.randArr2(arr, 10, 10);
//		} catch(NegativeArraySizeException e) {
//			System.out.println("배열 길이가 0보다 작습니다.");
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		} catch(NullPointerException e) {
//			System.out.println("배열 값이 null입니다.");
//			e.printStackTrace();
//		} catch(RuntimeException e) {
//			System.out.println("start 값이 이상합니다. 음수 입력은 금지입니다.");
//			e.printStackTrace();
//		}
		// solve
		try {
			int arr2[] = new int[size];
			arr = ex01.createArr(size, start, count);
			ex01.createArr(arr2, start, count);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/* 메서드 생성
	 * 기능 : size 입력받아(매개변수) size 만큼의 길이를 가지는 배열을 생성하여
	 * 랜덤값을 채워 배열을 리턴
	 * 랜덤값은 범위를 매개변수를 받아 start(시작값), count(변수)
	 * - size가 0보다 작으면 예외 발생  NegativeArraySizeException
	 * - 배열이 null일 때 예외 발생 nullpointexception
	 * - 랜덤값의 개수가 0이면 예외 발생 runtimeException
	 * */
	public void randArr1(int count, int start) {
		int arr1[] = new int[count];
		
		if(count < 0) {
			throw new NegativeArraySizeException("배열 사이즈가 0보다 작으면 안됩니다.");
		}
		
		for(int i=0; i<count; i++) {
			arr1[i] = (int)(Math.random()*start)+1;
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}
	/* 메서드
	 * 기능 : 매개변수로 배열을 받아 랜덤값을 채우는 메서드
	 * 랜덤값은 범위를 매개변수를 받아 start(시작값), count(변수)
	 * - 랜덤값의 개수가 0이면 예외 발생 runtimeException
	 * - 배열이 null이면 예외발생 nullpointexcetpion
	 * - 배열의 길이가 0보다 작으면 예외 발생
	 * */
	public void randArr2(int arr[], int count, int start) {
		int arr2[] = arr;
		arr2 = new int[count];
		try {
			for(int i=0; i<count; i++) {
				arr2[i] = (int)(Math.random()*start)+1;
				System.out.print(arr2[i] + " ");
			}
			System.out.println();
			
		} catch(NullPointerException e) {
			System.out.println("배열 길이가 0입니다. 배열 길이를 잘 설정해 주세요.");
			e.printStackTrace();
		} catch(NegativeArraySizeException e) {
			System.out.println("배열 길이가 0보다 작습니다.");
			e.printStackTrace();
		} catch(RuntimeException e) {
			System.out.println("네 오류입니다.");
			e.printStackTrace();
		}
	}
	// solve_1
	public int random(int start, int count) {
		if(count <= 0) {
			throw new RuntimeException("random의 범위가 0보다 작습니다.");
		}
		int random = (int)(Math.random()*count)+start;
		return random;
	}
	// solve_2
	public int[] createArr(int size, int start, int count) {
		if(size < 0) {
			throw new RuntimeException("배열 길이가 0보다 작습니다.");
		}
		
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			// RuntimeException이 아닌 CheckedException 이었다면 이미 빨간 밑줄상태.
			arr[i] = random(start, count);
		}
		return arr;
	}
	// solve_3
	public void createArr(int arr[], int start, int count) {
		if(arr == null) {
			throw new RuntimeException("배열이 null입니다.");
		}
		if(arr.length <= 0) {
			throw new RuntimeException("배열의 길이가 0보다 작습니다");
		}
		for(int i=0; i<arr.length; i++) {
			arr[i] = random(start, count);
		}
	}
}
