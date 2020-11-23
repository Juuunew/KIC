import java.io.IOException;

public class ExceptionEx01 {

	public static void main(String[] args) {
		// 선언
		ProcessBuilder processBuilder = null;
		
		// 초기화
		try {
			processBuilder = new ProcessBuilder( "C:\\Program Files\\Internet Explorer\\iexplore" );
			processBuilder.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
