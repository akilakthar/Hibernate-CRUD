package com.akil.hibernate.hibernateproj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.akil.hibernate.entity.song;
import com.akil.hibernate.utils.HibernateUtils;

/**
 * created by akil
 *
 */
public class DeleteApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		Session session = sessionFactory.openSession();

		// load the object to delete

		song song = session.get(song.class, 2);

		session.beginTransaction();
		// deleting the object.....

		session.delete(song);

		session.getTransaction().commit();

		System.out.println(" The data get deleted successfully.....");

		session.close();

	}

}
