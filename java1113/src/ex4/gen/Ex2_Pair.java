package ex4.gen;

public class Ex2_Pair<K, V> {
    private final K key;
    private final V value;

    
    public Ex2_Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Ex2_Pair<Integer, String> student1 = new Ex2_Pair<>(1, "테스형");
        
        Ex2_Pair<Integer, String> student2 = new Ex2_Pair<>(2, "홍길동");

        System.out.println(student1.getKey() + ":" + student1.getValue());
        System.out.println(student2.getKey() + ":" + student2.getValue());
    }
}