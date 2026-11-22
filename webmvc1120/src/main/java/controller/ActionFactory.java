package controller;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import model.Action;

// ActionFactory : 원래 Controller가 하던 역할을
// 서비스가 종료되는 것을 방지하고, 책임을 분리하는 역할을 수행
// 객체를 생성하고 반환 즉 공장과 같은 역할을 수행 - ObjectFactoryPattern이다.
public class ActionFactory {
	private static ActionFactory factory;
	private Properties prop;
	private String path;

	private ActionFactory() {
		prop = new Properties();
		// 로컬 테스트용 경로 (운영/배포 환경에서는 classpath 또는 WEB-INF 경로 사용 권장)
		path = "D:\\ictpass\\backend\\workspace1\\webmvc1120\\src\\main\\java\\controller\\classinfo.properties";
	}

	// synchronized : Thread 동기화 => 다른 스레드의 간섭을 받지 않게 설정
	public synchronized static ActionFactory getInstance() {
		if (factory == null) {
			factory = new ActionFactory();
		}
		return factory;
	}

	// Controller에 의해서
	// ictpass.ict?cmd=hello or ictpass.ict?cmd=bpang
	public Action getAction(String cmd) {
		Action ref = null;

		try (FileReader fr = new FileReader(path)) {
			prop.load(fr);

			// cmd가 null일 경우 prop.getProperty(null, ...)에서 NullPointerException이 발생할 수 있으므로 방어 처리
			String cmdPath = (cmd != null) ? prop.getProperty(cmd, "model.HelloAction") : "model.HelloAction";

			Class<?> handler = Class.forName(cmdPath);
			// 오타 수정: getDeclaredConstructorS() -> getDeclaredConstructor()
			Constructor<?> ct = handler.getDeclaredConstructor();
			ref = (Action) ct.newInstance();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException
				| IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}

		return ref;
	}
}