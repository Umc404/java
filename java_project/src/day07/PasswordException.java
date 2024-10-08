package day07;

public class PasswordException extends IllegalArgumentException {
	
	private static final long serialVersionUID = 1L;
	
	public PasswordException(String message) {
		super(message); // 상위 폴더로 넘김.
	}
}
