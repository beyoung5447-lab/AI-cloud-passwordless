package ex3;

import ex1.Amain;

public class Ex3_Array {
	private int [] numArray;
	private int nn;
   
	
	public void createNumArray(int arrType) {
		if (arrType==1) {
			nn=10; 
			numArray= new int [] {100,200,300};
					
		} else {
			numArray= new int [] {1000,2000,3000};
		}
	}
	public void printNumArray() {
		System.out.println("NN => nn");
		for (int e : numArray) {
			System.out.println(e);
			
		}
	}
	public static void main(String[] args) {
		Ex3_Array ref = new Ex3_Array();
		ref.createNumArray(5);
		ref.printNumArray();
	}
	}
	
