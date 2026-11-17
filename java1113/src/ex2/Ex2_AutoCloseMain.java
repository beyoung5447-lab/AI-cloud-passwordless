package ex2;

public class Ex2_AutoCloseMain {
    public static void main(String[] args) {
        
        try (Ex2_AutoClose ref = new Ex2_AutoClose()) {
            ref.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}