package com.cyb.dubbo.test;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
/**
 *���� : iechenyb<br>
 *������: ˵��ɶ<br>
 *����ʱ��: 2017��8��7��
 */
@Component
public class DefService2 {
	Log log = LogFactory.getLog(DefService2.class);
	@Reference(version = "1.9.8")
	PrintService service;
}
