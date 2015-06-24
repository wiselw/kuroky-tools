package com.kuroky.entity.array;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
	public static void show(String[] array){
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args){
		String[] a={"1","3","6","23","11","7"};
		//show(a);
		Arrays.sort(a, Collections.reverseOrder());
		show(a);
	}

}
