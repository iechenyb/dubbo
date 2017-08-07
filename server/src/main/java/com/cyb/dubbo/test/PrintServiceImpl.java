package com.cyb.dubbo.test;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.dubbo.config.annotation.Service;
/**
 *作者 : iechenyb<br>
 *类描述: 说点啥<br>
 *创建时间: 2017年8月7日
 */
@Service(version = "1.9.9")
public class PrintServiceImpl implements PrintService{
	Log log = LogFactory.getLog(PrintServiceImpl.class);

	@Override
	public String print(String str) {
		log.info(str);
		return str;
	}
}
