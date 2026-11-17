package ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex1_FileInputStream {
    public static void main(String[] args) {
        // 원본
        String path = "D:\\ictpass\\java\\test\\myExe.exe";
        // 사본
        String path1 = "D:\\ictpass\\java\\test\\myExe2.exe";
        File f = new File(path);
        System.out.println(f.exists());
        try (FileInputStream fis = new FileInputStream(path);
                // 사본쓰기
                FileOutputStream fos = new FileOutputStream(path1);) {
            int readNum = 0;// 이 변수에 1 바이트씩 저장하다가 -1이 되면 종료되도록 구현 -> readNum = fis.read()) != -1
            // fis.read() => 1바이트씩 파일에서 읽어오는 메서드
            // fos.writer(byteDate); => 1 바이트씩 파일에 작성해주는 메서드
            long start = System.currentTimeMillis();

            while ((readNum = fis.read()) != -1) {
                fos.write(readNum);
            }
            long end = System.currentTimeMillis();

            System.out.println(end - start);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}