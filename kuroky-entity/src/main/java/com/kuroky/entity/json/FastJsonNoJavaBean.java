package com.kuroky.entity.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class FastJsonNoJavaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arrayjson="[{\"id\":3,\"name\":\"root\"},{\"id\":2,\"name\":\"guest\"}]";
		JSONArray ja=JSON.parseArray(arrayjson);
		JSONObject jo=ja.getJSONObject(0);
		System.out.println("size:"+ja.size());
		System.out.println("id:"+jo.getLongValue("id"));
		System.out.println("name:"+jo.getString("name"));
		
	}

}
