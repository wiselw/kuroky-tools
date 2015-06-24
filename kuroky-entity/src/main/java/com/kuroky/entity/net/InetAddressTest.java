package com.kuroky.entity.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InetAddress ip=InetAddress.getByName("www.baidu.com");
		System.out.println("是否可达："+ip.isReachable(5000));
		System.out.println(ip.getHostAddress());
		System.out.println(ip.getCanonicalHostName());
		InetAddress local=InetAddress.getByAddress(new byte[]{127,0,0,1});
		System.out.println("是否可达："+local.isReachable(5000));
		System.out.println(local.getHostAddress());
		//全限定域名
		System.out.println(local.getCanonicalHostName());
		
	}

}
