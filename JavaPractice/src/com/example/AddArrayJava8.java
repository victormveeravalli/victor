package com.example;

import java.util.Arrays;

public class AddArrayJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {22,33,44,55,66,77,88,99};
int sum=Arrays.stream(a).sum();
System.out.println("sum of elements in array is  :::  "+ sum);

	}

}
