package ex2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//ProxyFactoryBean : AOP를 관리해주는 Factory객체
//AOP 인터셉터 객체
// before advice - after advice - Around
// @Component - Spring이 객체로 만들어주는 일반 Bean
@Aspect
@Component
public class AopAdvice {
    // Around Advice - joinpoint객체가 반드시 메서드의 인자로 선언해야 한다.****
    @Around("execution(* ex2.DaoImple.first*(..))") // (..) -> overloading 다 해줌 없다면 매개변수가 없는애들만 찾음
    public String checkTime(ProceedingJoinPoint pjp) throws Throwable {// ProceedingJoinPoint 생략불가 공부하기**
        long start = System.currentTimeMillis();
        // target 객체의 메서드를 호출 - 여기서는 first() 호출
        // firstStatementTest() 호출될 때 적용될 공통 코드들..
        String res = (String) pjp.proceed();
        long end = System.currentTimeMillis();
        System.out.println("수행 된 속도 :" + (end - start) + "초");
        return res;
    }

}