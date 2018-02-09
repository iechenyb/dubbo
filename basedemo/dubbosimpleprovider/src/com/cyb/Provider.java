package com.cyb;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext(
                new String[] {"/applicationContext.xml"});
        context.start();
        System.in.read(); // press any key to exit
    }
}
