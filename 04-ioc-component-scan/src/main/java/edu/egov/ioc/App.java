package edu.egov.ioc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		String configLocation = "config.xml"; 
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Develop p = (Develop) context.getBean("develop");
		p.coding();
	}
}
