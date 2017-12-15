package com.cyb.impl;

import org.springframework.beans.factory.InitializingBean;

import com.cyb.dubbo.test.HelloService;

public class HelloServiceImpl implements HelloService,InitializingBean {
	private int i = 0;

	@Override
	public String sayHello(String word) {
		System.out.println("服务端被调用->"+ i );
		String result =  "Hello ".concat(word).concat(" ->").concat(String.valueOf(i));
		i ++;
		return result;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Server is ready, now.");
	}

}
