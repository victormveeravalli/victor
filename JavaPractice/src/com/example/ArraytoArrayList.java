package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraytoArrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6};
String s[]= {"a","b","c","d"};
//List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));



List<Integer> list = new ArrayList<Integer>();
Collections.addAll(list, Arrays.stream(a).boxed().toArray(Integer[]::new));

ArrayList<String> listarry = new ArrayList<>();
listarry.addAll(Arrays.asList(s));

//List<Integer> aertolist = Arrays.stream(a).collect(Collectors.toList());

//arraytoList=Arrays.asList(a) ;

	}
}
