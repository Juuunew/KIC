import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// java.io.File
		// 파일이나 디렉토리 (없으면 생성의 목적 / 있으면 관리의 목적)
		
		// 디렉토리 - 절대 경로
		File f1 = new File("c:\\java");			// windows 표기법
		File f2 = new File("c:/java");			// unix 표기법
		
		// 파일 
		File f3 = new File("c:\\java\\text.txt");			// windows 표기법
		File f4 = new File("c:/java/text");			// unix 표기법
		
		// 상대 경로
		File f5 = new File("./java");			// windows 표기법
	}

}
