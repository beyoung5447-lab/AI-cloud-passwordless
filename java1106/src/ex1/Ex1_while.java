package ex1;

public class Ex1_while {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i); 
            i++;
        }
        
        System.out.println("--------------");
        
        i = 0;
        while (i < 10) { 
            if (i % 2 == 0) { 
                System.out.println(i + "짝");
            } else {
                System.out.println(i + "홀");
            }
            i++;
        }
        
        System.out.println("-----------");
            i =1;
            int sum = 0;
            while (i <= 10) {
            	sum += i;
                i++;
            }
            
            System.out.print("1부터 n까지의 합"+sum);
            
            
        	
    }
}