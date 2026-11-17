package ex1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Ex2_TreeSet {
    public static void main(String[] args) {
        
        TreeSet<Integer> h1 = new TreeSet<>();
        h1.add(10);
        h1.add(5);
        h1.add(20);
        h1.add(3);
        h1.add(7);
        
        System.out.println("=== TreeSet 기본 (오름차순) ===");
        System.out.println("크기: " + h1.size());
        System.out.println("요소 출력: " + h1.toString()); // 자동으로 정렬됨 [3, 5, 7, 10, 20]
        
        System.out.println("-------- foreach ------");
        for (int num : h1) {
            System.out.print(num + "\t");
        }
        System.out.println("\n");

        System.out.println("------- Iterator (오름차순) -----------");
        Iterator<Integer> it = h1.iterator();
        while (it.hasNext()) {
            int num = it.next();
            System.out.print(num + " ");
        }
        System.out.println("\n");

        
        System.out.println("--------- 내림차순 (descendingSet) -------------");
        NavigableSet<Integer> h2 = h1.descendingSet();
        System.out.println("크기: " + h1.size());
        System.out.println("첫번째 요소 (가장 큰 값): " + h2.first());
        System.out.println("마지막 요소 (가장 작은 값): " + h2.last());
        
        System.out.println("--- 내림차순 foreach ---");
        for (Integer num : h2) {
            System.out.print(num + "\t");
        }
        System.out.println();

        System.out.println("------------ 내림차순 Iterator --------");
        Iterator<Integer> itv = h2.iterator();
        while (itv.hasNext()) {
            int num = itv.next();
            System.out.print(num + " ");
        }
        System.out.println("\n");

        
        System.out.println("------ LinkedHashSet 예제 ------");
        LinkedHashSet<String> h3 = new LinkedHashSet<String>();
        h3.add("ztest");
        h3.add("Btest");
        h3.add("Atest");
        h3.add("Ctest");
        h3.add("Btest"); 
        h3.add("Ktest");
        h3.add("Ktest"); 
        h3.add("Ktest"); 

        System.out.println("----------- foreach (입력 순서 유지) ---------");
        for (String str : h3) {
            System.out.println(str);
        }

        System.out.println("--------- Iterator --------");
        Iterator<String> itStr = h3.iterator();
        while (itStr.hasNext()) {
            String str = itStr.next();
            System.out.println(str);
        }
    }
}