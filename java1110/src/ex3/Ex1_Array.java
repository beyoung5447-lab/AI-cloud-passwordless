package ex3;

public class Ex1_Array {
    private static void test1() {
        int st1 = 1;
        int st2 = 2;
        int st3 = 100;
        int sti = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println(st1);
            System.out.println(st2);
            System.out.println("int st " + (i + i) + "=" + i);
            sti = i;
        }
        System.out.println(sti);
    }

    private static void test2() {
        // int[] intNum; // 많이 씀
        
        int[] intNum = {1, 2, 100};
        System.out.println("배열의 길이:" + intNum.length);
        System.out.println("첫번째 index 0의 값 =>" + intNum[0]);
        System.out.println("첫번째 index 1의 값 =>" + intNum[1]);
        System.out.println("첫번째 index 2의 값 =>" + intNum[2]);
        intNum[1] = 100;

        
        for (int i = 0; i < intNum.length; i++) {
            System.out.println("intNum[" + i + "] = " + intNum[i]);
        }
        for (int i : intNum) {
			System.out.println(i);
		}
    }

    public static void main(String[] args) {
        test2();
    }
}