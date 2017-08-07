package com.cyb.dubbo.test;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
/**
 *作者 : iechenyb<br>
 *类描述: 说点啥<br>
 *创建时间: 2017年8月7日
 */
@Component
public class DefService2 {
	Log log = LogFactory.getLog(DefService2.class);
	@Reference(version = "1.9.8")
	PrintService service;
}
