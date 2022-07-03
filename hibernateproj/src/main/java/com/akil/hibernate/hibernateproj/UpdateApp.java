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
public class UpdateApp 
{
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();

		song song = session.get(song.class, 2);
		song.setId(2);
		song.setSongName("ADHEERA ADHEERA");
		song.setArtist("AR RAHMAN");

		session.beginTransaction();
		session.update(song);

		session.getTransaction().commit();
		System.out.println(" The data get updated successfully.....");

		session.close();

	}

}
