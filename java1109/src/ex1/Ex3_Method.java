package ex1;

public class Ex3_Method {
    public static void main(String[] args) {
        String hello = "안녕하세요";
        String msg = createMsg(hello);
        System.out.println(msg); 
        int res = add(10,10);
        System.out.println(res);
        char ch = Slicechr(hello);
    }

    
    private static char Slicechr(String hello) {
		
		return hello.charAt(0);
	}


	public static String createMsg(String hello) {
        return hello + "*";
        
      
    }
    public static int add(int a, int b) {
 	   int result = a+b; 
 	   return result;
 	   
    }
}