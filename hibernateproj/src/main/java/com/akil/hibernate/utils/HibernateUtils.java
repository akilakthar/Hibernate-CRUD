package com.akil.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.akil.hibernate.entity.song;

public class HibernateUtils {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {

		try {
			if (sessionFactory == null) {
				Configuration configuration = new Configuration();
				configuration.configure("hibernate.cfg.xml");
				configuration.addAnnotatedClass(song.class);

				// create the session factory
				sessionFactory = configuration.buildSessionFactory();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Session factory object is not created because of some issuues!!");
		}
		return sessionFactory;

	}

}
