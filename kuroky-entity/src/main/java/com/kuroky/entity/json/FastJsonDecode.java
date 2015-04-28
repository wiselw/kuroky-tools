package com.kuroky.entity.json;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class FastJsonDecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arrayjson="[{\"id\":3,\"name\":\"root\"},{\"id\":2,\"name\":\"guest\"}]";
		List<User> users =JSON.parseObject(arrayjson, new TypeReference<List<User>>(){});
		System.out.println("size:"+users.size());
		
		String strjson="{\"id\":0,\"name\":\"admin\",\"users\":[{\"id\":2,\"name\":\"guest\"},{\"id\":3,\"name\":\"root\"}]}";
		Group group=JSON.parseObject(strjson, Group.class);
		System.out.println("size:"+group.getUsers().size());
	}

}
