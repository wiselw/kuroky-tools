package com.kuroky.entity.json;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private long id;
	private List<User> users =new ArrayList<>();
	private String     name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	

}
