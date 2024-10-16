package jdbc_student;

public class Textest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date = "950404";
		
		String year = date.substring(0,2);
		String month = date.substring(2,4);
		String day = date.substring(4,6);
		
		String ymd = year + "-" + month +"-" +day;
		System.out.println(ymd);
	}

}
