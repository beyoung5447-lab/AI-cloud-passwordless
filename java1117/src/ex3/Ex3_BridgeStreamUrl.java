package ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

// InputStreamReader[Bridge] : byte -> Bridge -> Character 로 변환
public class Ex3_BridgeStreamUrl {
	public static void main(String[] args) {
		String urlpath = "https://ictedu.co.kr/index_new.php?main_page=teacher&place=";

		// try-with-resources를 사용하여 예외 발생 시에도 스트림이 안전하게 닫히도록 처리
		try (InputStream is = URI.create(urlpath).toURL().openStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"))) {

			String readV = null;
			while ((readV = br.readLine()) != null) {
				System.out.println(readV);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}