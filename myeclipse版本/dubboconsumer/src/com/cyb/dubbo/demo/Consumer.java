package com.cyb.dubbo.demo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyb.dubbo.provider.service.DemoService;
import com.cyb.dubbo.provider.service.HelloService;
import com.cyb.dubbo.provider.service.impl.User;
//http://www.cnblogs.com/softidea/p/5271886.html  dubbo-admin.war
public class Consumer {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		context.start();
		
		HelloService hellService = (HelloService) context.getBean("helloService");
		System.out.println(hellService.sayAnything("chenyb"));
		
		DemoService demoService = (DemoService) context.getBean("demoService");
		String hello = demoService.sayHello("tom");
		System.out.println(hello);

		List<User> list = demoService.getUsers();
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}		
		System.in.read();
	}

}