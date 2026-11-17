package ex1;

import java.io.File;
import java.util.Arrays;

public class Ex2_File {
	private static void examStringLList(String path) {
		File f = new File(path);
		System.out.println(f.isDirectory());
		if (f.exists()) {
			String[] flist = f.list();
			System.out.println(Arrays.toString(flist));
			for (String e : flist) {
				System.out.println(e);
			}
		}
	}

	private static void examFileLList(String path) {
		File f = new File(path);
		System.out.println(f.isDirectory());
		if (f.exists()) {
			File[] flist = f.listFiles();
			System.out.println(Arrays.toString(flist));
			for (File e : flist) {
				// System.out.println(e);
				if (e.isDirectory()) {
					System.out.println(" 디렉토리" + e.getName());
				} else {

					System.out.println(" 파일" + e.getName());
				}
			}
		}
	}

	public static void main(String[] args) {
		String path = "src/ex1";
		// examStringLList(path);
		examFileLList(path);
		System.out.println("****************");

	}
}
