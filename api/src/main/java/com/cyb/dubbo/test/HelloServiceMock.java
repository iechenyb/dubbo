package com.cyb.dubbo.test;

import com.cyb.dubbo.test.HelloService;
/**
 * 当provider异常，且mock=true时
 * ，可以通过该类进行异常回调。
 * @author DHUser
 *
 */
public class HelloServiceMock implements HelloService {
	@Override
	public String sayHello(String word) {
		return "调用异常啦！";
	}
}
