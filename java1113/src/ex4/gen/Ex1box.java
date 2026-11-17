package ex4.gen;

public class Ex1box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Ex1box<String> ref = new Ex1box<String>();
        ref.setValue("테스형");
        
        Ex1box<String> ref2 = new Ex1box<String>();
        ref2.setValue("100"); 
        
        System.out.println(ref.getValue());
        System.out.println(ref2.getValue());
    }
}