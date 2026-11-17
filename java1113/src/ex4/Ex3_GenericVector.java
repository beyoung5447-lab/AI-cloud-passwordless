package ex4;

import java.util.Vector;

public class Ex3_GenericVector {
    private Vector<Integer> v; 

    public Ex3_GenericVector() {
        v = new Vector<Integer>(); 
        int num = 10;
        v.add(num);
        double dnum = 11.8;
        v.add((int) dnum);
        for (Integer e : v) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Ex3_GenericVector ref = new Ex3_GenericVector();
    }
}