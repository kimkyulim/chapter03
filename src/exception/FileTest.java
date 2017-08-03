package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {
public static void main(String[] args) {
	FileInputStream fis=null;
	try {
		 fis = new FileInputStream("./hello.txt");
		int data  = fis.read();
	} catch (FileNotFoundException|NullPointerException e) {
		System.out.println("파일이 없습니다.:"+e);
		e.printStackTrace();
	}catch(IOException e) {
		System.out.println("파일 읽기 실패 : "+e);
	}
	
//	}catch(Exception e) {//예외처리 중 최고 부모 
	//	
	//}
	
	
	finally {
		try {
			
			fis.close();
		}catch(IOException e ) {
			e.printStackTrace();
		}
	}

}
}
