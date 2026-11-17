package ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex2_Exception {
public static void main(String[] args) {
	String path = "D:\\ictpass\\java\\workspace\\java1113\\src\\ex1\\msg.txt";
	FileInputStream fis = null; 
	try {
		fis = new FileInputStream(path);
		System.out.println("파일을 ");
		System.out.println((char)fis.read());
		//fis.close(); 자원 해제 X
	} catch (FileNotFoundException e) {
		  
		//e.printStackTrace();
		System.out.println("파일이 존재 하지 않습니다");
	} catch (IOException e) {
		
		System.out.println("장치에 문제 발생 해서 파일 읽기를 실패!!");
	} catch (Exception e) {
		System.out.println("예외가 발생!");
	}  finally {
		try {
			if(fis !=null) {fis.close();
			System.out.println("자원이 무조건 해제 됨");}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
}
}
