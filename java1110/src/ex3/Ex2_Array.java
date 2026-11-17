package ex3;

public class Ex2_Array {
    
    public static void main(String[] args) {
        
        inType();
    }

    private static void inType() {
        
        int[] numArr = {113, 123, 132};
        int n = 300;
        
        
        printNumArray(numArr, n);
        
        System.out.println("intType 일반변수 " + n); 
        
        System.out.println("--- main/inType에서 확인하는 배열 ---");
        for (int i : numArr) {
            System.out.println(i); 
        }
    }

    public static void printNumArray(int[] numArr, int n) {
        n = 500;         
        numArr[0] = 112; 
        
        System.out.println("printNumArray 일반 변수 " + n); 
        System.out.println("printNumArray의 배열 출력");
        for (int i : numArr) {
            System.out.println(i);
        }
    }
}