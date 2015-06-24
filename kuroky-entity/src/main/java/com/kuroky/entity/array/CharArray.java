package com.kuroky.entity.array;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="13585604986";

		char[] b=a.toCharArray();
		int[] c=new int[b.length];
		for(int i=0;i<b.length;i++){
			//
			c[i]=Integer.parseInt(String.valueOf(b[i])) ;
		}
		for(int m: c){
			System.out.println(m);
		}
	}

}
