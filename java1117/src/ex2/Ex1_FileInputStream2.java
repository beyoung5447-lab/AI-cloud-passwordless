package ex2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex1_FileInputStream2 {
	public static void main(String[] args) {


		String path = "D:\\ictpass\\java\\test\\myExe.exe";
		String path1 = "D:\\ictpass\\java\\test\\myExe2.exe";
		File f = new File(path);
		System.out.println(f.exists());
		//BufferedInputStream bis = new BufferedInputStream(1차스트림 생성)
		try (//FileInputStream fis = new FileInputStream(path);
				//FileOutputStream fos = new FileOutputStream(path1);
				BufferedInputStream bis= new BufferedInputStream(new FileInputStream(path));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path1));
				) {
			int readNum = 0;
			long start = System.currentTimeMillis();

			while ((readNum = bis.read()) != -1) {
				bos.write(readNum);
			}
			long end = System.currentTimeMillis();

			System.out.println(end - start);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
