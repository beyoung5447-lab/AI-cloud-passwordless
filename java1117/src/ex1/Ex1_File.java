package ex1;
import java.io.File;
import java.io.IOException;
public class Ex1_File {
	public static void main(String[] args) {
		String path = "src/ex1/demo.txt";
		File f = new File(path);
		System.out.println(f);
		System.out.println(f.exists()); 
		if (f.exists()) {
			System.out.println("파일 부존재");
			try {
				f.createNewFile();
				System.out.println("0바이트짜리 파일을 생성");
			} catch (IOException e) {
				
				e.printStackTrace();
				System.out.println("작성 권한이 없다 ->"+f.canWrite());
			}
		} else {
			System.out.println("파일 존재");
			System.out.println("파일 인가?"+f.isFile());
			System.out.println("실행 가능?"+f.canExecute());
			System.out.println("작성이 가능?"+f.canWrite());
			System.out.println("절대 경로"+f.getAbsolutePath());
			System.out.println("파일 이름"+f.getName());
			System.out.println("디렉토리냐?"+f.isDirectory());
			System.out.println("파일의 길이"+f.length());
		}

	}
}
