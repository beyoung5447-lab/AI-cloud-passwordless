package ex5;

public abstract class Ex2_Person { // 'abstract' 키워드 추가
    public Ex2_Person ( ) {
        System.out.println("Ex2_Person => 생성자");
    }
    
    public abstract void wake();
}
