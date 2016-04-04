package com.kd.app.web.service.impl;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kd.app.web.service.IEvent;

public class EventImpl extends HibernateDaoSupport implements IEvent{

	@Autowired
	public void setSessionFactory0(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
	public void findEvent() {
		getHibernateTemplate().executeWithNativeSession(new HibernateCallback<Object>() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("from EventDTO as obj");
				logger.info(query.list());
				return null;
			}
			
		});
	}
}
