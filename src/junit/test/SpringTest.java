package junit.test;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.service.PersonService;
import cn.itcast.service.PersonService2;
   

public class SpringTest {

	private static final String String = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void instanceSpring() {
//		ItcastClassPathXMLApplicationContext ctx = new ItcastClassPathXMLApplicationContext("beans.xml");
//		PersonService personService = (PersonService)ctx.getBean("personService");
//		System.out.println(personService1==personService2);
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		PersonService personService = (PersonService)ctx.getBean("personService");
//		personService.save();
//		ctx.close();
//		ItcastClassPathXMLApplicationContext ctx = new ItcastClassPathXMLApplicationContext("beans.xml");
//		PersonService personService =D (PersonService)ctx.getBean("personService");
//		PersonService2 personService = (PersonService2)ctx.getBean("personServiceBean2");
		PersonService2 personService = (PersonService2)ctx.getBean("personService");
//		PersonService2 personService2 = (PersonService2)ctx.getBean("personService");
//      System.out.println("Set");
//		for(String value : personService.getSets()){
//			System.out.println(value);
//		}
//		System.out.println("List");
//		for(String value : personService.getLists()){
//			System.out.println(value);
//		}
//		System.out.println("properties");      //keySet() 方法特别重要
//		for(Object key : personService.getProperties().keySet()){
//			System.out.println(key+"="+ personService.getProperties().getProperty((String)key));
//		}
//		System.out.println("maps");
//		for(Object key : personService.getMaps().keySet()){
//			System.out.println(key+"="+ personService.getMaps().get(key));
//		}
//		System.out.println(personService.equals(personService2));
//		personService.save();
		ctx.close();
	}	
}
