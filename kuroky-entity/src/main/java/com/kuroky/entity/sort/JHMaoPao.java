package com.kuroky.entity.sort;

public class JHMaoPao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[]{29,31,18,41,86,78,63,25,17};
		JHMaoPao mp=new JHMaoPao();
		mp.sort(array);
	}
	public  void sort(int[] array){
		int xh=0;
		show(0,array);
		for(int i=0;i<array.length-1;i++){
			for(int j=0;j<array.length-1-i;j++){
				if (array[j]>array[j+1]){
					int tmp =array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
				}
				show(++xh,array);
			}
		}
	}
	public  void show(int xh,int[] array){
		System.out.print(xh);
		for(int i=0;i<array.length;i++){
			System.out.print(" "+array[i]+" ");
		}
		System.out.println();
	}

}
