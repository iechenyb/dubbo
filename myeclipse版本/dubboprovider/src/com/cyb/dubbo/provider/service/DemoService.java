package com.cyb.dubbo.provider.service;

import java.util.List;

import com.cyb.dubbo.provider.service.impl.User;

public interface DemoService {

	String sayHello(String name);

	public List<User> getUsers();

}