package com.kuroky.entity.json;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class FastJsonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group group=new Group();
		group.setId(0L);
		group.setName("admin");
		User guestUser = new User();
		guestUser.setId(2L);
		guestUser.setName("guest");

		User rootUser = new User();
		rootUser.setId(3L);
		rootUser.setName("root");

		group.getUsers().add(guestUser);
		group.getUsers().add(rootUser);

		String jsonString = JSON.toJSONString(group);

		System.out.println(jsonString);
		
		List<User> users=new ArrayList<>();
		users.add(rootUser);
		users.add(guestUser);
		String jsonString1 = JSON.toJSONString(users);

		System.out.println(jsonString1);
	}

}
