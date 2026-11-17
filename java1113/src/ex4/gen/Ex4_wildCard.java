package ex4.gen;

import java.util.List;

public class Ex4_wildCard {
    
    public static void printAll(List<?> values) {
        for (Object e : values) {
            System.out.println(e);
        }
    }

    // Numbers -> Number로 수정, 세미콜론 추가
    public static double sum(List<? extends Number> values) {
        double result = 0;
        for (Number e : values) {
            result += e.doubleValue(); 
        }
        return result;
    }

    public static void main(String[] args) {
        // printALL -> printAll (소문자 ll)로 수정
        printAll(List.of("A", "B"));
        
        // Listof. -> List.of 로 수정
        System.out.println(sum(List.of(10, 20, 30)));
    }
}