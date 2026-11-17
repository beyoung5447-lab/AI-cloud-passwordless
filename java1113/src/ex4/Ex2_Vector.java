package ex4;

import java.util.Vector;  

public class Ex2_Vector {
    private Vector v;
    
    public Ex2_Vector() {
        v = new Vector();
        v.add("Test");
        v.add(10.45f);
        v.add('A');
        v.add(20.11);
        v.add(true);
        v.add(100L); 
        System.out.println("사이즈:" + v.size()); 
    }

    public void printVector() {
        for (Object e : v) { 
            String types = ""; 
            char cc = ' ';     
            
            if (e instanceof String) {
                types = "String";
                cc = ((String) e).charAt(0); 
            } else if (e instanceof Float) {
                types = "Float"; 
            } else if (e instanceof Character) {
                types = "Character";
            } else if (e instanceof Double) {
                types = "Double";
            } else if (e instanceof Boolean) {
                types = "Boolean";
            } else if (e instanceof Long) {
                types = "Long";
            }
            
            System.out.println(e);
            System.out.println("-----------------");
            System.out.println(types + " => " + e);
            
            if (e instanceof String) {
                System.out.println("String 첫 글자: " + cc);
            }
        }
    } 

    public static void main(String[] args) {
        Ex2_Vector ref = new Ex2_Vector();
        System.out.println(ref.v.size());
        ref.printVector();
    }
}