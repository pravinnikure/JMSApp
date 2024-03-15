package com.app.pravin.jmsproducer.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;

import com.app.pravin.jmsproducer.services.ProducerService;

public class JmsRunner //implements CommandLineRunner {
{
	
	@Autowired
	private ProducerService service;
	
	
	
	//@Override
	//public void run(String... args) throws Exception {
	
	@Scheduled(cron = "*/10 * * * * *")  //Scheuled running after 10 seconds
	public void testRun() throws Exception {
	
	// TODO Auto-generated method stub
			service.sendMessage("Hello I am producer  " + new Date(System.currentTimeMillis()));
	}

}
