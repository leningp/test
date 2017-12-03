package com.lenin.test;

import java.util.function.BiConsumer;

public class ExceptionLambda {
	
	
	
	public static void main(String[] str) {
		 int a[] = {1,3,7,9};
			int x = 2;
		process(a,x,(k,v)->System.out.println(k/v)) ;
		
	}
	
	public  static void process(int[] a, int x, BiConsumer<Integer,Integer> consumer){
      for(int i : a) {
		consumer.accept(i,x);
		
      }

	}
	

}
