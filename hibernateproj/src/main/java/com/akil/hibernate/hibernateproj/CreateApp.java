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
public class CreateApp 
{

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();

		song song1 = new song();

		song1.setId(3);
		song1.setSongName("Porkanda singam");
		song1.setArtist("Aniruth");

		session.beginTransaction();

		session.save(song1);

		session.getTransaction().commit();

		System.out.println("song saved... check db!......");

		session.close();
	}
}
