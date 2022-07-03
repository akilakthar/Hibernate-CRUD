package com.akil.hibernate.test;

import org.hibernate.SessionFactory;

import com.akil.hibernate.utils.HibernateUtils;

public class Test {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		SessionFactory sessionFactory2 = HibernateUtils.getSessionFactory();

		if (sessionFactory == sessionFactory2) {
			System.out.println(" Two session factory are same");
		}
		System.out.println(sessionFactory + "-" + sessionFactory2);

	}
}
