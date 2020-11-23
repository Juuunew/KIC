import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class FileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//File f1 = new File("c:\\java");
		//File f1 = new File("c:\\java\\test.txt");		// 있음
		File f1 = new File("c:\\java\\test1.txt");		// 없음
		
		// 유무
		if( f1.exists() ) {
			System.out.println( "있음" );
		} else {
			System.out.println( "없음" );
		}
		
		// 디렉토리 생성 / 파일 생성
		File f2 = new File("c:\\java\\dir1");
		
		// make directory
		if( f2.mkdir() ) {
			System.out.println( "생성 완료" );
		}
		
		File f3 = new File("c:\\java\\text2.txt");
		try {
			if ( f3.createNewFile() ) {
				System.out.println( "생성 완료" );
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println( f3.getName() );
		System.out.println( f3.getParent() );
		System.out.println( f3.getPath() );
		
		
		// canExecute / canRead / canWrite
		// isHidden
		// isAbsolute
		
		if( f3.isHidden() ) {
			System.out.println( "숨김파일 입니다." );
		} else {
			System.out.println( "일반파일 입니다." );			
		}

		// length()
		// lastModified()
		
		File f4 = new File("c:\\java\\java.7z");
		long filesize = f4.length();
		System.out.println( filesize + " byte" );
		System.out.println( filesize/1024. + " Kbyte" );		// /1024 뒤에 점 을 찍어줘야 실수화가 됨
		
		// API
		long fileDate = f3.lastModified();
		Date date = new Date( fileDate );
		System.out.println( date.toLocaleString() );
	}

}
