package com.sample;

import java.util.concurrent.TimeUnit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Country;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		Configuration configuration = new Configuration();
		configuration.configure("com/cfgs/hibernate.cfg.xml");
		
		SessionFactory factory=configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		Country country=session.get(Country.class, "IND");
		System.out.println(country);
		
		TimeUnit.MINUTES.sleep(1);
		Country country1=session.get(Country.class, "BRT");
		
		
		
		System.out.println(country1);

		session.close();
		factory.close();
	}

}
