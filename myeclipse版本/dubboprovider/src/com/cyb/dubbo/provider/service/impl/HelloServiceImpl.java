package com.cyb.dubbo.provider.service.impl;

import com.cyb.dubbo.provider.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayAnything(String name) {
		System.out.println("Hello ,"+name);
		return "Hello ,"+name;
	}
}
