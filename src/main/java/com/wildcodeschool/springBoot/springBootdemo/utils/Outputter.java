package com.wildcodeschool.springBoot.springBootdemo.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wildcodeschool.springBoot.springBootdemo.entities.Wilder;
import com.wildcodeschool.springBoot.springBootdemo.repository.WilderDao;


@Component
public class Outputter implements CommandLineRunner {

	private Logger LOG = LoggerFactory.getLogger("anabelle");
	
	@Autowired
	private WilderDao wilderDao;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 LOG.info("******************");
	        LOG.info("Objects in DB : " + wilderDao.count());

	        Wilder wilder1 = new Wilder("Erwan", "Geneve", "java");
	        LOG.info("******************");
	        LOG.info(wilder1 + " has been created !");
	        wilderDao.save(wilder1);
	        LOG.info(wilder1 + " has been saved !");
	        
	        Wilder wilder2 = new Wilder("Anabelle", "Baynard", "java");
	        LOG.info("******************");
	        LOG.info(wilder2 + " has been created !");
	        wilderDao.save(wilder2);
	        LOG.info(wilder2 + " has been saved !");

	       
	        Wilder tempUser = wilderDao.findById(2L).get(); 
	        LOG.info("******************");
	        LOG.info("Second wilder's firstName is " + tempUser.getFirstName());
	        LOG.info("Second wilder's lastName is " + tempUser.getLastName());
	        LOG.info("Second wilder's langage is " + tempUser.getLangage());

	        
	        LOG.info("******************");
	        LOG.info("Wilders in list are ");
	        for(Wilder myWilder : wilderDao.findAll()) {
	            LOG.info(myWilder.toString());
	        };

	        
	        wilderDao.deleteById(2L); 
	        LOG.info("******************");
	        LOG.info("Wilders in list are ");
	        for(Wilder myWilder : wilderDao.findAll()) {
	            LOG.info(myWilder.toString());
	        };
	    }      
	
}
