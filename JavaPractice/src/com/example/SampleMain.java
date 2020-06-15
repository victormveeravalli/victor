package com.example;

public class SampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{1,2,3},{4,5,6},{7,8,9}};

sendArray(a);

	}

	private static void sendArray(int[][] a) {
		// TODO Auto-generated method stub
		 System.out.println("Elements are :");
		 
	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[i].length; j++) {
	                System.out.print(a[i][j] + "\t");
	            }	
	            System.out.println("");
	        }
	}

}
