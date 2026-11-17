package ex1;

import java.io.File;
import java.util.Arrays;

public class Ex3_FileMkdir {
	private static void showPath(String orfile) {
		File f = new File(orfile);
		File[] list = f.listFiles();

		for (File e : list) {
			if (e.isDirectory()) {
				System.out.println(" 디렉토리" + e.getName());
			} else {

				System.out.println(" 파일" + e.getName());
			}

		}
	}

	public static void main(String[] args) {
		String oripath = "D:\\ictpass\\";
		String path = oripath + "myspace\\work\\aaa";
		File f1 = new File(path);
		if (!f1.exists()) {
			System.out.println("해당 경로가 존재 않습니다. 그래서 만들겠습니다");
			f1.mkdirs();
			showPath(path);

		} else {
			System.out.println("이미 존재 하는 경로");
			showPath(oripath);
		}
	}
}
