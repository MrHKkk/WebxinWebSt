package com.kd.app.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.kd.app.web.service.IEventDAO;

@ContextConfiguration(locations = { "classpath*:applicationCtx.xml" })
public class HibernateTest extends AbstractJUnit4SpringContextTests{

	@Resource(name = "eventDAO")
	public IEventDAO event;
	
	@Test
	public void testFindEvent() {
		event.findEvent();
	}
}
