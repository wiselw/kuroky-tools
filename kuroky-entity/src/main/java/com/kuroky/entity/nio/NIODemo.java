package com.kuroky.entity.nio;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class NIODemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testIntBuffer();
		BufferSon();
	}
	
	public static void BufferSon(){
		//子缓冲区
		ByteBuffer buffer=ByteBuffer.allocate(10);
		for(int i=0;i<buffer.capacity();++i){
			buffer.put((byte)i);
		}
		buffer.position(3);
		buffer.limit(7);
		ByteBuffer slice=buffer.slice();
		for(int i=0;i<slice.capacity();++i){
			byte b=slice.get(i);
			b*=10;
			slice.put(i, b);
		}
		buffer.flip();
		while(buffer.hasRemaining()){
			System.out.println( buffer.get() );  
		}
		
	}
	
	
	public static void testIntBuffer(){
		IntBuffer buffer=IntBuffer.allocate(8);
		for(int i=0;i<buffer.capacity();++i){
			int j=2*(i+1);
			// 将给定整数写入此缓冲区的当前位置，当前位置递增  
			buffer.put(j);
		}
		System.out.println(buffer.remaining());
		// 重设此缓冲区，将限制设置为当前位置，然后将当前位置设置为0 
		buffer.flip();
		System.out.println(buffer.remaining());
		// 查看在当前位置和限制位置之间是否有元素  
		while(buffer.hasRemaining()){
			// 读取此缓冲区当前位置的整数，然后当前位置递增 
			
			int j=buffer.get();
			System.out.print(j + "  ");
		}
	}

}
